	package com.jmr.batch.config;

import java.util.Optional;

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

import com.jmr.batch.entity.LegacyDataVb;
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
import com.jmr.batch.processor.FirstItemProCasaCstmFunctionUserdefFields;
import com.jmr.batch.processor.FirstItemProCstbRelationshipUpload;
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
import com.jmr.framework.service.CommonService;
import com.jmr.repository.LegacyDataRepository;

@Configuration
@EnableBatchProcessing
public class BatchConfigCasa {
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
	private FirstItemProSttmUploadChqbkReq firstItemProSttmUploadChqbkReq;
	/*
	 * @Autowired private FirstItemProSttmUploadSweepDtls
	 * firstItemProSttmUploadSweepDtls;
	 */
	@Autowired
	private FirstItemProMitbUploadClassMapping firstItemProMitbUploadClassMapping;
	@Autowired
	private FirstItemProSttbUploadCustLinkages firstItemProSttbUploadCustLinkages;
	@Autowired
	private FirstItemProSttbUploadLinkedEntities firstItemProSttbUploadLinkedEntities;
	@Autowired
	private FirstItemProCasaCstmFunctionUserdefFields firstItemProCasaCstmFunctionUserdefFields;
	@Autowired
	private LegacyDataRepository repo;

	/*@Autowired
	private FirstItemProCstbRelationshipUpload firstItemProCstbRelationshipUpload;*/

	@Autowired
	private FirstItemProSttmUploadAccountChannel firstItemProSttmUploadAccountChannel;
	@Autowired
	private FirstItemProSvtmUploadAccSigDet firstItemProSvtmUploadAccSigDet;
	@Autowired
	private FirstItemProSvtmUploadAccSigMaster firstItemProSvtmUploadAccSigMaster;

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
	private SkipListenerSttmUploadChqbkReq skipListenerSttmUploadChqbkReq;
	@Autowired
	private SkipListenerSttmUploadAccountChannel skipListenerSttmUploadAccountChannel;
	/*
	 * @Autowired private SkipListenerSttmUploadSweepDtls
	 * skipListenerSttmUploadSweepDtls;
	 */
	@Autowired
	private SkipListenerMitbUploadClassMapping skipListenerMitbUploadClassMapping;
	@Autowired
	private SkipListenerSvtmUploadAccSigMaster skipListenerSvtmUploadAccSigMaster;
	@Autowired
	private SkipListenerSvtmUploadAccSigDet skipListenerSvtmUploadAccSigDet;
	@Autowired
	private SkipListenerSttbUploadCustLinkages skipListenerSttbUploadCustLinkages;
	@Autowired
	private SkipListenerSttbUploadLinkedEntities skipListenerSttbUploadLinkedEntities;
	@Autowired
	private SkipListenerCasaCstmFunctionUserdefFields skipListenerCasaCstmFunctionUserdefFields;
	@Autowired
	private CommonService commonService;
	/** 1. STTB_UPLOAD_CUST_ACCOUNT */
	@Bean
	public Job sttbuploadcustaccount() {
		return jobBuilderFactory.get("sttbuploadcustaccount").incrementer(new RunIdIncrementer())
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
	public Job ictmuploadacc() {
		return jobBuilderFactory.get("ictmuploadacc").incrementer(new RunIdIncrementer())
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
	public Job ictmaccprupload() {
		return jobBuilderFactory.get("ictmaccprupload").incrementer(new RunIdIncrementer())
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
	public Job ictmacceffdtupload() {
		return jobBuilderFactory.get("ictmacceffdtupload").incrementer(new RunIdIncrementer())
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
	public Job ictmaccudevalsupload() {
		return jobBuilderFactory.get("ictmaccudevalsupload").incrementer(new RunIdIncrementer())
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

	/** 6. STTM_UPLOAD_CHQBK_REQ */
	@Bean
	public Job sttmuploadchqbkreq() {
		return jobBuilderFactory.get("ictmaccudevalsupload").incrementer(new RunIdIncrementer())
				.start(sttmUploadChqbkReqChunkStep()).build();
	}

	private Step sttmUploadChqbkReqChunkStep() {
		return stepBuilderFactory.get("TRANS_STTM_UPLOAD_CHQBK_REQ")
				.<TransSttmUploadChqbkReqModel, TransSttmUploadChqbkReq>chunk(100)
				.reader(flatFileItemReaderSttmUploadChqbkReq()).processor(firstItemProSttmUploadChqbkReq)
				.writer(jpaItemWriterSttmUploadChqbkReq()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerSttmUploadChqbkReq)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransSttmUploadChqbkReqModel> flatFileItemReaderSttmUploadChqbkReq() {
		FlatFileItemReader<TransSttmUploadChqbkReqModel> flatFileItemReader = new FlatFileItemReader<TransSttmUploadChqbkReqModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTM_UPLOAD_CHQBK_REQ");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttmUploadChqbkReqModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("MAINTENANCE_SEQ_NO", "SOURCE_CODE", "SOURCE_SEQ_NO", "BRANCH", "ACCOUNT",
								"FIRST_CHECK_NO", "CHECK_LEAVES", "CHEQUE_BOOK_TYPE", "ORDER_DATE", "ORDER_DETAILS",
								"LANGUAGE_CODE", "REQUEST_STATUs", "CHQ_TYPE");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttmUploadChqbkReqModel>() {
					{
						setTargetType(TransSttmUploadChqbkReqModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransSttmUploadChqbkReq> jpaItemWriterSttmUploadChqbkReq() {
		JpaItemWriter<TransSttmUploadChqbkReq> jpaItemWriter = new JpaItemWriter<TransSttmUploadChqbkReq>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 7. STTM_UPLOAD_ACCOUNT_CHANNEL */
	@Bean
	public Job sttmuploadaccountchannel() {
		return jobBuilderFactory.get("sttmuploadaccountchannel").incrementer(new RunIdIncrementer())
				.start(sttmUploadAccountChannelChunkStep()).build();
	}

	private Step sttmUploadAccountChannelChunkStep() {
		return stepBuilderFactory.get("TRANS_STTM_UPLOAD_ACCOUNT_CHANNEL")
				.<TransSttmUploadAccountChannelModel, TransSttmUploadAccountChannel>chunk(100)
				.reader(flatFileItemReaderSttmUploadAccountChannel()).processor(firstItemProSttmUploadAccountChannel)
				.writer(jpaItemWriterSttmUploadAccountChannel()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerSttmUploadAccountChannel)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransSttmUploadAccountChannelModel> flatFileItemReaderSttmUploadAccountChannel() {
		FlatFileItemReader<TransSttmUploadAccountChannelModel> flatFileItemReader = new FlatFileItemReader<TransSttmUploadAccountChannelModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTM_UPLOAD_ACCOUNT_CHANNEL");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttmUploadAccountChannelModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE ", "MAINTENANCE_SEQ_NO", "SOURCE_SEQ_NO", "BRANCH_CODE", "ACCOUNT_NO",
								"CHANNEL_ID", "CHANNEL_NAME", "CHANNEL_REMARKS ");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttmUploadAccountChannelModel>() {
					{
						setTargetType(TransSttmUploadAccountChannelModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransSttmUploadAccountChannel> jpaItemWriterSttmUploadAccountChannel() {
		JpaItemWriter<TransSttmUploadAccountChannel> jpaItemWriter = new JpaItemWriter<TransSttmUploadAccountChannel>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 8. STTM_UPLOAD_SWEEP_DTLS */
	/*
	 * @Bean public Job sttmuploadsweepdtls() { return
	 * jobBuilderFactory.get("sttmuploadsweepdtls").incrementer(new
	 * RunIdIncrementer()) .start(sttmUploadSweepDtlsChunkStep()).build(); } private
	 * Step sttmUploadSweepDtlsChunkStep() { return
	 * stepBuilderFactory.get("TRANS_STTM_UPLOAD_ACCOUNT_CHANNEL")
	 * .<TransSttmUploadSweepDtlsModel, TransSttmUploadSweepDtls>chunk(100)
	 * .reader(flatFileItemReaderSttmUploadSweepDtls()).processor(
	 * firstItemProSttmUploadSweepDtls)
	 * .writer(jpaItemWriterSttmUploadSweepDtls()).faultTolerant().skip(Throwable.
	 * class) .skipPolicy(new
	 * AlwaysSkipItemSkipPolicy()).listener(skipListenerSttmUploadSweepDtls)
	 * .listener(stepResultListener).build(); }
	 * 
	 * 
	 * @StepScope
	 * 
	 * @Bean public FlatFileItemReader<TransSttmUploadSweepDtlsModel>
	 * flatFileItemReaderSttmUploadSweepDtls() {
	 * FlatFileItemReader<TransSttmUploadSweepDtlsModel> flatFileItemReader = new
	 * FlatFileItemReader<TransSttmUploadSweepDtlsModel>(); String csv_file_path =
	 * getLegacyDataDetails("STTM_UPLOAD_SWEEP_DTLS");
	 * flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
	 * flatFileItemReader.setLineMapper(new
	 * DefaultLineMapper<TransSttmUploadSweepDtlsModel>() { { setLineTokenizer(new
	 * DelimitedLineTokenizer() { { setNames(); } });
	 * 
	 * setFieldSetMapper(new
	 * BeanWrapperFieldSetMapper<TransSttmUploadSweepDtlsModel>() { {
	 * setTargetType(TransSttmUploadSweepDtlsModel.class); } });
	 * 
	 * } }); flatFileItemReader.setLinesToSkip(1);
	 * 
	 * 
	 * return flatFileItemReader; }
	 * 
	 * @Bean public JpaItemWriter<TransSttmUploadSweepDtls>
	 * jpaItemWriterSttmUploadSweepDtls() { JpaItemWriter<TransSttmUploadSweepDtls>
	 * jpaItemWriter = new JpaItemWriter<TransSttmUploadSweepDtls>();
	 * jpaItemWriter.setEntityManagerFactory(entityManagerFactory); return
	 * jpaItemWriter; }
	 */

	/** 8. MITB_UPLOAD_CLASS_MAPPING */
	@Bean
	public Job mitbuploadclassmapping() {
		return jobBuilderFactory.get("mitbuploadclassmapping").incrementer(new RunIdIncrementer())
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

	/** 9. SVTM_UPLOAD_ACC_SIG_MASTER */
	@Bean
	public Job svtmuploadaccsigmaster() {
		return jobBuilderFactory.get("svtmuploadaccsigmaster").incrementer(new RunIdIncrementer())
				.start(svtmUploadAccSigMasterChunkStep()).build();
	}

	private Step svtmUploadAccSigMasterChunkStep() {
		return stepBuilderFactory.get("TRANS_SVTM_UPLOAD_ACC_SIG_MASTER")
				.<TransSvtmUploadAccSigMasterModel, TransSvtmUploadAccSigMaster>chunk(100)
				.reader(flatFileItemReaderSvtmUploadAccSigMaster()).processor(firstItemProSvtmUploadAccSigMaster)
				.writer(jpaItemWriterSvtmUploadAccSigMaster()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerSvtmUploadAccSigMaster)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransSvtmUploadAccSigMasterModel> flatFileItemReaderSvtmUploadAccSigMaster() {
		FlatFileItemReader<TransSvtmUploadAccSigMasterModel> flatFileItemReader = new FlatFileItemReader<TransSvtmUploadAccSigMasterModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_SVTM_UPLOAD_ACC_SIG_MASTER");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSvtmUploadAccSigMasterModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("MAINTENANCE_SEQ_NO", "SOURCE_CODE", "BRANCH", "ACC_NO", "ACC_MSG", "MIN_NO_OF_SIG",
								"SOURCE_SEQ_NO");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSvtmUploadAccSigMasterModel>() {
					{
						setTargetType(TransSvtmUploadAccSigMasterModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);
		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransSvtmUploadAccSigMaster> jpaItemWriterSvtmUploadAccSigMaster() {
		JpaItemWriter<TransSvtmUploadAccSigMaster> jpaItemWriter = new JpaItemWriter<TransSvtmUploadAccSigMaster>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 10. SVTM_UPLOAD_ACC_SIG_DET */
	@Bean
	public Job svtmuploadaccsigdet() {
		return jobBuilderFactory.get("svtmuploadaccsigdet_Job").incrementer(new RunIdIncrementer())
				.start(svtmUploadAccSigDetChunkStep()).build();
	}

	private Step svtmUploadAccSigDetChunkStep() {
		return stepBuilderFactory.get("TRANS_SVTM_UPLOAD_ACC_SIG_DET")
				.<TransSvtmUploadAccSigDetModel, TransSvtmUploadAccSigDet>chunk(100)
				.reader(flatFileItemReaderSvtmUploadAccSigDet()).processor(firstItemProSvtmUploadAccSigDet)
				.writer(jpaItemWriterSvtmUploadAccSigDet()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerSvtmUploadAccSigDet)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransSvtmUploadAccSigDetModel> flatFileItemReaderSvtmUploadAccSigDet() {
		FlatFileItemReader<TransSvtmUploadAccSigDetModel> flatFileItemReader = new FlatFileItemReader<TransSvtmUploadAccSigDetModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_SVTM_UPLOAD_ACC_SIG_DET");

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSvtmUploadAccSigDetModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("MAINTENANCE_SEQ_NO", "SOURCE_CODE", "BRANCH", "ACC_NO", "CIF_SIG_ID", "SIG_MSG",
								"SIG_TYPE", "APPROVAL_LIMIT", "SOLO_SUFFICIENT", "RECORD_STAT", "CIF_SIG_NAME",
								"SOURCE_SEQ_NO", "CIFID");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSvtmUploadAccSigDetModel>() {
					{
						setTargetType(TransSvtmUploadAccSigDetModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransSvtmUploadAccSigDet> jpaItemWriterSvtmUploadAccSigDet() {
		JpaItemWriter<TransSvtmUploadAccSigDet> jpaItemWriter = new JpaItemWriter<TransSvtmUploadAccSigDet>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 11. STTB_UPLOAD_CUST_LINKAGES */
	@Bean
	public Job sttbuploadcustlinkages() {
		return jobBuilderFactory.get("sttbuploadcustlinkages").incrementer(new RunIdIncrementer())
				.start(sttbUploadCustLinkagesChunkStep()).build();
	}

	private Step sttbUploadCustLinkagesChunkStep() {
		return stepBuilderFactory.get("TRANS_STTB_UPLOAD_CUST_LINKAGES")
				.<TransSttbUploadCustLinkagesModel, TransSttbUploadCustLinkages>chunk(100)
				.reader(flatFileItemReaderSttbUploadCustLinkages()).processor(firstItemProSttbUploadCustLinkages)
				.writer(jpaItemWriterSttbUploadCustLinkages()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerSttbUploadCustLinkages)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransSttbUploadCustLinkagesModel> flatFileItemReaderSttbUploadCustLinkages() {
		FlatFileItemReader<TransSttbUploadCustLinkagesModel> flatFileItemReader = new FlatFileItemReader<TransSttbUploadCustLinkagesModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTB_UPLOAD_CUST_LINKAGES");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttbUploadCustLinkagesModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("MAINTENANCE_SEQ_NO", "SOURCE_CODE", "BRANCH_CODE", "CUST_AC_NO", "CUSTOMER_NO",
								"LINKAGE_TYPE", "LINKED_REF_NO", "LINKAGE_PERCENTAGE", "LINKAGE_SEQ_NO",
								"LINKAGE_BRANCH", "LINKED_CCY", "SOURCE_SEQ_NO", "EFFECTIVE_DATE");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttbUploadCustLinkagesModel>() {
					{
						setTargetType(TransSttbUploadCustLinkagesModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransSttbUploadCustLinkages> jpaItemWriterSttbUploadCustLinkages() {
		JpaItemWriter<TransSttbUploadCustLinkages> jpaItemWriter = new JpaItemWriter<TransSttbUploadCustLinkages>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/** 12. STTB_UPLOAD_LINKED_ENTITIES */
	@Bean
	public Job sttbuploadlinkedentities() {
		return jobBuilderFactory.get("sttbuploadlinkedentities").incrementer(new RunIdIncrementer())
				.start(sttbUploadLinkedEntitiesChunkStep()).build();
	}

	private Step sttbUploadLinkedEntitiesChunkStep() {
		return stepBuilderFactory.get("TRANS_STTB_UPLOAD_LINKED_ENTITIES")
				.<TransSttbUploadLinkedEntitiesModel, TransSttbUploadLinkedEntities>chunk(100)
				.reader(flatFileItemReaderSttbUploadLinkedEntities()).processor(firstItemProSttbUploadLinkedEntities)
				.writer(jpaItemWriterSttbUploadLinkedEntities()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy())
				//.listener(skipListenerSttbUploadLinkedEntities)
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

	/** 13. CASA_CSTM_FUNCTION_USERDEF_FIELDS */
	@Bean
	public Job casacstmfunctionuserdeffields() {
		return jobBuilderFactory.get("casacstmfunctionuserdeffields").incrementer(new RunIdIncrementer())
				.start(casaCstmFunctionUserdefFieldsChunkStep()).build();
	}

	private Step casaCstmFunctionUserdefFieldsChunkStep() {
		return stepBuilderFactory.get("TRANS_CASA_CSTM_FUNCTION_USERDEF_FIELDS")
				.<TransCasaCstmFunctionUserdefFieldsModel, TransCasaCstmFunctionUserdefFields>chunk(100)
				.reader(flatFileItemReaderCasaCstmFunctionUserdefFields())
				.processor(firstItemProCasaCstmFunctionUserdefFields)
				.writer(jpaItemWriterCasaCstmFunctionUserdefFields()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(skipListenerCasaCstmFunctionUserdefFields)
				.listener(stepResultListener).build();
	}

	@StepScope
	@Bean
	public FlatFileItemReader<TransCasaCstmFunctionUserdefFieldsModel> flatFileItemReaderCasaCstmFunctionUserdefFields() {
		FlatFileItemReader<TransCasaCstmFunctionUserdefFieldsModel> flatFileItemReader = new FlatFileItemReader<TransCasaCstmFunctionUserdefFieldsModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_CASA_CSTM_FUNCTION_USERDEF_FIELDS");

		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCasaCstmFunctionUserdefFieldsModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("FUNCTION_ID", "REC_KEY", "FIELD_VAL_1", "FIELD_VAL_2", "FIELD_VAL_3", "FIELD_VAL_4",
								"FIELD_VAL_5", "FIELD_VAL_6", "FIELD_VAL_7", "FIELD_VAL_8", "FIELD_VAL_9",
								"FIELD_VAL_10", "FIELD_VAL_11", "FIELD_VAL_12", "FIELD_VAL_13", "FIELD_VAL_14",
								"FIELD_VAL_15", "FIELD_VAL_16", "FIELD_VAL_17", "FIELD_VAL_18", "FIELD_VAL_19",
								"FIELD_VAL_20", "FIELD_VAL_21", "FIELD_VAL_22", "FIELD_VAL_23", "FIELD_VAL_24",
								"FIELD_VAL_25", "FIELD_VAL_26", "FIELD_VAL_27", "FIELD_VAL_28", "FIELD_VAL_29",
								"FIELD_VAL_30", "FIELD_VAL_31", "FIELD_VAL_32", "FIELD_VAL_33", "FIELD_VAL_34",
								"FIELD_VAL_35", "FIELD_VAL_36", "FIELD_VAL_37", "FIELD_VAL_38", "FIELD_VAL_39",
								"FIELD_VAL_40", "FIELD_VAL_41", "FIELD_VAL_42", "FIELD_VAL_43", "FIELD_VAL_44",
								"FIELD_VAL_45", "FIELD_VAL_46", "FIELD_VAL_47", "FIELD_VAL_48", "FIELD_VAL_49",
								"FIELD_VAL_50", "FIELD_VAL_51", "FIELD_VAL_52", "FIELD_VAL_53", "FIELD_VAL_54",
								"FIELD_VAL_55", "FIELD_VAL_56", "FIELD_VAL_57", "FIELD_VAL_58", "FIELD_VAL_59",
								"FIELD_VAL_60", "FIELD_VAL_61", "FIELD_VAL_62", "FIELD_VAL_63", "FIELD_VAL_64",
								"FIELD_VAL_65", "FIELD_VAL_66", "FIELD_VAL_67", "FIELD_VAL_68", "FIELD_VAL_69",
								"FIELD_VAL_70", "FIELD_VAL_71", "FIELD_VAL_72", "FIELD_VAL_73", "FIELD_VAL_74",
								"FIELD_VAL_75", "FIELD_VAL_76", "FIELD_VAL_77", "FIELD_VAL_78", "FIELD_VAL_79",
								"FIELD_VAL_80", "FIELD_VAL_81", "FIELD_VAL_82", "FIELD_VAL_83", "FIELD_VAL_84",
								"FIELD_VAL_85", "FIELD_VAL_86", "FIELD_VAL_87", "FIELD_VAL_88", "FIELD_VAL_89",
								"FIELD_VAL_90", "FIELD_VAL_98", "FIELD_VAL_99", "FIELD_VAL_100", "FIELD_VAL_101",
								"FIELD_VAL_102", "FIELD_VAL_103", "FIELD_VAL_104", "FIELD_VAL_105", "FIELD_VAL_106",
								"FIELD_VAL_107", "FIELD_VAL_108", "FIELD_VAL_109", "FIELD_VAL_110", "FIELD_VAL_111",
								"FIELD_VAL_112", "FIELD_VAL_113", "FIELD_VAL_114", "FIELD_VAL_115", "FIELD_VAL_116",
								"FIELD_VAL_117", "FIELD_VAL_118", "FIELD_VAL_119", "FIELD_VAL_120", "FIELD_VAL_121",
								"FIELD_VAL_122", "FIELD_VAL_123", "FIELD_VAL_124", "FIELD_VAL_125", "FIELD_VAL_126",
								"FIELD_VAL_127", "FIELD_VAL_128", "FIELD_VAL_129", "FIELD_VAL_130", "FIELD_VAL_91",
								"FIELD_VAL_92", "FIELD_VAL_93", "FIELD_VAL_94", "FIELD_VAL_95", "FIELD_VAL_96",
								"FIELD_VAL_97", "FIELD_VAL_131", "FIELD_VAL_132", "FIELD_VAL_133", "FIELD_VAL_134",
								"FIELD_VAL_135", "FIELD_VAL_136", "FIELD_VAL_137", "FIELD_VAL_138", "FIELD_VAL_139",
								"FIELD_VAL_140", "FIELD_VAL_141", "FIELD_VAL_142", "FIELD_VAL_143", "FIELD_VAL_144",
								"FIELD_VAL_145", "FIELD_VAL_146", "FIELD_VAL_147", "FIELD_VAL_148", "FIELD_VAL_149",
								"FIELD_VAL_150", "FIELD_VAL_151", "FIELD_VAL_152", "FIELD_VAL_153", "FIELD_VAL_154",
								"FIELD_VAL_155", "FIELD_VAL_156", "FIELD_VAL_157", "FIELD_VAL_158", "FIELD_VAL_159",
								"FIELD_VAL_160", "FIELD_VAL_161", "FIELD_VAL_162", "FIELD_VAL_163", "FIELD_VAL_164",
								"FIELD_VAL_165", "FIELD_VAL_166", "FIELD_VAL_167", "FIELD_VAL_168", "FIELD_VAL_169",
								"FIELD_VAL_170", "FIELD_VAL_171", "FIELD_VAL_172", "FIELD_VAL_173", "FIELD_VAL_174",
								"FIELD_VAL_175", "FIELD_VAL_176", "FIELD_VAL_177", "FIELD_VAL_178", "FIELD_VAL_179",
								"FIELD_VAL_180", "FIELD_VAL_181", "FIELD_VAL_182", "FIELD_VAL_183", "FIELD_VAL_184",
								"FIELD_VAL_185", "FIELD_VAL_186", "FIELD_VAL_187", "FIELD_VAL_188", "FIELD_VAL_189",
								"FIELD_VAL_190", "FIELD_VAL_191", "FIELD_VAL_192", "FIELD_VAL_193", "FIELD_VAL_194",
								"FIELD_VAL_195", "FIELD_VAL_196", "FIELD_VAL_197", "FIELD_VAL_198", "FIELD_VAL_199",
								"FIELD_VAL_200");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCasaCstmFunctionUserdefFieldsModel>() {
					{
						setTargetType(TransCasaCstmFunctionUserdefFieldsModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}

	@Bean
	public JpaItemWriter<TransCasaCstmFunctionUserdefFields> jpaItemWriterCasaCstmFunctionUserdefFields() {
		JpaItemWriter<TransCasaCstmFunctionUserdefFields> jpaItemWriter = new JpaItemWriter<TransCasaCstmFunctionUserdefFields>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}

	/*public String getLegacyDataDetails(String tableName) {
		Optional<LegacyDataVb> legacyDataVb = repo.findById(tableName);
		return legacyDataVb.get().getCsv_file_path();
	}*/
}
