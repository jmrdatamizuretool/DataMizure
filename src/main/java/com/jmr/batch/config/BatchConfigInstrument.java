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

import com.jmr.batch.entity.instruments.TransActbReconMaster;
import com.jmr.batch.entity.instruments.TransIstmInstrTxn;
import com.jmr.batch.entity.instruments.TransIstmUploadInstrumentDetail;
import com.jmr.batch.entity.instruments.TransIstmUploadInstrumentMaster;
import com.jmr.batch.listener.BlankLineRecordSeparatorPolicy;
import com.jmr.batch.listener.StepResultListener;
import com.jmr.batch.listener.instrument.SkipListenerIstmInstrumentUploadDetail;
import com.jmr.batch.listener.instrument.SkipListenerIstmUploadInstrumentMaster;
import com.jmr.batch.model.instruments.TransActbReconMasterModel;
import com.jmr.batch.model.instruments.TransIstmInstrTxnModel;
import com.jmr.batch.model.instruments.TransIstmUploadInstrumentDetailModel;
import com.jmr.batch.model.instruments.TransIstmUploadInstrumentMasterModel;
import com.jmr.batch.processor.instruments.FirstItemProActbReconMaster;
import com.jmr.batch.processor.instruments.FirstItemProIstmInstrTxn;
import com.jmr.batch.processor.instruments.FirstItemProIstmUploadInstrumentDetail;
import com.jmr.batch.processor.instruments.FirstItemProIstmUploadInstrumentMaster;
import com.jmr.framework.service.CommonService;

@Configuration
@EnableBatchProcessing
public class BatchConfigInstrument {
	@Autowired
	@Qualifier("entityManagerFactory")
	private EntityManagerFactory entityManagerFactory;
	@Autowired
	@Qualifier("datasource")
	private DataSource datasource;
	
	@Autowired
	private JobBuilderFactory jobBuilderFactory;
	@Autowired
	private CommonService commonService;
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	@Autowired
	private StepResultListener stepResultListener;
   
	@Autowired
	private FirstItemProIstmUploadInstrumentMaster firstItemProIstmUploadInstrumentMaster;

	@Autowired
	private FirstItemProIstmInstrTxn firstItemProIstmInstrTxn;
	
	@Autowired
    private FirstItemProIstmUploadInstrumentDetail firstItemProIstmUploadInstrumentDetail;
	
	@Autowired
	private FirstItemProActbReconMaster firstItemProActbReconMaster;
	@Autowired
	private SkipListenerIstmUploadInstrumentMaster skipListenerIstmUploadInstrumentMaster;
	@Autowired
	private SkipListenerIstmInstrumentUploadDetail skipListenerIstmInstrumentUploadDetail;

    /** 1. ISTM_UPLOAD_INSTRUMENT_MASTER */

	@Bean
	public Job istmuploadinstrumentmaster() {
		return jobBuilderFactory.get("istmuploadinstrumentmaster").incrementer(new RunIdIncrementer())
				.start(istmUploadInstrumentMasterChunkStep()).build();

	}

	private Step istmUploadInstrumentMasterChunkStep() {
		return stepBuilderFactory.get("TRANS_ISTM_UPLOAD_INSTRUMENT_MASTER")
				.<TransIstmUploadInstrumentMasterModel, TransIstmUploadInstrumentMaster>chunk(100)
				.reader(flatFileItemReaderIstmUploadInstrumentMaster())
				.processor(firstItemProIstmUploadInstrumentMaster).writer(jpaItemWriterIstmUploadInstrumentMaster())
				.faultTolerant().skip(Throwable.class).skipPolicy(new AlwaysSkipItemSkipPolicy())
				//.listener(skipListenerIstmUploadInstrumentMaster)
				.listener(stepResultListener).build();
	}

	

	@StepScope
	@Bean
	public FlatFileItemReader<TransIstmUploadInstrumentMasterModel> flatFileItemReaderIstmUploadInstrumentMaster() {
		FlatFileItemReader<TransIstmUploadInstrumentMasterModel> flatFileItemReader = new FlatFileItemReader<TransIstmUploadInstrumentMasterModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_ISTM_UPLOAD_INSTRUMENT_MASTER");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));

		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransIstmUploadInstrumentMasterModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE", "INSTRUMENT_TYPE", "BRANCH", "ACCOUNT", "CHEQUE_BOOK_NO",
								"NO_OF_LEAVES", "ACCOUNT_BRANCH", "CCY", "LPAD_REQD", "UPLOAD_STATUS_FLAG", "ERRMSG",
								"XREF", "ISSUER_CODE");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransIstmUploadInstrumentMasterModel>() {
					{
						setTargetType(TransIstmUploadInstrumentMasterModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;

	}

 	@Bean
 	public JpaItemWriter<TransIstmUploadInstrumentMaster> jpaItemWriterIstmUploadInstrumentMaster() {
 		JpaItemWriter<TransIstmUploadInstrumentMaster> jpaItemWriter = new JpaItemWriter<TransIstmUploadInstrumentMaster>();
 		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
 		return jpaItemWriter;
 	} 
 	
 	/** 2. ISTM_UPLOAD_INSTRUMENT_DETAIL */
	@Bean
	public Job istmuploadinstrumentdetail() {
		return jobBuilderFactory.get("istmuploadinstrumentdetail").incrementer(new RunIdIncrementer())
				.start(istmInstrumentUploadDetailChunkStep()).build();
	}

	private Step istmInstrumentUploadDetailChunkStep() {
		return stepBuilderFactory.get("TRANS_ISTM_UPLOAD_INSTRUMENT_DETAIL")
				.<TransIstmUploadInstrumentDetailModel, TransIstmUploadInstrumentDetail>chunk(100)
				.reader(flatFileItemReaderIstmInstrumentDetail()).processor(firstItemProIstmUploadInstrumentDetail)
				.writer(jpaItemWriterIstmInstrumentDetail()).faultTolerant().skip(Throwable.class).skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy())
				.listener(skipListenerIstmInstrumentUploadDetail)
				.listener(stepResultListener).build();
	}


	@StepScope
	@Bean
	public FlatFileItemReader<TransIstmUploadInstrumentDetailModel> flatFileItemReaderIstmInstrumentDetail() {
		FlatFileItemReader<TransIstmUploadInstrumentDetailModel> flatFileItemReader = new FlatFileItemReader<TransIstmUploadInstrumentDetailModel>();
		//String csv_file_path = commonService.getLegacyDataDetails("TRANS_ISTM_UPLOAD_INSTRUMENT_DETAIL");
		String csv_file_path = "E:\\JMR Infotech\\MigrationTool\\Documents\\CSV\\INSTRUMENT\\ISTM_UPLOAD_INSTRUMENT_DETAIL.csv";
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));

		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransIstmUploadInstrumentDetailModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE", "INSTRUMENT_TYPE", "BRANCH", "ACCOUNT", "CHEQUE_BOOK_NO", "CHEQUE_NO",
								"STATUS", "AMOUNT", "BENEFICIARY", "GENERATION_DATE", "VALUE_DATE", "ACCOUNT_BRANCH",
								"CCY", "UPLOAD_STATUS_FLAG", "ERRMSG", "ISSUER_CODE");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransIstmUploadInstrumentDetailModel>() {
					{
						setTargetType(TransIstmUploadInstrumentDetailModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;

	}

	@Bean
	public JpaItemWriter<TransIstmUploadInstrumentDetail> jpaItemWriterIstmInstrumentDetail() {
		JpaItemWriter<TransIstmUploadInstrumentDetail> jpaItemWriter = new JpaItemWriter<TransIstmUploadInstrumentDetail>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 3. ISTM_INSTR_TXN */
	@Bean
	public Job istminstrtxn() {
		return jobBuilderFactory.get("istminstrtxn").incrementer(new RunIdIncrementer()).start(istmInstrTxnChunkStep())
				.build();
	}

	private Step istmInstrTxnChunkStep() {
		return stepBuilderFactory.get("TRANS_ISTM_INSTR_TXN").<TransIstmInstrTxnModel, TransIstmInstrTxn>chunk(100)
				.reader(flatFileItemReaderIstmInstrTxn()).processor(firstItemProIstmInstrTxn)
				.writer(jpaItemWriterIstmInstrTxn()).faultTolerant().skip(Throwable.class).skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
	}


	@StepScope
	@Bean
	public FlatFileItemReader<TransIstmInstrTxnModel> flatFileItemReaderIstmInstrTxn() {
		FlatFileItemReader<TransIstmInstrTxnModel> flatFileItemReader = new FlatFileItemReader<TransIstmInstrTxnModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_ISTM_INSTR_TXN");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransIstmInstrTxnModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("CONTRACT_REF_NO", "VERSION_NO", "EVENT_SEQ_NO", "ISSUING_BRANCH", "PAYABLE_BRANCH",
								"PRODUCT_CODE", "INSTR_TYPE", "INSTR_STAT", "INSTR_CCY", "INSTR_AMOUNT", "INSTR_DATE",
								"INSTR_NO", "DD_MICR_NO", "AC_BRANCH", "AC_NO", "AC_CCY", "EXCH_RATE", "ACY_AMOUNT",
								"LCY_AMOUNT", "REL_CUSTOMER", "BENEF_NAME", "BENEF_ADDR_1", "BENEF_ADDR_2",
								"BENEF_ADDR_3", "BENEF_ADDR_4", "BENEF_ADDR_5", "IDENTIFIER_NAME_1",
								"IDENTIFIER_VALUE_1", "IDENTIFIER_NAME_2", "IDENTIFIER_VALUE_2", "IDENTIFIER_NAME_3",
								"IDENTIFIER_VALUE_3", "IDENTIFIER_NAME_4", "IDENTIFIER_VALUE_4", "IDENTIFIER_NAME_5",
								"IDENTIFIER_VALUE_5", "IDENTIFIER_NAME_6", "IDENTIFIER_VALUE_6", "NARRATIVE",
								"MAKER_ID", "MAKER_DT_STAMP", "CHECKER_ID", "CHECKER_DT_STAMP", "RECORD_STAT",
								"AUTH_STAT", "ONCE_AUTH", "MOD_NO", "CHARGE_ACCOUNT", "CHG_GL", "CHG_CCY", "CHG_AMT",
								"CHG_IN_ACY", "CHG_IN_LCY", "CHG_CCY_ACY_RATE", "ACY_LCY_RATE", "NETTING_IND",
								"TXN_CODE", "MIS_HEAD_1", "CHG_GL_1", "CHG_CCY_1", "CHG_AMT_1", "CHG_IN_ACY_1",
								"CHG_IN_LCY_1", "CHG_CCY_ACY_RATE_1", "ACY_LCY_RATE_1", "NETTING_IND_1", "TXN_CODE_1",
								"MIS_HEAD_2", "CHG_GL_2", "CHG_CCY_2", "CHG_AMT_2", "CHG_IN_ACY_2", "CHG_IN_LCY_2",
								"CHG_CCY_ACY_RATE_2", "ACY_LCY_RATE_2", "NETTING_IND_2", "TXN_CODE_2", "MIS_HEAD_3",
								"CHG_GL_3", "CHG_CCY_3", "CHG_AMT_3", "CHG_IN_ACY_3", "CHG_IN_LCY_3",
								"CHG_CCY_ACY_RATE_3", "ACY_LCY_RATE_3", "NETTING_IND_3", "TXN_CODE_3", "MIS_HEAD_4",
								"CHG_GL_4", "CHG_CCY_4", "CHG_AMT_4", "CHG_IN_ACY_4", "CHG_IN_LCY_4",
								"CHG_CCY_ACY_RATE_4", "ACY_LCY_RATE_4", "NETTING_IND_4", "TXN_CODE_4", "MIS_HEAD_5",
								"PRINT_STAT", "EXPIRY_DATE", "PRINT_COPY", "PAYABLE_BANK", "OFS_ACC", "OFS_CCY",
								"OFS_AMOUNT", "OFS_BRANCH", "SSN", "REISSUED", "ORG_DRAFT_NO", "REISSUE_REMARKS",
								"REISSUED_DRAFT_NO", "SCODE", "XREF", "TRN_DT", "BEN_ACCOUNT", "BEN_CUST", "BEN_CCY",
								"DISCOUNT_DAYS", "THEIR_ACC", "THEIR_ACC1", "THEIR_ACC2", "THEIR_ACC3", "THEIR_ACC4",
								"CHG_TYPE", "CHG_TYPE1", "CHG_TYPE2", "CHG_TYPE3", "CHG_TYPE4", "WAIVER", "WAIVER1",
								"WAIVER2", "WAIVER3", "WAIVER4", "LCY_CHG_EXCH_RATE", "LCY_CHG_EXCH_RATE1",
								"LCY_CHG_EXCH_RATE2", "LCY_CHG_EXCH_RATE3", "LCY_CHG_EXCH_RATE4", "CHG_DESC",
								"CHG_DESC1", "CHG_DESC2", "CHG_DESC3", "CHG_DESC4", "TXN_TANKED", "ISSUER_CODE",
								"COUNTRY_CODE", "DELIVERY_MODE", "DELIVERY_ADD1", "DELIVERY_ADD2", "DELIVERY_ADD3",
								"DELIVERY_ADD4", "CHEQUE_NO", "PAYOUT_CHG", "PAYMENT_MODE", "OLD_DD_MICR_NO", "REMARKS",
								"REVAL_FREQ_DAYS", "REVAL_FREQ_MONTHS", "REVAL_FREQ_YEARS", "OLD_INSTR_NO", "BATCH_NO",
								"CHARGE_CCY", "REVALIDATED", "DUPLICATE", "MANUAL_INPUT", "TESTKEY", "BENEF_PH_NO",
								"BENEF_ID_NO", "REM_NAME", "REM_ADDR_1", "REM_ADDR_2", "REM_ADDR_3", "REM_ADDR_4",
								"REM_PH_NO", "REM_ID_NO", "INWARD_TT_REF", "TT_PAYMENT_TYPE", "CHG_BY_CASH",
								"ISSUE_BANK", "IS_PRINTED", "CHG_MODE", "MULTI_REF_NO", "UI_AC_NO", "CHEQUE_ISSUE_DATE",
								"UI_CHARGE_ACCOUNT", "CHARGE_ACC_BRN");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransIstmInstrTxnModel>() {
					{
						setTargetType(TransIstmInstrTxnModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;

	}

	@Bean
	public JpaItemWriter<TransIstmInstrTxn> jpaItemWriterIstmInstrTxn() {
		JpaItemWriter<TransIstmInstrTxn> jpaItemWriter = new JpaItemWriter<TransIstmInstrTxn>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;

	}
	
	/** 4. ACTBS_RECON_MASTER */
	@Bean
	public Job actbsreconmaster() {
		return jobBuilderFactory.get("auctbsreconmaster").incrementer(new RunIdIncrementer())
				.start(actbsReconMasterChunkStep()).build();

	}

	private Step actbsReconMasterChunkStep() {
		return stepBuilderFactory.get("TRANS_ACTBS_RECON_MASTER")
				.<TransActbReconMasterModel, TransActbReconMaster>chunk(100).reader(flatFileItemReaderActbReconMaster())
				.processor(firstItemProActbReconMaster).writer(jpaItemWriterActbReconMaster()).faultTolerant()
				.skip(Throwable.class).skip(Throwable.class).skipPolicy(new AlwaysSkipItemSkipPolicy())
				.listener(stepResultListener).build();
	}


	@StepScope
	@Bean
	public FlatFileItemReader<TransActbReconMasterModel> flatFileItemReaderActbReconMaster() {
		FlatFileItemReader<TransActbReconMasterModel> flatFileItemReader = new FlatFileItemReader<TransActbReconMasterModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_ACTBS_RECON_MASTER");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));

		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransActbReconMasterModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("BRANCH", "ACCOUNT", "CCY", "RECONNO", "REF_NO", "EVENT_SEQ_NO", "AMOUNT",
								"AMOUNT_TO_RECON", "ENTRYDATE", "STATUS");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransActbReconMasterModel>() {
					{
						setTargetType(TransActbReconMasterModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;

	}

	@Bean
	public JpaItemWriter<TransActbReconMaster> jpaItemWriterActbReconMaster() {
		JpaItemWriter<TransActbReconMaster> jpaItemWriter = new JpaItemWriter<TransActbReconMaster>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
}



    
