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

import com.jmr.batch.entity.chequebook.TransCatmUploadCheckBook;
import com.jmr.batch.entity.chequebook.TransCatmUploadCheckDetails;
import com.jmr.batch.listener.BlankLineRecordSeparatorPolicy;
import com.jmr.batch.listener.StepResultListener;
import com.jmr.batch.listener.chequebook.SkipListenerCatmUploadCheckBook;
import com.jmr.batch.model.checkbook.TransCatmUploadCheckBookModel;
import com.jmr.batch.model.checkbook.TransCatmUploadCheckDetailsModel;
import com.jmr.batch.processor.checkbook.FirstItemProCatmUploadCheck;
import com.jmr.batch.processor.checkbook.FirstItemProCatmUploadCheckDetails;
import com.jmr.framework.service.CommonService;


@Configuration
@EnableBatchProcessing
public class BatchConfigChequebook {
	@Autowired
	@Qualifier("entityManagerFactory")
	private EntityManagerFactory entityManagerFactory;
	@Autowired
	@Qualifier("datasource")
	private DataSource datasource;
	@Autowired
	private StepResultListener stepResultListener;	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	@Autowired
	private FirstItemProCatmUploadCheckDetails firstItemProCatmUploadCheckDetails;

	@Autowired
	private SkipListenerCatmUploadCheckBook skipListenerCatmUploadCheckBook;
	@Autowired
	private FirstItemProCatmUploadCheck firstItemProCatmUploadCheck;
	@Autowired
	private CommonService commonService;
	/** 1. CATM_UPLOAD_CHECK_BOOK */

	@Bean
	public Job catmuploadcheckbook() {
		return jobBuilderFactory.get("catmuploadcheckbook").incrementer(new RunIdIncrementer())
				.start(catmUploadCheckBookChunkStep()).build();

	}
	
	private Step catmUploadCheckBookChunkStep() {
		return stepBuilderFactory.get("TRANS_CATM_UPLOAD_CHECK_BOOK")
				.<TransCatmUploadCheckBookModel, TransCatmUploadCheckBook>chunk(100).reader(flatFileItemReaderCatmUploadCheckBook())
				.processor(firstItemProCatmUploadCheck).writer(jpaItemWriterCatmUploadCheckBook()).faultTolerant()
				.skip(Throwable.class).skip(Throwable.class).skipPolicy(new AlwaysSkipItemSkipPolicy())
				//.listener(skipListenerCatmUploadCheckBook)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransCatmUploadCheckBookModel> flatFileItemReaderCatmUploadCheckBook() {
		FlatFileItemReader<TransCatmUploadCheckBookModel> flatFileItemReader = new FlatFileItemReader<TransCatmUploadCheckBookModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_CATM_UPLOAD_CHECK_BOOK");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCatmUploadCheckBookModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE", "BRANCH", "ACCOUNT", "FIRST_CHECK_NO", "CHECK_LEAVES", "ORDER_DATE",
								"ISSUE_DATE", "ORDER_DETAILS", "UPLOAD_STATUS_FLAG", "ERRMSG", "EXTERNAL_REF_NO",
								"BOOK_TYPE", "LANGUAGE_CODE", "REQUEST_MODE", "REQUEST_STATUS", "TRN_REF_NO",
								"MAINTENANCE_SEQ_NO", "DELIVERY_REF_NO", "DELIVERY_MODE", "DELIVERY_DATE",
								"CHQBOOK_DELIVERD", "CHEQUE_BOOK_TYPE", "DELIVERY_ADD1", "DELIVERY_ADD2",
								"DELIVERY_ADD3", "DELIVERY_ADD4", "ACTION_CODE", "PRINT_STATUS",
								"INCL_FOR_CHKBOOK_PRINTING", "SEQ_NO", "APPLY_CHARGE", "ISSUING_BRANCH");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCatmUploadCheckBookModel>() {
					{
						setTargetType(TransCatmUploadCheckBookModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;

	}

	@Bean
	public JpaItemWriter<TransCatmUploadCheckBook> jpaItemWriterCatmUploadCheckBook() {
		JpaItemWriter<TransCatmUploadCheckBook> jpaItemWriter = new JpaItemWriter<TransCatmUploadCheckBook>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

  /** 2. CATM_UPLOAD_CHECK_DETAILS */
	@Bean
	public Job catmuploadcheckdetails() {
		return jobBuilderFactory.get("catmuploadcheckdetails").incrementer(new RunIdIncrementer())
				.start(catmUploadCheckDetailsChunkStep()).build();
	}

	private Step catmUploadCheckDetailsChunkStep() {
		return stepBuilderFactory.get("TRANS_CATM_UPLOAD_CHECK_DETAILS")
				.<TransCatmUploadCheckDetailsModel, TransCatmUploadCheckDetails>chunk(100)
				.reader(flatFileItemReaderCatmUploadCheckDetails()).processor(firstItemProCatmUploadCheckDetails)
				.writer(jpaItemWriterCatmUploadCheckDetails()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransCatmUploadCheckDetailsModel> flatFileItemReaderCatmUploadCheckDetails() {
		FlatFileItemReader<TransCatmUploadCheckDetailsModel> flatFileItemReader = new FlatFileItemReader<TransCatmUploadCheckDetailsModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_CATM_UPLOAD_CHECK_BOOK");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCatmUploadCheckDetailsModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE", "BRANCH", "ACCOUNT", "CHECK_BOOK_NO", "CHECK_NO", "MOD_NO", "STATUS",
								"AMOUNT", "BENEFICIARY", "PRESENTATION_DATE", "VALUE_DATE", "REMARKS",
								"UPLOAD_STATUS_FLAG", "ERRMSG");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCatmUploadCheckDetailsModel>() {
					{
						setTargetType(TransCatmUploadCheckDetailsModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;

	}

	@Bean
	public JpaItemWriter<TransCatmUploadCheckDetails> jpaItemWriterCatmUploadCheckDetails() {
		JpaItemWriter<TransCatmUploadCheckDetails> jpaItemWriter = new JpaItemWriter<TransCatmUploadCheckDetails>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
	

}


