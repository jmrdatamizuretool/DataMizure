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

import com.jmr.batch.entity.amount.TransCatmUploadAmountBlocks;
import com.jmr.batch.listener.BlankLineRecordSeparatorPolicy;
import com.jmr.batch.listener.StepResultListener;
import com.jmr.batch.listener.amountblock.SkipListenerCatmUploadAmountBlocks;
import com.jmr.batch.model.amount.TransCatmUploadAmountBlocksModel;
import com.jmr.batch.processor.amount.FirstItemProCatmUploadAmountBlocks;
import com.jmr.framework.service.CommonService;

@Configuration
@EnableBatchProcessing
public class BatchConfigAmountblock {
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
	private FirstItemProCatmUploadAmountBlocks firstItemProCatmUploadAmountBlocks;
	
	@Autowired
	private SkipListenerCatmUploadAmountBlocks skipListenerCatmUploadAmountBlocks;
	@Autowired
	private CommonService commonService;
	/** TRANS_CATM_UPLOAD_AMOUNT_BLOCKS */
	@Bean
	public Job catmuploadamountblocks() {
		return jobBuilderFactory.get("catmuploadamountblock")
				.incrementer(new RunIdIncrementer())
				.start(catmUploadAmountBlocksChunkStep())
				.build();
		
	}

	private Step catmUploadAmountBlocksChunkStep() {
		return stepBuilderFactory.get("TRANS_CATM_UPLOAD_AMOUNT_BLOCKS")
				.<TransCatmUploadAmountBlocksModel, TransCatmUploadAmountBlocks>chunk(100)
				.reader(flatFileItemReaderCatmUploadAmountBlocks()).processor(firstItemProCatmUploadAmountBlocks)
				.writer(jpaItemWriterCatmUploadAmountBlocks()).faultTolerant().skip(Throwable.class)
				.skip(Throwable.class).skipPolicy(new AlwaysSkipItemSkipPolicy())
				.listener(skipListenerCatmUploadAmountBlocks)
				.listener(stepResultListener).build();
	}
	@StepScope
	@Bean
	public FlatFileItemReader<TransCatmUploadAmountBlocksModel> flatFileItemReaderCatmUploadAmountBlocks() {
		FlatFileItemReader<TransCatmUploadAmountBlocksModel> flatFileItemReader = new FlatFileItemReader<TransCatmUploadAmountBlocksModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_CATM_UPLOAD_AMOUNT_BLOCKS");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCatmUploadAmountBlocksModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE", "BRANCH_CODE", "ACCOUNT_NO", "AMOUNT_BLOCK_NO", "AMOUNT",
								"EFFECTIVE_DATE", "EXPIRY_DATE", "REMARKS", "UPLOAD_STATUS_FLAG", "ERRMSG",
								"AMOUNT_BLOCK_TYPE", "REFERENCE_NO", "HOLD_CODE", "ACTION_CODE", "MAINTENANCE_SEQ_NO",
								"FUND_AVL_CHECK");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCatmUploadAmountBlocksModel>() {
					{
						setTargetType(TransCatmUploadAmountBlocksModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;

	}

	@Bean
	public JpaItemWriter<TransCatmUploadAmountBlocks> jpaItemWriterCatmUploadAmountBlocks() {
		JpaItemWriter<TransCatmUploadAmountBlocks> jpaItemWriter = new JpaItemWriter<TransCatmUploadAmountBlocks>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
	
}
