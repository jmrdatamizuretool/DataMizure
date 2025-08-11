package com.jmr.batch.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.step.skip.AlwaysSkipItemSkipPolicy;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.jmr.batch.entity.loan.TransCltbAcCompUpload;
import com.jmr.batch.entity.signatures.TransSvtmCifSigMasterUpload;
import com.jmr.batch.listener.BlankLineRecordSeparatorPolicy;
import com.jmr.batch.listener.StepResultListener;
import com.jmr.batch.model.loan.TransCltbAcCompUploadModel;
import com.jmr.batch.model.signatures.TransSvtmCifSigMasterUploadModel;
import com.jmr.batch.processor.signatures.FirstItemProSvtmCifSigMasterUpload;
import com.jmr.framework.service.CommonService;

@Configuration
@EnableBatchProcessing
public class BatchConfigSignatures {
	@Autowired
	@Qualifier("entityManagerFactory")
	private EntityManagerFactory entityManagerFactory;
	@Autowired
	@Qualifier("datasource")
	private DataSource datasource;
	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	@Autowired
	private StepResultListener stepResultListener;
	@Autowired
	private FirstItemProSvtmCifSigMasterUpload firstItemProSvtmCifSigMasterUpload;
	@Autowired
	private CommonService commonService;
	/** 1. SVTM_CIF_SIG_MASTER_UPLOAD */
	@Bean
	public Job svtmcifsigmasterupload() {
		return jobBuilderFactory.get("svtmcifsigmasterupload").incrementer(new RunIdIncrementer())
				.start(svtmCifSigMasterUploadChunkStep()).build();
	}

	private Step svtmCifSigMasterUploadChunkStep() {
		return stepBuilderFactory.get("TRANS_SVTM_CIF_SIG_MASTER_UPLOAD")
				.<TransSvtmCifSigMasterUploadModel, TransSvtmCifSigMasterUpload>chunk(100)
				.reader(flatFileItemReaderSvtmCifSigMasterUpload()).processor(firstItemProSvtmCifSigMasterUpload)
				.writer(jpaItemWriterSvtmCifSigMasterUpload()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy())
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransSvtmCifSigMasterUploadModel> flatFileItemReaderSvtmCifSigMasterUpload() {
		FlatFileItemReader<TransSvtmCifSigMasterUploadModel> flatFileItemReader = new FlatFileItemReader<TransSvtmCifSigMasterUploadModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_SVTM_CIF_SIG_MASTER_UPLOAD");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSvtmCifSigMasterUploadModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("CIF_ID", "CIF_SIG_ID", "BRANCH", "CIF_SIG_NAME", "CIF_SIG_TITLE", "SPECIMEN_NO",
								"SPECIMEN_SEQ_NO", "SIG_TEXT", "SIGNATURE", "EXT_FNAME", "SIGN_IMG");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSvtmCifSigMasterUploadModel>() {
					{
						setTargetType(TransSvtmCifSigMasterUploadModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());
		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransSvtmCifSigMasterUpload> jpaItemWriterSvtmCifSigMasterUpload() {
		JpaItemWriter<TransSvtmCifSigMasterUpload> jpaItemWriter = new JpaItemWriter<TransSvtmCifSigMasterUpload>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
}
