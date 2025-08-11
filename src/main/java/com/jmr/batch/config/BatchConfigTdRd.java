package com.jmr.batch.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.batch.item.ItemProcessor;
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

import com.jmr.batch.entity.TransCasaCstmFunctionUserdefFields;
import com.jmr.batch.entity.TransIctmAccEffdtUpload;
import com.jmr.batch.entity.TransIctmAccPrUpload;
import com.jmr.batch.entity.TransIctmAccUdevalsUpload;
import com.jmr.batch.entity.TransIctmUploadAcc;
import com.jmr.batch.entity.TransMitbUploadClassMapping;
import com.jmr.batch.entity.TransSttbUploadCustAccount;
import com.jmr.batch.entity.TransSttbUploadCustLinkages;
import com.jmr.batch.entity.TransSttbUploadLinkedEntities;
import com.jmr.batch.entity.TransSttmUploadAccountChannel;
import com.jmr.batch.entity.TransSttmUploadChqbkReq;
import com.jmr.batch.entity.TransSvtmUploadAccSigDet;
import com.jmr.batch.entity.TransSvtmUploadAccSigMaster;
import com.jmr.batch.entity.tdRd.TransIctmUploadTdDetails;
import com.jmr.batch.entity.tdRd.TransIctmUploadTdpayinDet;
import com.jmr.batch.entity.tdRd.TransIctmUploadTdpayoutDet;
import com.jmr.batch.listener.BlankLineRecordSeparatorPolicy;
import com.jmr.batch.listener.SkipListenerCasaCstmFunctionUserdefFields;
import com.jmr.batch.listener.SkipListenerIctmAccEffdtUpload;
import com.jmr.batch.listener.SkipListenerIctmAccPrUpload;
import com.jmr.batch.listener.SkipListenerIctmAccUdevalsUpload;
import com.jmr.batch.listener.SkipListenerIctmUploadAcc;
import com.jmr.batch.listener.SkipListenerMitbUploadClassMapping;
import com.jmr.batch.listener.SkipListenerSttbUploadCustAccount;
import com.jmr.batch.listener.SkipListenerSttbUploadCustLinkages;
import com.jmr.batch.listener.SkipListenerSttbUploadLinkedEntities;
import com.jmr.batch.listener.SkipListenerSttmUploadAccountChannel;
import com.jmr.batch.listener.SkipListenerSttmUploadChqbkReq;
import com.jmr.batch.listener.SkipListenerSvtmUploadAccSigDet;
import com.jmr.batch.listener.SkipListenerSvtmUploadAccSigMaster;
import com.jmr.batch.listener.StepResultListener;
import com.jmr.batch.listener.tdRd.SkipListenerIctmUploadTdDetails;
import com.jmr.batch.listener.tdRd.SkipListenerIctmUploadTdpayinDet;
import com.jmr.batch.listener.tdRd.SkipListenerIctmUploadTdpayoutDet;
import com.jmr.batch.model.TransCasaCstmFunctionUserdefFieldsModel;
import com.jmr.batch.model.TransIctmAccEffdtUploadModel;
import com.jmr.batch.model.TransIctmAccPrUploadModel;
import com.jmr.batch.model.TransIctmAccUdevalsUploadModel;
import com.jmr.batch.model.TransIctmUploadAccModel;
import com.jmr.batch.model.TransMitbUploadClassMappingModel;
import com.jmr.batch.model.TransSttbUploadCustAccountModel;
import com.jmr.batch.model.TransSttbUploadCustLinkagesModel;
import com.jmr.batch.model.TransSttbUploadLinkedEntitiesModel;
import com.jmr.batch.model.TransSttmUploadAccountChannelModel;
import com.jmr.batch.model.TransSttmUploadChqbkReqModel;
import com.jmr.batch.model.TransSvtmUploadAccSigDetModel;
import com.jmr.batch.model.TransSvtmUploadAccSigMasterModel;
import com.jmr.batch.model.tdRd.TransIctmUploadTdDetailsModel;
import com.jmr.batch.model.tdRd.TransIctmUploadTdpayinDetModel;
import com.jmr.batch.model.tdRd.TransIctmUploadTdpayoutDetModel;
import com.jmr.batch.processor.FirstItemProCasaCstmFunctionUserdefFields;
import com.jmr.batch.processor.FirstItemProIctmAccEffdtUpload;
import com.jmr.batch.processor.FirstItemProIctmAccPrUpload;
import com.jmr.batch.processor.FirstItemProIctmAccUdevalsUpload;
import com.jmr.batch.processor.FirstItemProIctmUploadAcc;
import com.jmr.batch.processor.FirstItemProMitbUploadClassMapping;
import com.jmr.batch.processor.FirstItemProSttbUploadCustAccount;
import com.jmr.batch.processor.FirstItemProSttbUploadCustLinkages;
import com.jmr.batch.processor.FirstItemProSttbUploadLinkedEntities;
import com.jmr.batch.processor.FirstItemProSttmUploadAccountChannel;
import com.jmr.batch.processor.FirstItemProSttmUploadChqbkReq;
import com.jmr.batch.processor.FirstItemProSvtmUploadAccSigDet;
import com.jmr.batch.processor.FirstItemProSvtmUploadAccSigMaster;
import com.jmr.batch.processor.tdRd.FirstItemProIctmUploadTdDetails;
import com.jmr.batch.processor.tdRd.FirstItemProIctmUploadTdpayinDet;
import com.jmr.batch.processor.tdRd.FirstItemProIctmUploadTdpayoutDet;
import com.jmr.framework.service.CommonService;
import com.jmr.repository.LegacyDataRepository;

@Configuration
@EnableBatchProcessing
public class BatchConfigTdRd {
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
	private FirstItemProSttbUploadCustAccount firstItemProSttbUploadCustAccount;
	@Autowired
	private FirstItemProIctmUploadAcc firstItemProIctmUploadAcc;
	@Autowired
	private FirstItemProIctmAccPrUpload firstItemProIctmAccPrUpload;
	@Autowired
	private FirstItemProIctmAccEffdtUpload firstItemProIctmAccEffdtUpload;
	@Autowired
	private FirstItemProIctmAccUdevalsUpload firstItemProIctmAccUdevalsUpload;
	
	@Autowired
	private FirstItemProMitbUploadClassMapping firstItemProMitbUploadClassMapping;

	@Autowired
	private FirstItemProSttbUploadLinkedEntities firstItemProSttbUploadLinkedEntities;

	@Autowired
	private FirstItemProIctmUploadTdDetails firstItemProIctmUploadTdDetails;

	@Autowired
	private FirstItemProIctmUploadTdpayinDet firstItemProIctmUploadTdpayinDet;

	@Autowired
	private FirstItemProIctmUploadTdpayoutDet firstItemProIctmUploadTdpayoutDet;

	@Autowired
	private LegacyDataRepository repo;

	
	@Autowired
	private StepResultListener stepResultListener;
	@Autowired
	private SkipListenerSttbUploadCustAccount skipListenerSttbUploadCustAccount;
	@Autowired
	private SkipListenerIctmUploadAcc skipListenerIctmUploadAcc;
	@Autowired
	private SkipListenerIctmAccPrUpload skipListenerIctmAccPrUpload;
	@Autowired
	private SkipListenerIctmAccEffdtUpload skipListenerIctmAccEffdtUpload;
	@Autowired
	private SkipListenerIctmAccUdevalsUpload skipListenerIctmAccUdevalsUpload;
	
	@Autowired
	private SkipListenerMitbUploadClassMapping skipListenerMitbUploadClassMapping;

	@Autowired
	private SkipListenerSttbUploadLinkedEntities skipListenerSttbUploadLinkedEntities;
	@Autowired
	private SkipListenerIctmUploadTdDetails skipListenerIctmUploadTdDetails;
	@Autowired
	private SkipListenerIctmUploadTdpayinDet skipListenerIctmUploadTdpayinDet;
	@Autowired
	private SkipListenerIctmUploadTdpayoutDet skipListenerIctmUploadTdpayoutDet;

	@Autowired
	private CommonService commonService;

	/** 1. TDRD_STTB_UPLOAD_CUST_ACCOUNT */
	@Bean
	public Job tdrdsttbuploadcustaccount() {
		return jobBuilderFactory.get("tdrdsttbuploadcustaccount").incrementer(new RunIdIncrementer())
				.start(sttbUploadCustAccountChunkStep()).build();
	}

	
	private Step sttbUploadCustAccountChunkStep() {
		return stepBuilderFactory.get("TRANS_STTB_UPLOAD_CUST_ACCOUNT")
				.<TransSttbUploadCustAccountModel, TransSttbUploadCustAccount>chunk(100)
				.reader(flatFileItemReaderSttbUploadCustAccount()).processor(firstItemProSttbUploadCustAccount)
				.writer(jpaItemWriterSttbUploadCustAccount()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerSttbUploadCustAccount)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransSttbUploadCustAccountModel> flatFileItemReaderSttbUploadCustAccount() {
		FlatFileItemReader<TransSttbUploadCustAccountModel> flatFileItemReader = new FlatFileItemReader<TransSttbUploadCustAccountModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTB_UPLOAD_CUST_ACCOUNT");

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttbUploadCustAccountModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("MAINTENANCE_SEQ_NO", "SOURCE_CODE", "BRANCH_CODE", "CUST_AC_NO", "AC_DESC", "CUST_NO",
								"CCY", "ACCOUNT_CLASS", "AC_STAT_NO_DR", "AC_STAT_NO_CR", "AC_STAT_BLOCK",
								"AC_STAT_STOP_PAY", "AC_STAT_DORMANT", "JOINT_AC_INDICATOR", "AC_OPEN_DATE",
								"AC_STMT_DAY", "AC_STMT_CYCLE", "ALT_AC_NO", "CHEQUE_BOOK_FACILITY", "ATM_FACILITY",
								"PASSBOOK_FACILITY", "AC_STMT_TYPE", "DR_HO_LINE", "CR_HO_LINE", "CR_CB_LINE",
								"DR_CB_LINE", "SUBLIMIT", "UNCOLL_FUNDS_LIMIT", "AC_STAT_FROZEN",
								"PREVIOUS_STATEMENT_DATE", "PREVIOUS_STATEMENT_BALANCE", "PREVIOUS_STATEMENT_NO",
								"TOD_LIMIT_START_DATE", "TOD_LIMIT_END_DATE", "TOD_LIMIT", "NOMINEE1", "NOMINEE2",
								"DR_GL", "CR_GL", "LIMIT_CCY", "LINE_ID", "OFFLINE_LIMIT", "CAS_ACCOUNT",
								"ACC_STMT_TYPE2", "ACC_STMT_DAY2", "AC_STMT_CYCLE2", "PREVIOUS_STATEMENT_DATE2",
								"PREVIOUS_STATEMENT_BALANCE2", "PREVIOUS_STATEMENT_NO2", "GEN_STMT_ONLY_ON_MVMT2",
								"ACC_STMT_TYPE3", "ACC_STMT_DAY3", "AC_STMT_CYCLE3", "PREVIOUS_STATEMENT_DATE3",
								"PREVIOUS_STATEMENT_BALANCE3", "PREVIOUS_STATEMENT_NO3", "GEN_STMT_ONLY_ON_MVMT3",
								"DR_AUTO_EX_RATE_LMT", "CR_AUTO_EX_RATE_LMT", "ADDRESS1", "ADDRESS2", "ADDRESS3",
								"ADDRESS4", "TYPE_OF_CHQ", "ATM_CUST_AC_NO", "ATM_DLY_AMT_LIMIT", "ATM_DLY_COUNT_LIMIT",
								"GEN_STMT_ONLY_ON_MVMT", "AC_STAT_DE_POST", "DISPLAY_IBAN_IN_ADVICES",
								"CLEARING_BANK_CODE", "CLEARING_AC_NO", "IBAN_AC_NO", "REG_CC_AVAILABILITY",
								"MT210_REQD", "SWEEP_TYPE", "MIN_REQD_BAL", "DORMANT_PARAM", "POSITIVE_PAY_AC",
								"STALE_DAYS", "TRACK_RECEIVABLE", "REG_D_APPLICABLE", "REGD_PERIODICITY",
								"NETTING_REQUIRED", "LODGEMENT_BOOK_FACILITY", "REFERRAL_REQUIRED",
								"AUTO_REORDER_CHECK_REQUIRED", "AUTO_REORDER_CHECK_LEVEL", "AUTO_REORDER_CHECK_LEAVES",
								"CHECKBOOK_NAME_1", "CHECKBOOK_NAME_2", "ACC_STATUS", "STATUS_SINCE",
								"INHERIT_REPORTING", "OVERDRAFT_SINCE", "PREV_OVD_DATE", "STATUS_CHANGE_AUTOMATIC",
								"OVERLINE_OD_SINCE", "TOD_SINCE", "PREV_TOD_SINCE", "EXCL_SAMEDAY_RVRTRNS_FM_STMT",
								"ALLOW_BACK_PERIOD_ENTRY", "AUTO_PROV_REQD", "EXPOSURE_CATEGORY",
								"RISK_FREE_EXP_AMOUNT", "PROV_CCY_TYPE", "DEFER_RECON", "CONSOLIDATION_REQD",
								"ACTION_CODE", "FUNDING", "FUNDING_BRANCH", "FUNDING_ACCOUNT", "MOD9_VALIDATION_REQD",
								"VALIDATION_DIGIT", "PRODUCT_LIST", "TXN_CODE_LIST", "SPECIAL_CONDITION_PRODUCT",
								"SPECIAL_CONDITION_TXNCODE", "LOCATION", "MEDIA", "IBAN_REQD", "STATEMENT_ACCOUNT",
								"IBAN_BANK_CODE", "IBAN_ACC", "SOURCE_SEQ_NO", "AUTO_DEPOSITS_BAL", "MASTER_ACCOUNT_NO",
								"XREF", "OTHERDET", "GEN_INTERIM_STMT", "GEN_INTERIM_STMT_ON_MVMT",
								"GEN_BALANCE_REPORT", "INTERIM_REPORT_SINCE", "INTERIM_REPORT_TYPE",
								"BALANCE_REPORT_SINCE", "BALANCE_REPORT_TYPE", "INTERIM_DEBIT_AMT",
								"INTERIM_CREDIT_AMT", "INTERIM_STMT_DAY_COUNT", "INTERIM_STMT_YTD_COUNT",
								"DAYLIGHT_LIMIT_AMOUNT", "COUNTRY_CODE", "SOD_NOTIFICATION_PERCENT", "FUND_ID",
								"ZAKAT_EXEMPTION", "LINKED_DEP_BRANCH", "LINKED_DEP_ACC", "MUDARABAH_ACCOUNTS",
								"ACCOUNT_AUTO_CLOSED", "ESCROW_TRANSFER", "ESCROW_BRANCH_CODE", "ESCROW_AC_NO",
								"ESCROW_PERCENTAGE", "SALARY_ACCOUNT", "NO_OF_CHQ_REJ_RESET_ON", "REPL_CUST_SIG",
								"MAX_NO_CHEQUE_REJECTIONS", "NO_CHEQUE_REJECTIONS", "CHECKER_ID", "CHECKER_DT_STAMP",
								"RECORD_STAT", "MAKER_ID", "MAKER_DT_STAMP", "ONCE_AUTH", "AUTH_STAT", "MOD_NO",
								"DORMANCY_DAYS", "DORMANCY_DATE", "REGD_START_DATE", "REGD_END_DATE",
								"AUTO_CREATE_POOL", "AUTO_DC_REQUEST", "AUTO_CHQBK_REQUEST", "INF_ACC_OPENING_AMT",
								"INF_PAY_IN_OPTION", "INF_OFFSET_BRANCH", "INF_OFFSET_ACCOUNT",
								"INF_WAIVE_ACC_OPEN_CHARGE", "ACCOUNT_TYPE", "INTERMEDIARY_REQUIRED", "AUTO_DEPOSIT",
								"SWEEP_REQUIRED", "SWEEP_OUT", "SPEND_ANALYSIS_REQD", "GOAL_REF_NO", "SPL_AC_GEN",
								"IBAN_REQUIRED", "DIRECT_BANKING", "AC_STAT_DR_OVD", "AC_STAT_CR_OVD",
								"MODE_OF_OPERATION", "PINCODE", "MULTI_CCY_AC_NO", "CONTRIBUTE_TO_PDM",
								"EXCLUDE_FROM_DISTRIBUTION");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttbUploadCustAccountModel>() {
					{
						setTargetType(TransSttbUploadCustAccountModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransSttbUploadCustAccount> jpaItemWriterSttbUploadCustAccount() {
		JpaItemWriter<TransSttbUploadCustAccount> jpaItemWriter = new JpaItemWriter<TransSttbUploadCustAccount>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 2. ICTM_UPLOAD_ACC */
	@Bean
	public Job tdrdictmuploadacc() {
		return jobBuilderFactory.get("tdrdictmuploadacc").incrementer(new RunIdIncrementer())
				.start(ictmUploadAccChklstChunkStep()).build();
	}

	private Step ictmUploadAccChklstChunkStep() {
		return stepBuilderFactory.get("TRANS_ICTM_UPLOAD_ACC").<TransIctmUploadAccModel, TransIctmUploadAcc>chunk(100)
				.reader(flatFileItemReaderIctmUploadAcc()).processor(firstItemProIctmUploadAcc)
				.writer(jpaItemWriterIctmUploadAcc()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerIctmUploadAcc)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransIctmUploadAccModel> flatFileItemReaderIctmUploadAcc() {
		FlatFileItemReader<TransIctmUploadAccModel> flatFileItemReader = new FlatFileItemReader<TransIctmUploadAccModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_ICTM_UPLOAD_ACC");

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransIctmUploadAccModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE", "BRANCH", "MODULE", "BRN", "ACC", "CALC_ACC", "BOOK_ACC", "HAS_IS",
								"INT_START_DATE", "LAST_IS_DATE", "ACC_TYPE", "BOOK_BRN", "CONV_STATUS", "ERR_MSG",
								"CHARGE_BOOK_BRN", "CHARGE_BOOK_ACC", "AUTO_ROLLOVER", "CLOSE_ON_MATURITY",
								"MOVE_INT_TO_UNCLAIMED", "MOVE_PRIC_TO_UNCLAIMED", "MATURITY_DATE", "PRINC_LIQ_AC",
								"ROLLOVER_TYPE", "ROLLOVER_AMT", "PRINC_LIQ_BRANCH", "NEXT_MATURITY_DATE", "BOOK_CCY",
								"HAS_DRCR_ADV", "RD_FLAG", "RD_AUTO_PMNT_TAKEDOWN", "RD_MOVE_MAT_TO_UNCLAIMED",
								"RD_MOVE_FUNDS_ON_OVD", "RD_TAKEDOWN_DAYS", "RD_TAKEDOWN_MONTHS", "RD_TAKEDOWN_YEARS",
								"RD_PAYMENT_ACC", "RD_PAYMENT_BRN", "RD_PAYMENT_CCY", "RD_INSTALLMENT_AMT",
								"RD_PAY_SCHDT", "CHG_START_DATE", "SOURCE_SEQ_NO", "MAINTENANCE_SEQ_NO", "TENOR_CODE",
								"AUTO_EXTENSION", "LIQUIDATION_AMT", "LAST_ROLLOVER_DATE", "ALLOW_PREPAYMENT",
								"INTEREST_RATE", "MATURITY_AMOUNT", "INTRATE_CUMAMT_REQD", "INTRATE_CUMAMT_ROLL_REQD",
								"ROLL_TENOR_PREF", "ORIG_TENOR_DAYS", "ORIG_TENOR_MONTHS", "ORIG_TENOR_YEARS",
								"ROLL_TENOR_DAYS", "ROLL_TENOR_MONTHS", "ROLL_TENOR_YEARS", "DEP_TENOR_PREF",
								"CASCADE_MONTH", "ADD_FUNDS", "ADDITIONAL_AMT");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransIctmUploadAccModel>() {
					{
						setTargetType(TransIctmUploadAccModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransIctmUploadAcc> jpaItemWriterIctmUploadAcc() {
		JpaItemWriter<TransIctmUploadAcc> jpaItemWriter = new JpaItemWriter<TransIctmUploadAcc>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 3. ICTM_ACC_PR_UPLOAD */
	@Bean
	public Job tdrdictmaccprupload() {
		return jobBuilderFactory.get("tdrdictmaccprupload").incrementer(new RunIdIncrementer())
				.start(ictmAccPrUploadChunkStep()).build();
	}

	private Step ictmAccPrUploadChunkStep() {
		return stepBuilderFactory.get("TRANS_ICTM_ACC_PR_UPLOAD")
				.<TransIctmAccPrUploadModel, TransIctmAccPrUpload>chunk(100).reader(flatFileItemReaderIctmAccPrUpload())
				.processor(firstItemProIctmAccPrUpload).writer(jpaItemWriterIctmAccPrUpload()).faultTolerant()
				.skip(Throwable.class).skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerIctmAccPrUpload)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransIctmAccPrUploadModel> flatFileItemReaderIctmAccPrUpload() {
		FlatFileItemReader<TransIctmAccPrUploadModel> flatFileItemReader = new FlatFileItemReader<TransIctmAccPrUploadModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_ICTM_ACC_PR_UPLOAD");

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransIctmAccPrUploadModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("maintenance_seq_no", "source_code", "brn", "acc", "prod", "waive", "gen_uca",
								"record_stat", "once_auth ", "ude_ccy", "min_amt", "max_amt", "free_txn",
								"process_status", "source_seq_no", "branch_code", "cont_var_roll");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransIctmAccPrUploadModel>() {
					{
						setTargetType(TransIctmAccPrUploadModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());
		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransIctmAccPrUpload> jpaItemWriterIctmAccPrUpload() {
		JpaItemWriter<TransIctmAccPrUpload> jpaItemWriter = new JpaItemWriter<TransIctmAccPrUpload>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 4. ICTM_ACC_EFFDT_UPLOAD */
	@Bean
	public Job tdrdictmacceffdtupload() {
		return jobBuilderFactory.get("tdrdictmacceffdtupload").incrementer(new RunIdIncrementer())
				.start(ictmAccEffdtUploadChunkStep()).build();
	}

	private Step ictmAccEffdtUploadChunkStep() {
		return stepBuilderFactory.get("TRANS_ICTM_ACC_EFFDT_UPLOAD")
				.<TransIctmAccEffdtUploadModel, TransIctmAccEffdtUpload>chunk(100)
				.reader(flatFileItemReaderIctmAccEffdtUpload()).processor(firstItemProIctmAccEffdtUpload)
				.writer(jpaItemWriterIctmAccEffdtUpload()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerIctmAccEffdtUpload)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransIctmAccEffdtUploadModel> flatFileItemReaderIctmAccEffdtUpload() {
		FlatFileItemReader<TransIctmAccEffdtUploadModel> flatFileItemReader = new FlatFileItemReader<TransIctmAccEffdtUploadModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_ICTM_ACC_EFFDT_UPLOAD");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransIctmAccEffdtUploadModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("MAINTENANCE_SEQ_NO", "SOURCE_CODE", "BRN", "ACC", "PROD", "UDE_EFF_DT", "RECORD_STAT",
								"ONCE_AUTH", "SOURCE_SEQ_NO", "BRANCH_CODE");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransIctmAccEffdtUploadModel>() {
					{
						setTargetType(TransIctmAccEffdtUploadModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransIctmAccEffdtUpload> jpaItemWriterIctmAccEffdtUpload() {
		JpaItemWriter<TransIctmAccEffdtUpload> jpaItemWriter = new JpaItemWriter<TransIctmAccEffdtUpload>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 5. ICTM_ACC_UDEVALS_UPLOAD */
	@Bean
	public Job tdrdictmaccudevalsupload() {
		return jobBuilderFactory.get("tdrdictmaccudevalsupload").incrementer(new RunIdIncrementer())
				.start(ictmAccUdevalsUploadChunkStep()).build();
	}

	private Step ictmAccUdevalsUploadChunkStep() {
		return stepBuilderFactory.get("TRANS_ICTM_ACC_UDEVALS_UPLOAD")
				.<TransIctmAccUdevalsUploadModel, TransIctmAccUdevalsUpload>chunk(100)
				.reader(flatFileItemReaderIctmAccUdevalsUpload()).processor(firstItemProIctmAccUdevalsUpload)
				.writer(jpaItemWriterIctmAccUdevalsUpload()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerIctmAccUdevalsUpload)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransIctmAccUdevalsUploadModel> flatFileItemReaderIctmAccUdevalsUpload() {
		FlatFileItemReader<TransIctmAccUdevalsUploadModel> flatFileItemReader = new FlatFileItemReader<TransIctmAccUdevalsUploadModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_ICTM_ACC_UDEVALS_UPLOAD");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransIctmAccUdevalsUploadModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("MAINTENANCE_SEQ_NO", "SOURCE_CODE", "BRN", "ACC", "PROD", "UDE_EFF_DT", "UDE_ID",
								"UDE_VALUE", "RATE_CODE", "AUTH_STAT", "RECORD_STAT", "SOURCE_SEQ_NO", "BRANCH_CODE",
								"BASE_RATE", "BASE_SPREAD", "TD_RATE_CODE", "UDE_VARIANCE");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransIctmAccUdevalsUploadModel>() {
					{
						setTargetType(TransIctmAccUdevalsUploadModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransIctmAccUdevalsUpload> jpaItemWriterIctmAccUdevalsUpload() {
		JpaItemWriter<TransIctmAccUdevalsUpload> jpaItemWriter = new JpaItemWriter<TransIctmAccUdevalsUpload>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 6. MITB_UPLOAD_CLASS_MAPPING */
	@Bean
	public Job tdrdmitbuploadclassmapping() {
		return jobBuilderFactory.get("tdrdmitbuploadclassmapping").incrementer(new RunIdIncrementer())
				.start(mitbUploadClassMappingChunkStep()).build();
	}

	private Step mitbUploadClassMappingChunkStep() {
		return stepBuilderFactory.get("TRANS_MITB_UPLOAD_CLASS_MAPPING")
				.<TransMitbUploadClassMappingModel, TransMitbUploadClassMapping>chunk(100)
				.reader(flatFileItemReaderMitbUploadClassMapping()).processor(firstItemProMitbUploadClassMapping)
				.writer(jpaItemWriterMitbUploadClassMapping()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerMitbUploadClassMapping)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransMitbUploadClassMappingModel> flatFileItemReaderMitbUploadClassMapping() {
		FlatFileItemReader<TransMitbUploadClassMappingModel> flatFileItemReader = new FlatFileItemReader<TransMitbUploadClassMappingModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_MITB_UPLOAD_CLASS_MAPPING");

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransMitbUploadClassMappingModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("source_code", "external_ref_no", "serial_no", "related_ref", "ccy", "customer",
								"unit_type", "mis_head", "pool_code", "calc_method", "mis_group", "mis_group_txn",
								"mis_group_comp", "fund_mis_1", "fund_mis_2", "fund_mis_3", "fund_mis_4", "fund_mis_5",
								"fund_mis_6", "fund_mis_7", "fund_mis_8", "fund_mis_9", "fund_mis_10", "branch_code",
								"related_account", "rate_flag", "ref_rate", "ref_spread", "ref_rate_type",
								"ref_rate_code", "processed_flag", "comp_mis_1", "comp_mis_2", "comp_mis_3",
								"comp_mis_4", "comp_mis_5", "comp_mis_6", "comp_mis_7", "comp_mis_8", "comp_mis_9",
								"comp_mis_10", "txn_mis_1", "txn_mis_2", "txn_mis_3", "txn_mis_4", "txn_mis_5",
								"txn_mis_6", "txn_mis_7", "txn_mis_8", "txn_mis_9", "txn_mis_10", "cost_code1",
								"cost_code2", "cost_code3", "cost_code4", "cost_code5", "ext_seq_no", "source_ref",
								"source_seq_no");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransMitbUploadClassMappingModel>() {
					{
						setTargetType(TransMitbUploadClassMappingModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransMitbUploadClassMapping> jpaItemWriterMitbUploadClassMapping() {
		JpaItemWriter<TransMitbUploadClassMapping> jpaItemWriter = new JpaItemWriter<TransMitbUploadClassMapping>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 7. STTB_UPLOAD_LINKED_ENTITIES */
	@Bean
	public Job tdrdsttbuploadlinkedentities() {
		return jobBuilderFactory.get("tdrdsttbuploadlinkedentities").incrementer(new RunIdIncrementer())
				.start(sttbUploadLinkedEntitiesChunkStep()).build();
	}

	private Step sttbUploadLinkedEntitiesChunkStep() {
		return stepBuilderFactory.get("TRANS_STTB_UPLOAD_LINKED_ENTITIES")
				.<TransSttbUploadLinkedEntitiesModel, TransSttbUploadLinkedEntities>chunk(100)
				.reader(flatFileItemReaderSttbUploadLinkedEntities()).processor(firstItemProSttbUploadLinkedEntities)
				.writer(jpaItemWriterSttbUploadLinkedEntities()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy())
				// .listener(skipListenerSttbUploadLinkedEntities)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransSttbUploadLinkedEntitiesModel> flatFileItemReaderSttbUploadLinkedEntities() {
		FlatFileItemReader<TransSttbUploadLinkedEntitiesModel> flatFileItemReader = new FlatFileItemReader<TransSttbUploadLinkedEntitiesModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTB_UPLOAD_LINKED_ENTITIES");

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttbUploadLinkedEntitiesModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("BRANCH_CODE", "CUST_AC_NO", "JOINT_HOLDER_CODE", "JOINT_HOLDER_DESCRIPTION",
								"JOINT_HOLDER", "MAINTENANCE_SEQ_NO", "SOURCE_SEQ_NO", "SOURCE_CODE", "START_DATE",
								"END_DATE");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttbUploadLinkedEntitiesModel>() {
					{
						setTargetType(TransSttbUploadLinkedEntitiesModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransSttbUploadLinkedEntities> jpaItemWriterSttbUploadLinkedEntities() {
		JpaItemWriter<TransSttbUploadLinkedEntities> jpaItemWriter = new JpaItemWriter<TransSttbUploadLinkedEntities>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 8. ICTM_UPLOAD_TD_DETAILS */
	@Bean
	public Job tdrdictmuploadtddetails() {
		return jobBuilderFactory.get("tdrdictmuploadtddetails").incrementer(new RunIdIncrementer())
				.start(ictmUploadTdDetailsChunkStep()).build();
	}

	private Step ictmUploadTdDetailsChunkStep() {
		return stepBuilderFactory.get("TRANS_ICTM_UPLOAD_TD_DETAILS")
				.<TransIctmUploadTdDetailsModel, TransIctmUploadTdDetails>chunk(100)
				.reader(flatFirstItemProIctmUploadTdDetails()).processor(firstItemProIctmUploadTdDetails)
				.writer(jpaItemWriterIctmUploadTdDetails()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerIctmUploadTdDetails)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransIctmUploadTdDetailsModel> flatFirstItemProIctmUploadTdDetails() {
		FlatFileItemReader<TransIctmUploadTdDetailsModel> flatFileItemReader = new FlatFileItemReader<TransIctmUploadTdDetailsModel>();
//		String csv_file_path = commonService.getLegacyDataDetails("TRANS_ICTM_UPLOAD_TD_DETAILS");
		String csv_file_path = "C:/Users/2942/Downloads/TD_ICTM_TDPAYIN_DETAILS";

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransIctmUploadTdDetailsModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("maintenance_seq_no", "source_code", "brn", "acc", "ccy", "payin_option", "td_amount",
								"offset_brn", "td_offset_acc", "reference_no", "source_seq_no", "branch_code",
								"redem_amt", "liq_amt", "stock_catlog_cd", "certificate_no", "duplicate_issue",
								"target_amount");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransIctmUploadTdDetailsModel>() {
					{
						setTargetType(TransIctmUploadTdDetailsModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());
		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransIctmUploadTdDetails> jpaItemWriterIctmUploadTdDetails() {
		JpaItemWriter<TransIctmUploadTdDetails> jpaItemWriter = new JpaItemWriter<TransIctmUploadTdDetails>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 9. TRANS_ICTM_UPLOAD_TDPAYIN_DET */
	@Bean
	public Job tdrdictmuploadtdpayindet() {
		return jobBuilderFactory.get("tdrdictmuploadtdpayindet").incrementer(new RunIdIncrementer())
				.start(ictmUploadTdpayinDetChunkStep()).build();
	}

	private Step ictmUploadTdpayinDetChunkStep() {
		return stepBuilderFactory.get("TRANS_ICTM_UPLOAD_TDPAYIN_DET")
				.<TransIctmUploadTdpayinDetModel, TransIctmUploadTdpayinDet>chunk(100)
				.reader(flatFirstItemProIctmUploadTdpayinDet()).processor(firstItemProIctmUploadTdpayinDet)
				.writer(jpaItemWriterIctmUploadTdpayinDet()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerIctmUploadTdpayinDet)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransIctmUploadTdpayinDetModel> flatFirstItemProIctmUploadTdpayinDet() {
		FlatFileItemReader<TransIctmUploadTdpayinDetModel> flatFileItemReader = new FlatFileItemReader<TransIctmUploadTdpayinDetModel>();
		//String csv_file_path = commonService.getLegacyDataDetails("TRANS_ICTM_UPLOAD_TDPAYIN_DET");
		String csv_file_path = "C:/Users/2942/Downloads/TD_ICTM_TDPAYIN_DETAILS_UPLOAD.csv";

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransIctmUploadTdpayinDetModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("brn", "acc", "ccy", "multimode_payopt", "multimode_tdamount", "multimode_offset_brn",
								"multimode_tdoffset_acc", "multimode_tdoffset_ccy", "reference_no",
								"multimode_percentage", "mulitmode_xrate", "seqno", "maintenance_seq_no", "source_code",
								"source_seq_no", "chq_instumentno", "clg_bank_code", "clg_branch_code",
								"clg_product_code", "chq_instrument_date", "drawee_ac_no", "routing_no");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransIctmUploadTdpayinDetModel>() {
					{
						setTargetType(TransIctmUploadTdpayinDetModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());
		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransIctmUploadTdpayinDet> jpaItemWriterIctmUploadTdpayinDet() {
		JpaItemWriter<TransIctmUploadTdpayinDet> jpaItemWriter = new JpaItemWriter<TransIctmUploadTdpayinDet>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 10. TRANS_ICTM_UPLOAD_TDPAYOUT_DET */
	@Bean
	public Job tdrdictmuploadtdpayoutdet() {
		return jobBuilderFactory.get("tdrdictmuploadtdpayoutdet").incrementer(new RunIdIncrementer())
				.start(ictmUploadTdpayoutDetChunkStep()).build();
	}

	private Step ictmUploadTdpayoutDetChunkStep() {
		return stepBuilderFactory.get("TRANS_ICTM_UPLOAD_TDPAYOUT_DET")
				.<TransIctmUploadTdpayoutDetModel, TransIctmUploadTdpayoutDet>chunk(100)
				.reader(flatFirstItemProIctmUploadTdpayoutDet()).processor(firstItemProIctmUploadTdpayoutDet)
				.writer(jpaItemWriterIctmUploadTdpayoutDet()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerIctmUploadTdpayoutDet)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransIctmUploadTdpayoutDetModel> flatFirstItemProIctmUploadTdpayoutDet() {
		FlatFileItemReader<TransIctmUploadTdpayoutDetModel> flatFileItemReader = new FlatFileItemReader<TransIctmUploadTdpayoutDetModel>();
		/*
		 * String csv_file_path =
		 * commonService.getLegacyDataDetails("TRANS_ICTM_UPLOAD_TDPAYOUT_DET");
		 */
		String csv_file_path = "C:/Users/2942/Downloads/TD_ICTM_UPLOAD_PAYOUT_DET.csv";

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransIctmUploadTdpayoutDetModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("brn", "acc", "ccy", "payouttype", "bankcode", "offset_brn", "offset_acc",
								"offset_ccy", "percentage", "redmamt", "benfname", "benfadd1", "benfadd2", "otherdets",
								"narrative", "xrate", "ref_no", "seqno", "maintenance_seq_no", "source_code",
								"source_seq_no", "payout_component", "instno", "waive_issue_chg");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransIctmUploadTdpayoutDetModel>() {
					{
						setTargetType(TransIctmUploadTdpayoutDetModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		flatFileItemReader.setRecordSeparatorPolicy(new BlankLineRecordSeparatorPolicy());
		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransIctmUploadTdpayoutDet> jpaItemWriterIctmUploadTdpayoutDet() {
		JpaItemWriter<TransIctmUploadTdpayoutDet> jpaItemWriter = new JpaItemWriter<TransIctmUploadTdpayoutDet>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
}
