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

import com.jmr.batch.entity.casabalance.TransDetbUploadDetailCasabal;
import com.jmr.batch.entity.casabalance.TransDetbUploadMasterCasabal;
import com.jmr.batch.listener.BlankLineRecordSeparatorPolicy;
import com.jmr.batch.listener.StepResultListener;
import com.jmr.batch.model.casabalance.TransDetbUploadDetailCasabalModel;
import com.jmr.batch.model.casabalance.TransDetbUploadMasterCasabalModel;
import com.jmr.batch.processor.casabalance.FirstItemProDetbUploadDetailCasabal;
import com.jmr.batch.processor.casabalance.FirstItemProDetbUploadMasterCasabal;
import com.jmr.framework.service.CommonService;

@Configuration
@EnableBatchProcessing

public class BatchConfigCasabalance {
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
	private FirstItemProDetbUploadMasterCasabal firstItemProDetbUploadMasterCasabal;

	@Autowired
	private FirstItemProDetbUploadDetailCasabal firstItemProDetbUploadDetailCasabal;
	@Autowired
	private CommonService commonService;
	/** 1. TRANS_DETB_UPLOAD_MASTER_CASABAL */
	@Bean
	public Job detbuploadmastercasabal() {
		return jobBuilderFactory.get("detbuploadmastercasabal").incrementer(new RunIdIncrementer())
				.start(detbUploadMasterCasabalChunkStep()).build();

	}
	private Step detbUploadMasterCasabalChunkStep() {
		return stepBuilderFactory.get("TRANS_DETB_UPLOAD_MASTER_CASABAL")
				.<TransDetbUploadMasterCasabalModel, TransDetbUploadMasterCasabal>chunk(100)
				.reader(flatFileItemReaderDetbUploadMasterCasabal()).processor(firstItemProDetbUploadMasterCasabal)
				.writer(jpaItemWriterDetbUploadMasterCasabal()).faultTolerant().skip(Throwable.class)
				.skip(Throwable.class).skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransDetbUploadMasterCasabalModel> flatFileItemReaderDetbUploadMasterCasabal() {
		FlatFileItemReader<TransDetbUploadMasterCasabalModel> flatFileItemReader = new FlatFileItemReader<TransDetbUploadMasterCasabalModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_DETB_UPLOAD_MASTER_CASABAL");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransDetbUploadMasterCasabalModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("BRANCH_CODE", "SOURCE_CODE", "BATCH_NO", "TOTAL_ENTRIES", "UPLOADED_ENTRIES",
								"BALANCING", "BATCH_DESC", "MIS_REQUIRED", "AUTO_AUTH", "GL_OFFSET_ENTRY_REQD",
								"UDF_UPLOAD_REQD", "OFFSET_GL", "TXN_CODE", "DR_ENT_TOTAL", "CR_ENT_TOTAL", "USER_ID",
								"UPLOAD_STAT", "JOBNO", "SYSTEM_BATCH", "POSITION_REQD", "MAKER_ID", "MAKER_DT_STAMP",
								"CHECKER_ID", "CHECKER_DT_STAMP", "MOD_NO", "AUTH_STAT", "RECORD_STAT", "ONCE_AUTH",
								"UPLOAD_DATE", "UPLOAD_FILE_NAME", "IGNORE_OVERRIDES");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransDetbUploadMasterCasabalModel>() {
					{
						setTargetType(TransDetbUploadMasterCasabalModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;

	}

	@Bean
	public JpaItemWriter<TransDetbUploadMasterCasabal> jpaItemWriterDetbUploadMasterCasabal() {
		JpaItemWriter<TransDetbUploadMasterCasabal> jpaItemWriter = new JpaItemWriter<TransDetbUploadMasterCasabal>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 2. TRANS_DETB_UPLOAD_DETAIL_CASABAL */
	@Bean
	public Job detbuploaddetailcasabal() {
		return jobBuilderFactory.get("detbuploaddetailcasabal").incrementer(new RunIdIncrementer())
				.start(detbUploadDetailCasaBalChunkStep()).build();
	}

	private Step detbUploadDetailCasaBalChunkStep() {
		return stepBuilderFactory.get("TRANS_DETB_UPLOAD_DETAIL_CASABAL")
				.<TransDetbUploadDetailCasabalModel, TransDetbUploadDetailCasabal>chunk(100)
				.reader(flatFileItemReaderDetbUploadDetailCasabal()).processor(firstItemProDetbUploadDetailCasabal)
				.writer(jpaItemWriterDetbUploadDetailCasabal()).faultTolerant().skip(Throwable.class)
				.skip(Throwable.class).skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransDetbUploadDetailCasabalModel> flatFileItemReaderDetbUploadDetailCasabal() {
		FlatFileItemReader<TransDetbUploadDetailCasabalModel> flatFileItemReader = new FlatFileItemReader<TransDetbUploadDetailCasabalModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_DETB_UPLOAD_DETAIL_CASABAL");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));

		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransDetbUploadDetailCasabalModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("INSTRUMENT_NO", "FIN_CYCLE", "PERIOD_CODE", "MIS_CODE", "REL_CUST", "ADDL_TEXT",
								"MIS_GROUP", "DW_AC_NO", "ACCOUNT_NEW", "TXN_MIS_1", "TXN_MIS_2", "TXN_MIS_3",
								"TXN_MIS_4", "TXN_MIS_5", "TXN_MIS_6", "TXN_MIS_7", "TXN_MIS_8", "TXN_MIS_9",
								"TXN_MIS_10", "COMP_MIS_1", "COMP_MIS_2", "COMP_MIS_3", "COMP_MIS_4", "COMP_MIS_5",
								"COMP_MIS_6", "COMP_MIS_7", "COMP_MIS_8", "COMP_MIS_9", "COMP_MIS_10", "COST_CODE1",
								"COST_CODE2", "COST_CODE3", "COST_CODE4", "COST_CODE5", "MIS_HEAD", "RELATED_ACCOUNT",
								"RELATED_REF", "POOL_CODE", "REF_RATE", "CALC_METHOD", "BATCH_NO", "MIS_FLAG",
								"MIS_GROUP_TXN", "BRANCH_CODE", "SOURCE_CODE", "CURR_NO", "UPLOAD_STAT", "CCY_CD",
								"INITIATION_DATE", "AMOUNT", "ACCOUNT", "ACCOUNT_BRANCH", "TXN_CODE", "DR_CR",
								"LCY_EQUIVALENT", "EXCH_RATE", "VALUE_DATE", "EXTERNAL_REF_NO", "RESERVED_FUNDS_REF",
								"DELETE_STAT", "UPLOAD_DATE", "TXT_FILE_NAME", "FUND_MIS_1", "FUND_MIS_2", "FUND_MIS_3",
								"FUND_MIS_4", "FUND_MIS_5", "FUND_MIS_6", "FUND_MIS_7", "FUND_MIS_8", "FUND_MIS_9",
								"FUND_MIS_10");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransDetbUploadDetailCasabalModel>() {
					{
						setTargetType(TransDetbUploadDetailCasabalModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());
		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransDetbUploadDetailCasabal> jpaItemWriterDetbUploadDetailCasabal() {
		JpaItemWriter<TransDetbUploadDetailCasabal> jpaItemWriter = new JpaItemWriter<TransDetbUploadDetailCasabal>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
}
	



