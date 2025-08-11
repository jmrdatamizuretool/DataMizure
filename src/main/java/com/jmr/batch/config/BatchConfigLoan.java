package com.jmr.batch.config;

import java.util.NoSuchElementException;

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
import com.jmr.batch.entity.loan.TransCltbAcUdeUpload;
import com.jmr.batch.entity.loan.TransCltbAccColllnkdtlUpd;
import com.jmr.batch.entity.loan.TransCltbAccPartiesUpload;
import com.jmr.batch.entity.loan.TransCltbAccompSchUpload;
import com.jmr.batch.entity.loan.TransCltbAccountUpload;
import com.jmr.batch.listener.BlankLineRecordSeparatorPolicy;
import com.jmr.batch.listener.StepResultListener;
import com.jmr.batch.listener.loan.SkipListenerCltbAcUdeUpload;
import com.jmr.batch.listener.loan.SkipListenerCltbAccColllnkdtlUpd;
import com.jmr.batch.listener.loan.SkipListenerCltbAccountUpload;
import com.jmr.batch.model.loan.TransCltbAcCompUploadModel;
import com.jmr.batch.model.loan.TransCltbAcUdeUploadModel;
import com.jmr.batch.model.loan.TransCltbAccColllnkdtlUpdModel;
import com.jmr.batch.model.loan.TransCltbAccPartiesUploadModel;
import com.jmr.batch.model.loan.TransCltbAccompSchUploadModel;
import com.jmr.batch.model.loan.TransCltbAccountUploadModel;
import com.jmr.batch.processor.loan.FirstItemProCltbAcCompUpload;
import com.jmr.batch.processor.loan.FirstItemProCltbAcUdeUpload;
import com.jmr.batch.processor.loan.FirstItemProCltbAccColllnkdtlUpd;
import com.jmr.batch.processor.loan.FirstItemProCltbAccPartiesUpload;
import com.jmr.batch.processor.loan.FirstItemProCltbAccompSchUpload;
import com.jmr.batch.processor.loan.FirstItemProCltbAccountUpload;
import com.jmr.framework.service.CommonService;

@Configuration
@EnableBatchProcessing
public class BatchConfigLoan {
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
	private FirstItemProCltbAcUdeUpload firstItemProCltbAcUdeUpload;
	@Autowired
	private FirstItemProCltbAccountUpload firstItemProCltbAccountUpload;
	@Autowired
	private FirstItemProCltbAcCompUpload firstItemProCltbAcCompUpload;
	@Autowired
	private FirstItemProCltbAccPartiesUpload firstItemProCltbAccPartiesUpload;
	@Autowired
	private FirstItemProCltbAccColllnkdtlUpd firstItemProCltbAccColllnkdtlUpd;
	@Autowired
	private FirstItemProCltbAccompSchUpload firstItemProCltbAccompSchUpload;
	@Autowired
	private SkipListenerCltbAcUdeUpload skipListenerCltbAcUdeUpload;
	@Autowired
	private SkipListenerCltbAccountUpload skipListenerCltbAccountUpload;
	@Autowired
	private SkipListenerCltbAccColllnkdtlUpd skipListenerCltbAccColllnkdtlUpd;
	
	/*@Autowired
	private SkipListenerCltbAcCompUpload skipListenerCltbAcCompUpload;*/
	@Autowired
	private CommonService commonService;
	/** 1. CLTB_AC_UDE_UPLOAD */
	@Bean
	public Job cltbacudeupload() {
		return jobBuilderFactory.get("cltbacudeupload").incrementer(new RunIdIncrementer())
				.start(cltbAcUdeUploadChunkStep()).build();
	}

	private Step cltbAcUdeUploadChunkStep() {
		return stepBuilderFactory.get("TRANS_CLTB_AC_UDE_UPLOAD")
				.<TransCltbAcUdeUploadModel, TransCltbAcUdeUpload>chunk(100)
				.reader(flatFileItemReaderCltbAcUdeUpload()).processor(firstItemProCltbAcUdeUpload)
				.writer(jpaItemWriterCltbAcUdeUpload()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerCltbAcUdeUpload)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransCltbAcUdeUploadModel> flatFileItemReaderCltbAcUdeUpload() {
		FlatFileItemReader<TransCltbAcUdeUploadModel> flatFileItemReader = new FlatFileItemReader<TransCltbAcUdeUploadModel>();
		try {
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_CLTB_AC_UDE_UPLOAD");
		
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCltbAcUdeUploadModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("BRANCH_CODE", "EFFECTIVE_DATE", "UDE_ID", "UDE_VALUE", "RATE_CODE", "CODE_USAGE",
								"MAINT_RSLV_FLAG", "RESOLVED_VALUE", "SOURCE_CODE", "EXT_REF_NO", "PROCESS_CODE",
								"SEQUENCE_NO", "RATE_BASIS");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCltbAcUdeUploadModel>() {
					{
						setTargetType(TransCltbAcUdeUploadModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		}
		catch (NoSuchElementException e1) {
			System.out.println("This is the exception1 "+e1);
		}
		catch (Exception e) {
			System.out.println("This is the exception "+e);
		}
		return flatFileItemReader;
		
		/*FlatFileItemReader<TransCltbAcUdeUploadModel> flatFileItemReader = new FlatFileItemReader<TransCltbAcUdeUploadModel>();
		String csv_file_path = null;
		try {
			csv_file_path = commonService.getLegacyDataDetails("CLTB_AC_UDE_UPLOAD111");
		}
		catch (NoSuchElementException e1) {
			System.out.println("This is the exception1 "+e1);	
		}
		catch (Exception e) {
			System.out.println("This is the exception "+e);
			
		}
		if (!csv_file_path.equals(null)) {
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		DefaultLineMapper<TransCltbAcUdeUploadModel> defaultLineMapper = 
				new DefaultLineMapper<TransCltbAcUdeUploadModel>();
		BeanWrapperFieldSetMapper<TransCltbAcUdeUploadModel> fieldSetMapper = 
				new BeanWrapperFieldSetMapper<TransCltbAcUdeUploadModel>();
		DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
		delimitedLineTokenizer.setNames("BRANCH_CODE", "EFFECTIVE_DATE", "UDE_ID", "UDE_VALUE", "RATE_CODE", "CODE_USAGE",
				"MAINT_RSLV_FLAG", "RESOLVED_VALUE", "SOURCE_CODE", "EXT_REF_NO", "PROCESS_CODE",
				"SEQUENCE_NO", "RATE_BASIS");
		defaultLineMapper.setLineTokenizer(delimitedLineTokenizer);
		defaultLineMapper.setFieldSetMapper(fieldSetMapper);
		flatFileItemReader.setLineMapper(defaultLineMapper);
		flatFileItemReader.setLinesToSkip(1);
		}
		
		return flatFileItemReader;*/
	}
	@Bean
	public JpaItemWriter<TransCltbAcUdeUpload> jpaItemWriterCltbAcUdeUpload() {
		JpaItemWriter<TransCltbAcUdeUpload> jpaItemWriter = new JpaItemWriter<TransCltbAcUdeUpload>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
	/** 2. CLTB_ACCOUNT_UPLOAD */
	@Bean
	public Job cltbaccountupload() {
		return jobBuilderFactory.get("ictmaccprupload").incrementer(new RunIdIncrementer())
				.start(cltbAccountUploadChunkStep()).build();
	}

	private Step cltbAccountUploadChunkStep() {
		return stepBuilderFactory.get("TRANS_CLTB_ACCOUNT_UPLOAD")
				.<TransCltbAccountUploadModel, TransCltbAccountUpload>chunk(100).reader(flatFileItemReaderCltbAccountUpload())
				.processor(firstItemProCltbAccountUpload).writer(jpaItemWriterCltbAccountUpload())
				.faultTolerant()
				.skip(Throwable.class).skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerCltbAccountUpload)
				.listener(stepResultListener)
				.build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransCltbAccountUploadModel> flatFileItemReaderCltbAccountUpload() {
		FlatFileItemReader<TransCltbAccountUploadModel> flatFileItemReader = new FlatFileItemReader<TransCltbAccountUploadModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_CLTB_ACCOUNT_UPLOAD");

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCltbAccountUploadModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE", "ACCOUNT_NUMBER", "BRANCH_CODE", "ALT_ACC_NO", "APPLICATION_NUM",
								"CUSTOMER_ID", "PRODUCT_CODE", "PRODUCT_CATEGORY", "BOOK_DATE", "VALUE_DATE",
								"MATURITY_DATE", "AMOUNT_FINANCED", "DOWNPAYMENT_AMOUNT", "CURRENCY",
								"ORIGINAL_ST_DATE", "PRIMARY_APPLICANT_ID", "PRIMARY_APPLICANT_NAME",
								"USER_DEFINED_STATUS", "CALC_REQD", "BACK_VAL_EFF_DT", "AUTO_MAN_ROLLOVER",
								"SCHEDULE_BASIS", "UDE_ROLLOVER_BASIS", "ROLLOVER_TYPE", "SPECIAL_AMOUNT",
								"RATE_CODE_PREF", "PASSBOOK_FACILITY", "ATM_FACILITY", "ALLOW_BACK_PERIOD_ENTRY",
								"INT_STMT", "TRACK_RECEIVABLE_ALIQ", "TRACK_RECEIVABLE_MLIQ", "LIQUIDATION_MODE",
								"AMEND_PAST_PAID_SCHEDULE", "CHEQUE_BOOK_FACILITY", "LIQ_BACK_VALUED_SCHEDULES",
								"LIQ_COMP_DATES_FLAG", "RETRIES_AUTO_LIQ", "RESIDUAL_AMOUNT", "ACCOUNT_STATUS",
								"AUTH_STAT", "VERSION_NO", "LATEST_ESN", "NEXT_ACCR_DATE", "HAS_PROBLEMS", "PROCESS_NO",
								"AMOUNT_DISBURSED", "STOP_ACCRUALS", "FUNDED_STATUS", "AMORTIZED", "RECALC_ACTION_CODE",
								"MAKER_ID", "MAKER_DT_STAMP", "CHECKER_ID", "CHECKER_DT_STAMP", "ARVN_APPLIED",
								"PARTIAL_LIQUIDATION", "ALIQ_REVERSED_PMT", "NO_OF_INSTALLMENTS", "FREQUENCY",
								"FREQUENCY_UNIT", "FIRST_INS_DATE", "LINKED_REFERENCE", "LINKAGE_TYPE", "FIELD_CHAR_1",
								"FIELD_CHAR_2", "FIELD_CHAR_3", "FIELD_CHAR_4", "FIELD_CHAR_5", "FIELD_CHAR_6",
								"FIELD_CHAR_7", "FIELD_CHAR_8", "FIELD_CHAR_9", "FIELD_CHAR_10", "FIELD_CHAR_11",
								"FIELD_CHAR_12", "FIELD_CHAR_13", "FIELD_CHAR_14", "FIELD_CHAR_15", "FIELD_CHAR_16",
								"FIELD_CHAR_17", "FIELD_CHAR_18", "FIELD_CHAR_19", "FIELD_CHAR_20", "FIELD_NUMBER_1",
								"FIELD_NUMBER_2", "FIELD_NUMBER_3", "FIELD_NUMBER_4", "FIELD_NUMBER_5",
								"FIELD_NUMBER_6", "FIELD_NUMBER_7", "FIELD_NUMBER_8", "FIELD_NUMBER_9",
								"FIELD_NUMBER_10", "FIELD_NUMBER_11", "FIELD_NUMBER_12", "FIELD_NUMBER_13",
								"FIELD_NUMBER_14", "FIELD_NUMBER_15", "FIELD_NUMBER_16", "FIELD_NUMBER_17",
								"FIELD_NUMBER_18", "FIELD_NUMBER_19", "FIELD_NUMBER_20", "FIELD_DATE_1", "FIELD_DATE_2",
								"FIELD_DATE_3", "FIELD_DATE_4", "FIELD_DATE_5", "FIELD_DATE_6", "FIELD_DATE_7",
								"FIELD_DATE_8", "FIELD_DATE_9", "FIELD_DATE_10", "ROLL_BY", "MATURITY_TYPE",
								"NET_PRINCIPAL", "INDEX_XRATE", "DR_PAYMENT_MODE", "CR_PAYMENT_MODE", "DR_PROD_AC",
								"CR_PROD_AC", "DR_ACC_BRN", "CR_ACC_BRN", "EXT_ACC_NO_CR", "EXT_ACC_NAME_CR",
								"CLG_BANK_CODE_CR", "CLG_BRN_CODE_CR", "PC_CAT_CR", "EXT_ACC_NO_DR", "EXT_ACC_NAME_DR",
								"CLG_BANK_CODE_DR", "CLG_BRN_CODE_DR", "PC_CAT_DR", "CARD_NO", "INSTRUMENT_NO_CR",
								"ROUTING_NO_CR", "END_POINT_CR", "CLG_PROD_CODE_CR", "SECTOR_CODE_CR",
								"INSTRUMENT_NO_DR", "ROUTING_NO_DR", "END_POINT_DR", "CLG_PROD_CODE_DR",
								"SECTOR_CODE_DR", "UPLOAD_SOURCE_DR", "UPLOAD_SOURCE_CR", "EMI_AMOUNT",
								"CUTOFF_TRANSACTION", "DELINQUENCY_STATUS", "EXECUTION_DATE", "MIGRATION_DATE",
								"USGT_STATUS", "LAST_INTRADAY_ACCR_DT", "GIRO_MODE_DR", "GIRO_SERVICE_DR",
								"GIRO_NUMBER_DR", "PAYER_ACC_NO_DR", "PAYER_BANK_CODE_DR", "PAYER_BRANCH_DR",
								"PAYER_ADDRESS1_DR", "PAYER_ADDRESS2_DR", "PAYER_ADDRESS3_DR", "PAYER_ADDRESS4_DR",
								"GIRO_MODE_CR", "GIRO_SERVICE_CR", "GIRO_NUMBER_CR", "PAYER_ACC_NO_CR",
								"PAYER_BANK_CODE_CR", "PAYER_BRANCH_CR", "PAYER_ADDRESS1_CR", "PAYER_ADDRESS2_CR",
								"PAYER_ADDRESS3_CR", "PAYER_ADDRESS4_CR", "DUE_DATES_ON", "USER_REF_NO", "BILL_REF_NO",
								"ROLLOVER_ALLOWED", "AMT_AVAILABLE", "COMMITMENT_TYPE", "LOAN_TYPE", "MODULE_CODE",
								"UPLOAD_STATUS", "ERROR_CODE", "JOB_ID", "PROCESS_CODE", "SEQUENCE_NO",
								"PACKING_CREDIT", "EMI_FREQ", "MIN_EMI", "MAX_EMI", "EMI_FREQ_UNIT", "END_DATE",
								"AMOUNT_UTILIZED", "MIN_AMT_DUE_RULE", "FIRST_PAY_BY_DATE", "CREDITDAYS",
								"OPEN_LINE_LOAN", "REVOLVING_TYPE", "USE_GUARANTOR", "PROP_HANDOVER", "HANDOVER_DATE",
								"HANDOVER_CONF", "DAYS_FOR_CIF_AC", "DAYS_FOR_GUA_AC", "SUPP_GRACE_PERIOD",
								"CUST_GRACE_PERIOD", "END_CONSTRUCT_DT", "RETRIES_ADVICE_DAYS", "LOAN_STLMNT_NOTICEFLG",
								"NOTICE_DATE", "EXPECTED_CLOSURE_DATE", "ARRAHNU_EXTENSION", "AUTO_CLOSE_COLLATERAL",
								"STATUS_CHANGE_MODE", "DOWNPAYMENT_PERCEN", "TAKEN_OVER", "LEASE_TYPE", "ASSET_TYPE",
								"MUR_CONT_STATUS", "RATE_CHG_ACTION", "MFI_LOAN_TYPE", "SANCTIONING_OFFICER",
								"LOAN_DISBURSEMENT_CATEGORY", "AMOUNT_BLOCK_FLAG", "LEAD_ID", "NO_OF_TOPUP",
								"LC_REF_NO", "PURCHASE_ORD_REF_NO", "SETTLEMENT_SEQ_NUM", "FUND_ID", "LOAN_AGAINST_SAL",
								"PROVISIONING_MODE", "RESCH_ALLOW", "EFFECTIVE_DATE", "ALLOW_BULK_PAYMNET",
								"ALLOW_MULTI_PARTY", "ALLOW_MULTIPLE_DP", "AMORT_RESCHEDULE_ON_DSBR",
								"AMOUNT_BLOCK_REMARKS", "AMOUNT_BLOCKED", "APPLICANT_INCOME", "ASSET_COST",
								"BALLOON_AMOUNT", "BANK_SHARE_PERCENT", "BOOK_UNEARNED_INTEREST", "CUST_FREQUENCY_UNIT",
								"CUST_SHARE_PERCENT", "DEALER", "FA_ASSET_REF_NO", "FUTURE_DP_RECEIVABLE",
								"INSURANCE_COMP_CODE", "INSURANCE_FINANCED", "INSURANCE_FLAG", "INTEREST_CALC_METHOD",
								"INTEREST_SUBSIDY_ALLOWED", "INTERMEDIARY_CODE", "INTERMEDIARY_INITIATED",
								"LEASE_EXTEND_BY", "LEASE_PAYMENT_MODE", "LINE_ID", "LIQD_RESIDUAL_VALUE",
								"LOAN_STMT_REQD", "LOAN_TO_VALUE", "MATURITY_TENOR", "MATURITY_UNIT", "MAX_RNOG",
								"MORTGAGE_GROUP", "NOTARY_AUTO_CONFIRMED", "POST_CONST_UIDB", "PROJECT_ACCOUNT",
								"RECALC_ANNUITY", "RECMP_PRF_SCH", "RESIDUAL_AUTO_LIQD", "RESIDUAL_SUBSIDY_ALLOWED",
								"RESIDUAL_SUBSIDY_VALUE", "RESIDUAL_VALUE", "RESIDUAL_VALUE_BASIS", "RNOG_NO",
								"SECR_STATUS", "STAFF_FINANCE", "STOP_DSBR", "SUBSIDY_CUSTOMER_ID",
								"SUPP_FREQUENCY_UNIT", "SUPPLIER_ID", "TOTAL_AMOUNT", "UIDB_CALC_REQD",
								"UIDB_NOMINAL_AMT", "UPFRONT_PROFIT_BOOKED", "WAKALA_ACC_NO", "WINDOW_PERIOD_UNIT",
								"WINDOW_PERIOD_FREQ", "BALLOON_PERCENT", "BALLOON_ROLLOVER_INSTALLMENT",
								"BALLOON_ROLLOVER_UNIT", "EXCLUDE_INSTLMNT_FROM_BALLOON", "BALLOON_ROLLOVER_REQD",
								"IBAN_AC_NO", "IBAN_REQUIRED", "PAYMENT_DETAILS_1", "PAYMENT_DETAILS_2",
								"PAYMENT_DETAILS_3", "PAYMENT_DETAILS_4", "TAKAFUL_COST", "MAINTAIN_COST",
								"UI_DR_PROD_AC", "UI_CR_PROD_AC");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCltbAccountUploadModel>() {
					{
						setTargetType(TransCltbAccountUploadModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());
		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransCltbAccountUpload> jpaItemWriterCltbAccountUpload() {
		JpaItemWriter<TransCltbAccountUpload> jpaItemWriter = new JpaItemWriter<TransCltbAccountUpload>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
	
	/** 3. CLTB_AC_COMP_UPLOAD */
	@Bean
	public Job cltbaccompupload() {
		return jobBuilderFactory.get("cltbaccompupload").incrementer(new RunIdIncrementer())
				.start(cltbAcCompUploadChunkStep()).build();
	}

	private Step cltbAcCompUploadChunkStep() {
		return stepBuilderFactory.get("TRANS_CLTB_AC_COMP_UPLOAD")
				.<TransCltbAcCompUploadModel, TransCltbAcCompUpload>chunk(100)
				.reader(flatFileItemReaderCltbAcCompUpload()).processor(firstItemProCltbAcCompUpload)
				.writer(jpaItemWriterCltbAcCompUpload()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy())
				//.listener(skipListenerCltbAcCompUpload)
				.listener(stepResultListener).build();
	}
	@StepScope
	@Bean
	public FlatFileItemReader<TransCltbAcCompUploadModel> flatFileItemReaderCltbAcCompUpload() {
		FlatFileItemReader<TransCltbAcCompUploadModel> flatFileItemReader = new FlatFileItemReader<TransCltbAcCompUploadModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_CLTB_AC_COMP_UPLOAD");

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCltbAcCompUploadModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE", "EXT_REF_NO", "BRANCH_CODE", "COMPONENT_NAME", "SETTLEMENT_CCY",
								"COMPONENT_TYPE", "MAIN_COMPONENT", "SPL_INTEREST", "SPL_INTEREST_AMT",
								"PENAL_BASIS_COMP", "CAPITALIZED", "DR_PAYMENT_MODE", "CR_PAYMENT_MODE", "DR_PROD_AC",
								"CR_PROD_AC", "WAIVE", "DR_ACC_BRN", "CR_ACC_BRN", "SVC_ACC_AC", "SVC_ACC_BRN",
								"EXT_ACC_NO_CR", "EXT_ACC_NAME_CR", "CLG_BANK_CODE_CR", "CLG_BRN_CODE_CR", "PC_CAT_CR",
								"EXT_ACC_NO_DR", "EXT_ACC_NAME_DR", "CLG_BANK_CODE_DR", "CLG_BRN_CODE_DR", "PC_CAT_DR",
								"CARD_NO", "INSTRUMENT_NO_CR", "ROUTING_NO_CR", "END_POINT_CR", "CLG_PROD_CODE_CR",
								"SECTOR_CODE_CR", "INSTRUMENT_NO_DR", "ROUTING_NO_DR", "END_POINT_DR",
								"CLG_PROD_CODE_DR", "SECTOR_CODE_DR", "FUND_DURING_INIT", "FUND_DURING_ROLL",
								"COMPONENT_CCY", "UPLOAD_SOURCE_DR", "UPLOAD_SOURCE_CR", "VERIFY_FUNDS", "GIRO_MODE_DR",
								"GIRO_SERVICE_DR", "GIRO_NUMBER_DR", "PAYER_ACC_NO_DR", "PAYER_BANK_CODE_DR",
								"PAYER_BRANCH_DR", "PAYER_ADDRESS1_DR", "PAYER_ADDRESS2_DR", "PAYER_ADDRESS3_DR",
								"PAYER_ADDRESS4_DR", "GIRO_MODE_CR", "GIRO_SERVICE_CR", "GIRO_NUMBER_CR",
								"PAYER_ACC_NO_CR", "PAYER_BANK_CODE_CR", "PAYER_BRANCH_CR", "PAYER_ADDRESS1_CR",
								"PAYER_ADDRESS2_CR", "PAYER_ADDRESS3_CR", "PAYER_ADDRESS4_CR", "IRR_APPLICABLE",
								"PROCESS_CODE", "SEQUENCE_NO", "EXCHANGE_RATE", "NEGOTIATED_RATE", "NEGOTIATION_REF_NO",
								"ORG_EXCH_RATE", "EXCHANGE_RATE_DR", "NEGOTIATED_RATE_DR", "NEGOTIATION_REF_NO_DR",
								"ORG_EXCH_RATE_DR", "LIQUIDATION_MODE", "DAYS_MTH", "DAYS_YEAR", "EXPONENTIAL_FLAG",
								"SETTLEMENT_SEQ_NUM", "DEFERRED_CHARGE", "PAYMENT_DETAILS_1", "PAYMENT_DETAILS_2",
								"PAYMENT_DETAILS_3", "PAYMENT_DETAILS_4", "UI_DR_PROD_AC", "UI_CR_PROD_AC");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCltbAcCompUploadModel>() {
					{
						setTargetType(TransCltbAcCompUploadModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());
		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransCltbAcCompUpload> jpaItemWriterCltbAcCompUpload() {
		JpaItemWriter<TransCltbAcCompUpload> jpaItemWriter = new JpaItemWriter<TransCltbAcCompUpload>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
	/** 4. CLTB_ACC_PARTIES_UPLOAD */
	@Bean
	public Job cltbaccpartiesupload() {
		return jobBuilderFactory.get("cltbaccpartiesupload").incrementer(new RunIdIncrementer())
				.start(cltbAccPartiesUploadChunkStep()).build();
	}
	private Step cltbAccPartiesUploadChunkStep() {
		return stepBuilderFactory.get("TRANS_CLTB_ACC_PARTIES_UPLOAD")
				.<TransCltbAccPartiesUploadModel, TransCltbAccPartiesUpload>chunk(100)
				.reader(flatFileItemReaderCltbAccPartiesUpload()).processor(firstItemProCltbAccPartiesUpload)
				.writer(jpaItemWriterCltbAccPartiesUpload()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy())
				//.listener(skipListenerCltbAccPartiesUpload)
				.listener(stepResultListener).build();
	}
	

	@StepScope
	@Bean
	public FlatFileItemReader<TransCltbAccPartiesUploadModel> flatFileItemReaderCltbAccPartiesUpload() {
		FlatFileItemReader<TransCltbAccPartiesUploadModel> flatFileItemReader = new FlatFileItemReader<TransCltbAccPartiesUploadModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_CLTB_ACC_PARTIES_UPLOAD");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCltbAccPartiesUploadModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("BRANCH_CODE", "SOURCE_CODE", "EXT_REF_NO", "CUSTOMER_ID", "CUSTOMER_NAME",
								"RESPONSIBILITY", "LIABILITY", "LIABILITY_AMT", "EFFECTIVE_DATE", "PROCESS_CODE",
								"SEQUENCE_NO");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCltbAccPartiesUploadModel>() {
					{
						setTargetType(TransCltbAccPartiesUploadModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransCltbAccPartiesUpload> jpaItemWriterCltbAccPartiesUpload() {
		JpaItemWriter<TransCltbAccPartiesUpload> jpaItemWriter = new JpaItemWriter<TransCltbAccPartiesUpload>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
	/** 5. CLTB_ACC_COLLLNKDTL_UPD */
	@Bean
	public Job cltbacccolllnkdtlupd() {
		return jobBuilderFactory.get("cltbacccolllnkdtlupd").incrementer(new RunIdIncrementer())
				.start(cltbAccColllnkdtlUpdChunkStep()).build();
	}

	private Step cltbAccColllnkdtlUpdChunkStep() {
		return stepBuilderFactory.get("TRANS_CLTB_ACC_COLLLNKDTL_UPD")
				.<TransCltbAccColllnkdtlUpdModel, TransCltbAccColllnkdtlUpd>chunk(100)
				.reader(flatFileItemReaderCltbAccColllnkdtlUpd()).processor(firstItemProCltbAccColllnkdtlUpd)
				.writer(jpaItemWriterCltbAccColllnkdtlUpd()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerCltbAccColllnkdtlUpd)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransCltbAccColllnkdtlUpdModel> flatFileItemReaderCltbAccColllnkdtlUpd() {
		FlatFileItemReader<TransCltbAccColllnkdtlUpdModel> flatFileItemReader = new FlatFileItemReader<>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_CLTB_ACC_COLLLNKDTL_UPD");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));

		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCltbAccColllnkdtlUpdModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("ACCOUNT_NUMBER", "BRANCH_CODE", "LINKAGE_TYPE", "LINKED_REFERENCE_NO", "DESCRIPTION",
								"LINKAGE_BRANCH", "LINKAGE_CURRENCY", "OVERALL_AMOUNT", "COLLATERAL_CATEGORY",
								"HAIRCUT", "LIMIT_AMOUNT", "LINKED_AMOUNT", "LINKED_PERCENT_NUMBER", "UTIL_ORDER",
								"REINSTATE_ORDER", "UTIL_AMOUNT", "COMMITMENT_PRODUCT", "SOURCE_CODE", "PROCESS_CODE",
								"EXT_REF_NO", "SEQUENCE_NO", "TAKEN_OVER");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCltbAccColllnkdtlUpdModel>() {
					{
						setTargetType(TransCltbAccColllnkdtlUpdModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());
		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransCltbAccColllnkdtlUpd> jpaItemWriterCltbAccColllnkdtlUpd() {
		JpaItemWriter<TransCltbAccColllnkdtlUpd> jpaItemWriter = new JpaItemWriter<TransCltbAccColllnkdtlUpd>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 6. CLTB_ACCOMP_SCH_UPLOAD */
	
	@Bean
	public Job cltbaccompschupload() {
		return jobBuilderFactory.get("cltbaccompschupload").incrementer(new RunIdIncrementer())
				.start(cltbAccompSchUploadChunkStep()).build();
	}

	private Step cltbAccompSchUploadChunkStep() {
		return stepBuilderFactory.get("TRANS_CLTB_ACCOMP_SCH_UPLOAD")
				.<TransCltbAccompSchUploadModel, TransCltbAccompSchUpload>chunk(100)
				.reader(flatFileItemReaderCltbAccompSchUpload()).processor(firstItemProCltbAccompSchUpload)
				.writer(jpaItemWriterCltbAccompSchUpload()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy())
				//.listener(skipListenerCltbAccompSchUpload)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransCltbAccompSchUploadModel> flatFileItemReaderCltbAccompSchUpload() {
		FlatFileItemReader<TransCltbAccompSchUploadModel> flatFileItemReader = new FlatFileItemReader<TransCltbAccompSchUploadModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_CLTB_ACCOMP_SCH_UPLOAD");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCltbAccompSchUploadModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE", "EXT_REF_NO", "BRANCH_CODE", "COMPONENT_NAME", "SCHEDULE_TYPE",
								"SCHEDULE_FLAG", "FORMULA_NAME", "SCH_START_DATE", "NO_OF_SCHEDULES", "FREQUENCY",
								"UNIT", "SCH_END_DATE", "AMOUNT", "PAYMENT_MODE", "PMNT_PROD_AC", "PAYMENT_DETAILS",
								"BEN_ACCOUNT", "BEN_BANK", "BEN_NAME", "CAPITALIZED", "FIRST_DUE_DATE", "WAIVER_FLAG",
								"DUE_DATES_ON", "COMPOUND_DAYS", "COMPOUND_MONTHS", "COMPOUND_YEARS", "EMI_AMOUNT",
								"PROCESS_CODE", "SEQUENCE_NO", "DAYS_MTH", "DAYS_YEAR");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCltbAccompSchUploadModel>() {
					{
						setTargetType(TransCltbAccompSchUploadModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransCltbAccompSchUpload> jpaItemWriterCltbAccompSchUpload() {
		JpaItemWriter<TransCltbAccompSchUpload> jpaItemWriter = new JpaItemWriter<TransCltbAccompSchUpload>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

}

