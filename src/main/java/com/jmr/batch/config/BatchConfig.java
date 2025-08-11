package com.jmr.batch.config;



import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
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
import org.springframework.validation.BindException;

import com.jmr.batch.entity.TransCstmFunctionUserdefFields;
import com.jmr.batch.entity.TransMitmUploadCustomerDefault;
import com.jmr.batch.entity.TransSttmAutoLiabUpload;
import com.jmr.batch.entity.TransSttmUploadCorpDirectors;
import com.jmr.batch.entity.TransSttmUploadCustCorporate;
import com.jmr.batch.entity.TransSttmUploadCustDomestic;
import com.jmr.batch.entity.TransSttmUploadCustPersonal;
import com.jmr.batch.entity.TransSttmUploadCustProfessional;
import com.jmr.batch.entity.TransSttmUploadCustomer;
import com.jmr.batch.entity.TransSttmUploadDocChklst;
import com.jmr.batch.entity.loan.TransCltbAcUdeUpload;
import com.jmr.batch.listener.JobListener;
import com.jmr.batch.listener.StepResultListener;
import com.jmr.batch.model.TransCstmFunctionUserdefFieldsModel;
import com.jmr.batch.model.TransMitmUploadCustomerDefaultModel;
import com.jmr.batch.model.TransSttmAutoLiabUploadModel;
import com.jmr.batch.model.TransSttmUploadCorpDirectorsModel;
import com.jmr.batch.model.TransSttmUploadCustCorporateModel;
import com.jmr.batch.model.TransSttmUploadCustDomesticModel;
import com.jmr.batch.model.TransSttmUploadCustPersonalModel;
import com.jmr.batch.model.TransSttmUploadCustProfessionalModel;
import com.jmr.batch.model.TransSttmUploadCustomerModel;
import com.jmr.batch.model.TransSttmUploadDocChklstModel;
import com.jmr.batch.model.loan.TransCltbAcUdeUploadModel;
import com.jmr.batch.processor.FirstItemProCstbRelationshipUpload;
import com.jmr.batch.processor.FirstItemProCstmFunctionUserdefFields;
import com.jmr.batch.processor.FirstItemProMitmUploadCustomerDefault;
import com.jmr.batch.processor.FirstItemProSttmAutoLiabUpload;
import com.jmr.batch.processor.FirstItemProSttmUploadCorpDirectors;
import com.jmr.batch.processor.FirstItemProSttmUploadCustCorporate;
import com.jmr.batch.processor.FirstItemProSttmUploadCustDomestic;
import com.jmr.batch.processor.FirstItemProSttmUploadCustPersonal;
import com.jmr.batch.processor.FirstItemProSttmUploadCustProfessional;
import com.jmr.batch.processor.FirstItemProSttmUploadCustomer;
import com.jmr.batch.processor.FirstItemProSttmUploadDocChklst;
import com.jmr.framework.service.CommonService;




@Configuration
@EnableBatchProcessing
public class BatchConfig {
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
	private FirstItemProSttmUploadDocChklst firstItemProSttmUploadDocChklst;
	
	@Autowired
	private FirstItemProSttmUploadCustomer firstItemProSttmUploadCustomer;
	
	@Autowired
	private FirstItemProSttmUploadCustDomestic firstItemProSttmUploadCustDomestic;
	@Autowired
	private FirstItemProMitmUploadCustomerDefault firstItemProMitmUploadCustomerDefault;
	@Autowired
	FirstItemProSttmUploadCustProfessional firstItemProSttmUploadCustProfessional;
	@Autowired
	private FirstItemProSttmUploadCorpDirectors firstItemProSttmUploadCorpDirectors;
	@Autowired
	private FirstItemProSttmUploadCustCorporate firstItemProSttmUploadCustCorporate;
    @Autowired
    private FirstItemProSttmUploadCustPersonal firstItemProSttmUploadCustPersonal;
    @Autowired
    private FirstItemProSttmAutoLiabUpload firstItemProSttmAutoLiabUpload;
    @Autowired
    private FirstItemProCstmFunctionUserdefFields firstItemProCstmFunctionUserdefFields;
    
    //Listener class Object
    @Bean
    public JobExecutionListener listener() {
       return new JobListener();
    }
    @Autowired
	private CommonService commonService;
    /** 1. STTM_UPLOAD_CUSTOMER */
    @Bean
	public Job sttmuploadcustomer() {
		return jobBuilderFactory.get("sttmuploadcustomer").incrementer(new RunIdIncrementer())
				.start(sttmUploadCustomerChunkStep()).build();
	}
    
    private Step sttmUploadCustomerChunkStep() {
		return stepBuilderFactory.get("TRANS_STTM_UPLOAD_CUSTOMER")
				.<TransSttmUploadCustomerModel, TransSttmUploadCustomer>chunk(100)
				.reader(flatFileItemReaderSttmUploadCustomer()).processor(firstItemProSttmUploadCustomer)
				.writer(jpaItemWriterSttmUploadCustomer()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy())
				.listener(stepResultListener).build();
	}

    @StepScope
 	@Bean
	public FlatFileItemReader<TransSttmUploadCustomerModel> flatFileItemReaderSttmUploadCustomer() {
		FlatFileItemReader<TransSttmUploadCustomerModel> flatFileItemReader = new FlatFileItemReader<TransSttmUploadCustomerModel>();
//		String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTM_UPLOAD_CUSTOMER");
		String csv_file_path = "C:/Users/2942/Downloads/STTM_UPLOAD_CUSTOMER.csv";
		
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttmUploadCustomerModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("SOURCE_CODE", "MAINTENANCE_SEQ_NO", "CUSTOMER_NO", "CUSTOMER_TYPE", "CUSTOMER_NAME1",
								"ADDRESS_LINE1", "ADDRESS_LINE3", "ADDRESS_LINE2", "ADDRESS_LINE4", "COUNTRY",
								"SHORT_NAME", "NATIONALITY", "LANGUAGE", "EXPOSURE_COUNTRY", "LOCAL_BRANCH",
								"LIABILITY_NO", "UNIQUE_ID_NAME", "UNIQUE_ID_VALUE", "FROZEN", "DECEASED",
								"WHEREABOUTS_UNKNOWN", "CUSTOMER_CATEGORY", "HO_AC_NO", "FX_CUST_CLEAN_RISK_LIMIT",
								"OVERALL_LIMIT", "FX_CLEAN_RISK_LIMIT", "CREDIT_RATING", "REVISION_DATE", "LIMIT_CCY",
								"CAS_CUST", "CONVERSION_STATUS_FLAG", "ERR_MSG", "SEC_CUST_CLEAN_RISK_LIMIT",
								"SEC_CLEAN_RISK_LIMIT", "SEC_CUST_PSTL_RISK_LIMIT", "SEC_PSTL_RISK_LIMIT", "SWIFT_CODE",
								"LIAB_BR", "LIAB_NODE", "PAST_DUE_FLAG", "DEFAULT_MEDIA", "LOC_CODE", "SHORT_NAME2",
								"SSN", "ACTION_CODE", "UTILITY_PROVIDER", "UTILITY_PROVIDER_ID", "RISK_PROFILE",
								"DEBTOR_CATEGORY", "UDF_1", "UDF_2", "UDF_3", "UDF_4", "UDF_5", "MAILERS_REQUIRED",
								"AML_CUSTOMER_GRP", "AML_REQUIRED", "GROUP_CODE", "EXPOSURE_CATEGORY",
								"CUST_CLASSIFICATION", "CIF_STATUS", "CIF_STATUS_SINCE", "INTRODUCER",
								"FT_ACCTING_AS_OF", "CUST_UNADVISED", "LIAB_UNADVISED", "TAX_GROUP",
								"CONSOL_TAX_CERT_REQD", "INDIVIDUAL_TAX_CERT_REQD", "FX_NETTING_CUSTOMER",
								"CLS_PARTICIPANT", "CLS_CCY_ALLOWED", "RISK_CATEGORY", "FAX_NUMBER", "EXT_REF_NO",
								"CRM_CUSTOMER", "ISSUER_CUSTOMER", "TREASURY_CUSTOMER", "CHARGE_GROUP", "FULL_NAME",
								"MAKER_ID", "MAKER_DT_STAMP", "CHECKER_ID", "CHECKER_DT_STAMP", "CUST_CLG_GROUP",
								"CHK_DIGIT_VALID_REQD", "ALG_ID", "WHT_PCT", "RP_CUSTOMER", "SOURCE_SEQ_NO",
								"BRANCH_CODE", "GENERATE_MT920", "PRIVATE_CUSTOMER", "KYC_DETAILS", "STAFF",
								"KYC_REF_NO", "LC_COLLATERAL_PCT", "AUTO_CREATE_ACCOUNT", "AUTO_CUST_AC_NO",
								"TRACK_LIMITS", "AR_AP_TRACKING", "RM_ID", "PINCODE", "AUTOGEN_STMTPLAN", "FREQUENCY",
								"STMT_DAY", "INVEST_CUST", "ALLOW_VRTL_ACCNTS", "VRTL_CUSTOMER_ID", "ELCM_CUSTOMER",
								"WITHHOLDING_TAX", "TAXID_NO", "SPECIAL_CUST", "CIF_CREATION_DATE", "MFI_CUSTOMER",
								"JOINT_VENTURE");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttmUploadCustomerModel>() {
					{
						setTargetType(TransSttmUploadCustomerModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	} 
    @Bean
    public JpaItemWriter<TransSttmUploadCustomer> jpaItemWriterSttmUploadCustomer() {
 		JpaItemWriter<TransSttmUploadCustomer> jpaItemWriter = 
 				new JpaItemWriter<TransSttmUploadCustomer>();		
 		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
 		
 		return jpaItemWriter;
 	}
    /** 2. STTM_UPLOAD_CUST_PERSONAL */
    @Bean
	public Job sttmuploadcustpersonal() {
		return jobBuilderFactory.get("sttmuploadcustpersonal").incrementer(new RunIdIncrementer())
				.start(sttmUploadCustPersonalChunkStep()).build();
	}
	private Step sttmUploadCustPersonalChunkStep() {
		return stepBuilderFactory.get("TRANS_STTM_UPLOAD_CUST_PERSONAL")
				.<TransSttmUploadCustPersonalModel, TransSttmUploadCustPersonal>chunk(100)
				.reader(flatFileItemReaderSttmUploadCustPersonal()).processor(firstItemProSttmUploadCustPersonal)
				.writer(jpaItemWriterSttmUploadCustPersonal()).faultTolerant().skip(Throwable.class)
				.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
	}
    
    @StepScope
 	@Bean
	public FlatFileItemReader<TransSttmUploadCustPersonalModel> flatFileItemReaderSttmUploadCustPersonal() {
		FlatFileItemReader<TransSttmUploadCustPersonalModel> flatFileItemReader = new FlatFileItemReader<TransSttmUploadCustPersonalModel>();
		String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTM_UPLOAD_CUST_PERSONAL");
		flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttmUploadCustPersonalModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("CUSTOMER_PREFIX", "FIRST_NAME", "MIDDLE_NAME", "LAST_NAME", "DATE_OF_BIRTH",
								"LEGAL_GUARDIAN", "MINOR", "SEX", "P_NATIONAL_ID", "PASSPORT_NO", "PPT_ISS_DATE",
								"PPT_EXP_DATE", "D_ADDRESS1", "D_ADDRESS2", "D_ADDRESS3", "TELEPHONE", "FAX", "E_MAIL",
								"P_ADDRESS1", "P_ADDRESS3", "P_ADDRESS2", "CUSTOMER_NO", "D_COUNTRY", "P_COUNTRY",
								"RESIDENT_STATUS", "CONVERSION_STATUS_FLAG", "ERR_MSG", "MAINTENANCE_SEQ_NO",
								"CUSTOMER_PREFIX1", "CUSTOMER_PREFIX2", "SOURCE_SEQ_NO", "BRANCH_CODE", "SOURCE_CODE",
								"AGE_PROOF_SUBMITTED", "P_ADDRESS4", "D_ADDRESS4", "PLACE_OF_BIRTH", "BIRTH_COUNTRY",
								"TEL_ISD_NO", "MOB_ISD_NO", "FAX_ISD_NO", "US_RES_STATUS", "PA_ISSUED",
								"PA_HOLDER_NAME", "PA_HOLDER_NATIONALTY", "PA_HOLDER_ADDR", "PA_HOLDER_ADDR_COUNTRY",
								"PA_HOLDER_TEL_ISD", "PA_HOLDER_TEL_NO", "VST_US_PREV", "MOBILE_NUMBER",
								"CUST_COMM_MODE", "HOME_TEL_NO", "HOME_TEL_ISD", "P_PINCODE", "PREF_CONTACT_DT",
								"PREF_CONTACT_TIME", "D_PINCODE", "MOTHER_MAIDEN_NAME");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttmUploadCustPersonalModel>() {
					{
						setTargetType(TransSttmUploadCustPersonalModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	}
    
	@Bean
	public JpaItemWriter<TransSttmUploadCustPersonal> jpaItemWriterSttmUploadCustPersonal() {
		JpaItemWriter<TransSttmUploadCustPersonal> jpaItemWriter = new JpaItemWriter<TransSttmUploadCustPersonal>();
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		return jpaItemWriter;
	}
	 /** 3. STTM_UPLOAD_CUST_PROFESSIONAL */
		@Bean
		public Job sttmuploadcustprofessional() {
			return jobBuilderFactory.get("sttmuploadcustprofessional").incrementer(new RunIdIncrementer())
					.start(sttmUploadCustProfessionalChunkStep()).build();
		}
	   
		private Step sttmUploadCustProfessionalChunkStep() {
			return stepBuilderFactory.get("TRANS_STTM_UPLOAD_CUST_PROFESSIONAL")
					.<TransSttmUploadCustProfessionalModel, TransSttmUploadCustProfessional>chunk(100)
					.reader(flatFileItemReaderSttmUploadCustProfessional())
					.processor(firstItemProSttmUploadCustProfessional).writer(jpaItemWriterSttmUploadCustProfessional())
					.faultTolerant().skip(Throwable.class).skipPolicy(new AlwaysSkipItemSkipPolicy())
					.listener(stepResultListener).build();
		}
	   
		@StepScope
		@Bean
		public FlatFileItemReader<TransSttmUploadCustProfessionalModel> flatFileItemReaderSttmUploadCustProfessional() {
			FlatFileItemReader<TransSttmUploadCustProfessionalModel> flatFileItemReader = new FlatFileItemReader<TransSttmUploadCustProfessionalModel>();
			String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTM_UPLOAD_CUST_PROFESSIONAL");
			flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
			flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttmUploadCustProfessionalModel>() {
				{
					setLineTokenizer(new DelimitedLineTokenizer() {
						{
							setNames("CUSTOMER_NO", "EMPLOYMENT_STATUS", "EMPLOYMENT_TENURE", "RETIREMENT_AGE",
									"PREV_DESIGNATION", "PREV_EMPLOYER", "DESIGNATION", "EMPLOYER", "E_ADDRESS1",
									"E_ADDRESS2", "E_ADDRESS3", "E_TELEPHONE", "E_TELEX", "E_FAX", "E_EMAIL", "SALARY",
									"OTHER_EXPENSES", "OTHER_INCOME", "RENT", "INSURANCE", "LOAN_PAYMENT",
									"HOUSE_VALUE", "CREDIT_CARDS", "E_COUNTRY", "CCY_PERS_INCEXP",
									"CONVERSION_STATUS_FLAG", "ERR_MSG", "MAINTENANCE_SEQ_NO", "SOURCE_SEQ_NO",
									"BRANCH_CODE", "SOURCE_CODE", "E_ADDRESS4", "SALARY_FREQ", "PINCODE");
						}
					});

					setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttmUploadCustProfessionalModel>() {
						{
							setTargetType(TransSttmUploadCustProfessionalModel.class);
						}
					});

				}
			});
			flatFileItemReader.setLinesToSkip(1);

			return flatFileItemReader;
		}
	   
	   @Bean
	   public JpaItemWriter<TransSttmUploadCustProfessional> jpaItemWriterSttmUploadCustProfessional() {
			JpaItemWriter<TransSttmUploadCustProfessional> jpaItemWriter = 
					new JpaItemWriter<TransSttmUploadCustProfessional>();		
			jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
			return jpaItemWriter;
		}

		/** 4. STTM_UPLOAD_CUST_CORPORATE */
		@Bean
		public Job sttmuploadcustcorporate() {
			return jobBuilderFactory.get("sttmuploadcustcorporate").incrementer(new RunIdIncrementer())
					.start(sttmUploadCustCorporateChunkStep()).build();
		}

		private Step sttmUploadCustCorporateChunkStep() {
			return stepBuilderFactory.get("TRANS_STTM_UPLOAD_CUST_CORPORATE")
					.<TransSttmUploadCustCorporateModel, TransSttmUploadCustCorporate>chunk(100)
					.reader(flatFileItemReaderSttmUploadCustCorporate()).processor(firstItemProSttmUploadCustCorporate)
					.writer(jpaItemWriterSttmUploadCustCorporate()).faultTolerant().skip(Throwable.class)
					.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
		}
		@StepScope
		@Bean
		public FlatFileItemReader<TransSttmUploadCustCorporateModel> flatFileItemReaderSttmUploadCustCorporate() {
			FlatFileItemReader<TransSttmUploadCustCorporateModel> flatFileItemReader = new FlatFileItemReader<TransSttmUploadCustCorporateModel>();
			String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTM_UPLOAD_CUST_CORPORATE");
			flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
			flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttmUploadCustCorporateModel>() {
				{
					setLineTokenizer(new DelimitedLineTokenizer() {
						{
							setNames("CUSTOMER_NO", "CORPORATE_NAME", "C_NATIONAL_ID", "R_ADDRESS1", "R_ADDRESS2",
									"R_ADDRESS3", "INCORP_DATE", "CAPITAL", "NETWORTH", "BUSINESS_DESCRIPTION",
									"INCORP_COUNTRY", "R_COUNTRY", "AMOUNTS_CCY", "CONVERSION_STATUS_FLAG", "ERR_MSG",
									"MAINTENANCE_SEQ_NO", "SOURCE_SEQ_NO", "BRANCH_CODE", "SOURCE_CODE", "R_ADDRESS4",
									"R_PINCODE", "PREF_CONTACT_DT", "PREF_CONTACT_TIME", "OWNERSHIP_TYPE");
						}
					});

					setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttmUploadCustCorporateModel>() {
						{
							setTargetType(TransSttmUploadCustCorporateModel.class);
						}
					});

				}
			});
			flatFileItemReader.setLinesToSkip(1);

			return flatFileItemReader;
		}

		@Bean
		public JpaItemWriter<TransSttmUploadCustCorporate> jpaItemWriterSttmUploadCustCorporate() {
			JpaItemWriter<TransSttmUploadCustCorporate> jpaItemWriter = new JpaItemWriter<TransSttmUploadCustCorporate>();
			jpaItemWriter.setEntityManagerFactory(entityManagerFactory);

			return jpaItemWriter;
		}
		/** 5. STTM_UPLOAD_CORP_DIRECTORS */
		@Bean
		public Job sttmuploadcorpdirectors() {
			return jobBuilderFactory.get("sttmuploadcorpdirectors").incrementer(new RunIdIncrementer())
					.start(sttmUploadCorpDirectorsChunkStep()).build();
		}
		private Step sttmUploadCorpDirectorsChunkStep() {
			return stepBuilderFactory.get("TRANS_STTM_UPLOAD_CORP_DIRECTORS")
					.<TransSttmUploadCorpDirectorsModel, TransSttmUploadCorpDirectors>chunk(100)
					.reader(flatFileItemReaderSttmUploadCorpDirectors()).processor(firstItemProSttmUploadCorpDirectors)
					.writer(jpaItemWriterSttmUploadCorpDirectors()).faultTolerant().skip(Throwable.class)
					.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
		}   

		@StepScope
		@Bean
		public FlatFileItemReader<TransSttmUploadCorpDirectorsModel> flatFileItemReaderSttmUploadCorpDirectors() {
			FlatFileItemReader<TransSttmUploadCorpDirectorsModel> flatFileItemReader = new FlatFileItemReader<TransSttmUploadCorpDirectorsModel>();
			String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTM_UPLOAD_CORP_DIRECTORS");
			flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
			flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttmUploadCorpDirectorsModel>() {
				{
					setLineTokenizer(new DelimitedLineTokenizer() {
						{
							setNames("CUSTOMER_NO", "DIRECTOR_NAME", "CONVERSION_STATUS_FLAG", "ERR_MSG",
									"MAINTENANCE_SEQ_NO", "SOURCE_SEQ_NO", "BRANCH_CODE", "SOURCE_CODE", "SLNO",
									"ADDRESS_LINE1", "ADDRESS_LINE2", "ADDRESS_LINE3", "ADDRESS_LINE4", "P_ADDRESS1",
									"P_ADDRESS2", "P_ADDRESS3", "P_COUNTRY", "TELEPHONE", "TAX_ID", "MOBILE_NUMBER",
									"E_MAIL", "TEL_ISD_NO", "MOB_ISD_NO", "ADDR_COUNTRY", "NATIONALITY",
									"US_RES_STATUS", "PCT_HOLDING", "HOME_TEL_NO", "HOME_TEL_ISD", "P_PINCODE",
									"PINCODE", "P_ADDRESS4");
						}
					});

					setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttmUploadCorpDirectorsModel>() {
						{
							setTargetType(TransSttmUploadCorpDirectorsModel.class);
						}
					});

				}
			});
			flatFileItemReader.setLinesToSkip(1);

			return flatFileItemReader;
		}

		@Bean
		public JpaItemWriter<TransSttmUploadCorpDirectors> jpaItemWriterSttmUploadCorpDirectors() {
			JpaItemWriter<TransSttmUploadCorpDirectors> jpaItemWriter = new JpaItemWriter<TransSttmUploadCorpDirectors>();
			jpaItemWriter.setEntityManagerFactory(entityManagerFactory);

			return jpaItemWriter;
		}
		/**6. STTM_AUTO_LIAB_UPLOAD */
		@Bean
		public Job sttmautoliabupload() {
			return jobBuilderFactory.get("sttmautoliabupload").incrementer(new RunIdIncrementer())
					.start(sttmAutoLiabUploadChunkStep()).build();
		}
		private Step sttmAutoLiabUploadChunkStep() {
			return stepBuilderFactory.get("TRANS_STTM_AUTO_LIAB_UPLOAD")
					.<TransSttmAutoLiabUploadModel, TransSttmAutoLiabUpload>chunk(100)
					.reader(flatFileItemReaderSttmAutoLiabUpload()).processor(firstItemProSttmAutoLiabUpload)
					.writer(jpaItemWriterSttmAutoLiabUpload()).faultTolerant().skip(Throwable.class)
					.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
		}    

		@StepScope
		@Bean
		public FlatFileItemReader<TransSttmAutoLiabUploadModel> flatFileItemReaderSttmAutoLiabUpload() {
			FlatFileItemReader<TransSttmAutoLiabUploadModel> flatFileItemReader = new FlatFileItemReader<TransSttmAutoLiabUploadModel>();
			String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTM_AUTO_LIAB_UPLOAD");
			flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
			flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttmAutoLiabUploadModel>() {
				{
					setLineTokenizer(new DelimitedLineTokenizer() {
						{
							setNames("SOURCE_CODE", "MAINTENANCE_SEQ_NO", "CUST_NO", "LIAB_NO", "LIAB_NAME",
									"LIAB_BRANCH", "LIAB_CCY", "OVERALL_LIMIT", "REVISION_DATE", "CATEGORY",
									"USER_DEFINE_STATUS", "UNADVISED", "NETTING_REQUIRED", "OVERALL_SCORE",
									"FX_CLEAN_RISK_LIMIT", "SEC_CLEAN_RISK_LIMIT", "SEC_PSTL_RISK_LIMIT",
									"USER_REF_NO");
						}
					});

					setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttmAutoLiabUploadModel>() {
						{
							setTargetType(TransSttmAutoLiabUploadModel.class);
						}
					});

				}
			});
			flatFileItemReader.setLinesToSkip(1);

			return flatFileItemReader;
		}

		@Bean
		public JpaItemWriter<TransSttmAutoLiabUpload> jpaItemWriterSttmAutoLiabUpload() {
			JpaItemWriter<TransSttmAutoLiabUpload> jpaItemWriter = new JpaItemWriter<TransSttmAutoLiabUpload>();
			jpaItemWriter.setEntityManagerFactory(entityManagerFactory);

			return jpaItemWriter;
		}
		/**7. STTM_UPLOAD_CUST_DOMESTIC */
		@Bean
		public Job sttmuploadcustdomestic() {
			return jobBuilderFactory.get("sttmuploadcustdomestic").incrementer(new RunIdIncrementer())
					.start(sttmUploadCustDomesticChunkStep()).build();
		}
		private Step sttmUploadCustDomesticChunkStep() {
			return stepBuilderFactory.get("TRANS_STTM_UPLOAD_CUST_DOMESTIC")
					.<TransSttmUploadCustDomesticModel, TransSttmUploadCustDomestic>chunk(100)
					.reader(flatFileItemReaderSttmUploadCustDomestic()).processor(firstItemProSttmUploadCustDomestic)
					.writer(jpaItemWriterSttmUploadCustDomestic()).faultTolerant().skip(Throwable.class)
					.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
		}   	   

		@StepScope
		@Bean
		public FlatFileItemReader<TransSttmUploadCustDomesticModel> flatFileItemReaderSttmUploadCustDomestic() {
			FlatFileItemReader<TransSttmUploadCustDomesticModel> flatFileItemReader = new FlatFileItemReader<TransSttmUploadCustDomesticModel>();
			String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTM_UPLOAD_CUST_DOMESTIC");
			flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
			flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttmUploadCustDomesticModel>() {
				{
					setLineTokenizer(new DelimitedLineTokenizer() {
						{
							setNames("CUSTOMER_NO", "EDUCATIONAL_STATUS", "MARITAL_STATUS", "SPOUSE_NAME",
									"SPOUSE_EMP_STATUS", "DEPENDENT_CHILDREN", "DEPENDENT_OTHERS", "ACCOMODATION",
									"CONVERSION_STATUS_FLAG", "ERR_MSG", "MAINTENANCE_SEQ_NO", "MOTHER_MAIDEN_NAME");
						}
					});

					setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttmUploadCustDomesticModel>() {
						{
							setTargetType(TransSttmUploadCustDomesticModel.class);
						}
					});

				}
			});
			flatFileItemReader.setLinesToSkip(1);

			return flatFileItemReader;
		}

		@Bean
		public JpaItemWriter<TransSttmUploadCustDomestic> jpaItemWriterSttmUploadCustDomestic() {
			JpaItemWriter<TransSttmUploadCustDomestic> jpaItemWriter = new JpaItemWriter<TransSttmUploadCustDomestic>();
			jpaItemWriter.setEntityManagerFactory(entityManagerFactory);

			return jpaItemWriter;
		}
		/**8. MITM_UPLOAD_CUSTOMER_DEFAULT */
		@Bean
		public Job mitmuploadcustomerdefault() {
			return jobBuilderFactory.get("mitmuploadcustomerdefault").incrementer(new RunIdIncrementer())
					.start(mitmUploadCustomerDefaultChunkStep()).build();
		}
		private Step mitmUploadCustomerDefaultChunkStep() {
			return stepBuilderFactory.get("TRANS_MITM_UPLOAD_CUSTOMER_DEFAULT")
					.<TransMitmUploadCustomerDefaultModel, TransMitmUploadCustomerDefault>chunk(100)
					.reader(flatFileItemReaderMitmUploadCustomerDefault()).processor(firstItemProMitmUploadCustomerDefault)
					.writer(jpaItemWriterMitmUploadCustomerDefault()).faultTolerant().skip(Throwable.class)
					.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
		}   	   
		
		@StepScope
		@Bean
		public FlatFileItemReader<TransMitmUploadCustomerDefaultModel> flatFileItemReaderMitmUploadCustomerDefault() {
			FlatFileItemReader<TransMitmUploadCustomerDefaultModel> flatFileItemReader = new FlatFileItemReader<TransMitmUploadCustomerDefaultModel>();
			String csv_file_path = commonService.getLegacyDataDetails("TRANS_MITM_UPLOAD_CUSTOMER_DEFAULT");
			flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
			flatFileItemReader.setLineMapper(new DefaultLineMapper<TransMitmUploadCustomerDefaultModel>() {
				{
					setLineTokenizer(new DelimitedLineTokenizer() {
						{
							setNames("CUSTOMER", "MIS_GROUP", "CUST_MIS_1", "CUST_MIS_2", "CUST_MIS_3", "CUST_MIS_4",
									"CUST_MIS_5", "CUST_MIS_6", "CUST_MIS_7", "CUST_MIS_8", "CUST_MIS_9", "CUST_MIS_10",
									"COMP_MIS_1", "COMP_MIS_2", "COMP_MIS_3", "COMP_MIS_4", "COMP_MIS_5", "COMP_MIS_6",
									"COMP_MIS_7", "COMP_MIS_8", "COMP_MIS_9", "COMP_MIS_10", "MAINTENANCE_SEQ_NO",
									"SOURCE_SEQ_NO", "BRANCH_CODE", "SOURCE_CODE");
						}
					});

					setFieldSetMapper(new BeanWrapperFieldSetMapper<TransMitmUploadCustomerDefaultModel>() {
						{
							setTargetType(TransMitmUploadCustomerDefaultModel.class);
						}
					});

				}
			});
			flatFileItemReader.setLinesToSkip(1);

			return flatFileItemReader;
		}

		@Bean
		public JpaItemWriter<TransMitmUploadCustomerDefault> jpaItemWriterMitmUploadCustomerDefault() {
			JpaItemWriter<TransMitmUploadCustomerDefault> jpaItemWriter = new JpaItemWriter<TransMitmUploadCustomerDefault>();
			jpaItemWriter.setEntityManagerFactory(entityManagerFactory);

			return jpaItemWriter;
		}
		/**9. STTM_UPLOAD_DOC_CHKLST */
		@Bean
		public Job sttmuploaddocchklst() {
			return jobBuilderFactory.get("sttmuploaddocchklst").incrementer(new RunIdIncrementer())
					.start(sttmUploadDocChklstChunkStep()).build();
		}

		private Step sttmUploadDocChklstChunkStep() {
			return stepBuilderFactory.get("TRANS_STTM_UPLOAD_DOC_CHKLST")
					.<TransSttmUploadDocChklstModel, TransSttmUploadDocChklst>chunk(100)
					.reader(flatFileItemReaderSttmUploadDocChklst()).processor(firstItemProSttmUploadDocChklst)
					.writer(jpaItemWriterSttmUploadDocChklst()).faultTolerant().skip(Throwable.class)
					.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
		}  	   
   
		@StepScope
		@Bean
		public FlatFileItemReader<TransSttmUploadDocChklstModel> flatFileItemReaderSttmUploadDocChklst() {
			FlatFileItemReader<TransSttmUploadDocChklstModel> flatFileItemReader = new FlatFileItemReader<TransSttmUploadDocChklstModel>();
			String csv_file_path = commonService.getLegacyDataDetails("TRANS_STTM_UPLOAD_DOC_CHKLST");
			flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
			flatFileItemReader.setLineMapper(new DefaultLineMapper<TransSttmUploadDocChklstModel>() {
				{
					setLineTokenizer(new DelimitedLineTokenizer() {
						{
							setNames("CUSTOMER_NO", "MAINTENANCE_SEQ_NO", "DOCUMENT_TYPE", "CHECKED", "DOCUMENT_REF_NO",
									"REQUEST_DATE", "EXP_SUB_DATE", "ACTUAL_SUB_DATE", "VALID_TILL", "DOC_CATEGORY",
									"REMARKS", "DOCUMENT_NAME", "BRANCH_CODE", "SOURCE_CODE", "SOURCE_SEQ_NO");
						}
					});

					setFieldSetMapper(new BeanWrapperFieldSetMapper<TransSttmUploadDocChklstModel>() {
						{
							setTargetType(TransSttmUploadDocChklstModel.class);
						}
					});

				}
			});
			flatFileItemReader.setLinesToSkip(1);
			return flatFileItemReader;
		}
   
		@Bean
		public JpaItemWriter<TransSttmUploadDocChklst> jpaItemWriterSttmUploadDocChklst() {
			JpaItemWriter<TransSttmUploadDocChklst> jpaItemWriter = new JpaItemWriter<TransSttmUploadDocChklst>();
			jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
			return jpaItemWriter;
		}
  
		/**10. CSTM_FUNCTION_USERDEF_FIELDS */
		@Bean
		public Job cstmfunctionuserdeffields() {
			return jobBuilderFactory.get("cstmfunctionuserdeffields").incrementer(new RunIdIncrementer())
					.start(cstmFunctionUserdefFieldsChunkStep()).build();
		}
		private Step cstmFunctionUserdefFieldsChunkStep() {
			return stepBuilderFactory.get("TRANS_CSTM_FUNCTION_USERDEF_FIELDS")
					.<TransCstmFunctionUserdefFieldsModel, TransCstmFunctionUserdefFields>chunk(100)
					.reader(flatFileItemReaderCstmFunctionUserdefFields()).processor(firstItemProCstmFunctionUserdefFields)
					.writer(jpaItemWriterCstmFunctionUserdefFields()).faultTolerant().skip(Throwable.class)
					.skipPolicy(new AlwaysSkipItemSkipPolicy()).listener(stepResultListener).build();
		}  	 

		@StepScope
		@Bean
		public FlatFileItemReader<TransCstmFunctionUserdefFieldsModel> flatFileItemReaderCstmFunctionUserdefFields() {
			FlatFileItemReader<TransCstmFunctionUserdefFieldsModel> flatFileItemReader = new FlatFileItemReader<TransCstmFunctionUserdefFieldsModel>();
			String csv_file_path = commonService.getLegacyDataDetails("TRANS_CSTM_FUNCTION_USERDEF_FIELDS");
			flatFileItemReader.setResource(new FileSystemResource(csv_file_path));
			flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCstmFunctionUserdefFieldsModel>() {
				{
					setLineTokenizer(new DelimitedLineTokenizer() {
						{
							setNames("FUNCTION_ID", "REC_KEY", "FIELD_VAL_1", "FIELD_VAL_2", "FIELD_VAL_3",
									"FIELD_VAL_4", "FIELD_VAL_5", "FIELD_VAL_6", "FIELD_VAL_7", "FIELD_VAL_8",
									"FIELD_VAL_9", "FIELD_VAL_10", "FIELD_VAL_11", "FIELD_VAL_12", "FIELD_VAL_13",
									"FIELD_VAL_14", "FIELD_VAL_15", "FIELD_VAL_16", "FIELD_VAL_17", "FIELD_VAL_18",
									"FIELD_VAL_19", "FIELD_VAL_20", "FIELD_VAL_21", "FIELD_VAL_22", "FIELD_VAL_23",
									"FIELD_VAL_24", "FIELD_VAL_25", "FIELD_VAL_26", "FIELD_VAL_27", "FIELD_VAL_28",
									"FIELD_VAL_29", "FIELD_VAL_30", "FIELD_VAL_31", "FIELD_VAL_32", "FIELD_VAL_33",
									"FIELD_VAL_34", "FIELD_VAL_35", "FIELD_VAL_36", "FIELD_VAL_37", "FIELD_VAL_38",
									"FIELD_VAL_39", "FIELD_VAL_40", "FIELD_VAL_41", "FIELD_VAL_42", "FIELD_VAL_43",
									"FIELD_VAL_44", "FIELD_VAL_45", "FIELD_VAL_46", "FIELD_VAL_47", "FIELD_VAL_48",
									"FIELD_VAL_49", "FIELD_VAL_50", "FIELD_VAL_51", "FIELD_VAL_52", "FIELD_VAL_53",
									"FIELD_VAL_54", "FIELD_VAL_55", "FIELD_VAL_56", "FIELD_VAL_57", "FIELD_VAL_58",
									"FIELD_VAL_59", "FIELD_VAL_60", "FIELD_VAL_61", "FIELD_VAL_62", "FIELD_VAL_63",
									"FIELD_VAL_64", "FIELD_VAL_65", "FIELD_VAL_66", "FIELD_VAL_67", "FIELD_VAL_68",
									"FIELD_VAL_69", "FIELD_VAL_70", "FIELD_VAL_71", "FIELD_VAL_72", "FIELD_VAL_73",
									"FIELD_VAL_74", "FIELD_VAL_75", "FIELD_VAL_76", "FIELD_VAL_77", "FIELD_VAL_78",
									"FIELD_VAL_79", "FIELD_VAL_80", "FIELD_VAL_81", "FIELD_VAL_82", "FIELD_VAL_83",
									"FIELD_VAL_84", "FIELD_VAL_85", "FIELD_VAL_86", "FIELD_VAL_87", "FIELD_VAL_88",
									"FIELD_VAL_89", "FIELD_VAL_90", "FIELD_VAL_98", "FIELD_VAL_99", "FIELD_VAL_100",
									"FIELD_VAL_101", "FIELD_VAL_102", "FIELD_VAL_103", "FIELD_VAL_104", "FIELD_VAL_105",
									"FIELD_VAL_106", "FIELD_VAL_107", "FIELD_VAL_108", "FIELD_VAL_109", "FIELD_VAL_110",
									"FIELD_VAL_111", "FIELD_VAL_112", "FIELD_VAL_113", "FIELD_VAL_114", "FIELD_VAL_115",
									"FIELD_VAL_116", "FIELD_VAL_117", "FIELD_VAL_118", "FIELD_VAL_119", "FIELD_VAL_120",
									"FIELD_VAL_121", "FIELD_VAL_122", "FIELD_VAL_123", "FIELD_VAL_124", "FIELD_VAL_125",
									"FIELD_VAL_126", "FIELD_VAL_127", "FIELD_VAL_128", "FIELD_VAL_129", "FIELD_VAL_130",
									"FIELD_VAL_91", "FIELD_VAL_92", "FIELD_VAL_93", "FIELD_VAL_94", "FIELD_VAL_95",
									"FIELD_VAL_96", "FIELD_VAL_97", "FIELD_VAL_131", "FIELD_VAL_132", "FIELD_VAL_133",
									"FIELD_VAL_134", "FIELD_VAL_135", "FIELD_VAL_136", "FIELD_VAL_137", "FIELD_VAL_138",
									"FIELD_VAL_139", "FIELD_VAL_140", "FIELD_VAL_141", "FIELD_VAL_142", "FIELD_VAL_143",
									"FIELD_VAL_144", "FIELD_VAL_145", "FIELD_VAL_146", "FIELD_VAL_147", "FIELD_VAL_148",
									"FIELD_VAL_149", "FIELD_VAL_150", "FIELD_VAL_151", "FIELD_VAL_152", "FIELD_VAL_153",
									"FIELD_VAL_154", "FIELD_VAL_155", "FIELD_VAL_156", "FIELD_VAL_157", "FIELD_VAL_158",
									"FIELD_VAL_159", "FIELD_VAL_160", "FIELD_VAL_161", "FIELD_VAL_162", "FIELD_VAL_163",
									"FIELD_VAL_164", "FIELD_VAL_165", "FIELD_VAL_166", "FIELD_VAL_167", "FIELD_VAL_168",
									"FIELD_VAL_169", "FIELD_VAL_170", "FIELD_VAL_171", "FIELD_VAL_172", "FIELD_VAL_173",
									"FIELD_VAL_174", "FIELD_VAL_175", "FIELD_VAL_176", "FIELD_VAL_177", "FIELD_VAL_178",
									"FIELD_VAL_179", "FIELD_VAL_180", "FIELD_VAL_181", "FIELD_VAL_182", "FIELD_VAL_183",
									"FIELD_VAL_184", "FIELD_VAL_185", "FIELD_VAL_186", "FIELD_VAL_187", "FIELD_VAL_188",
									"FIELD_VAL_189", "FIELD_VAL_190", "FIELD_VAL_191", "FIELD_VAL_192", "FIELD_VAL_193",
									"FIELD_VAL_194", "FIELD_VAL_195", "FIELD_VAL_196", "FIELD_VAL_197", "FIELD_VAL_198",
									"FIELD_VAL_199", "FIELD_VAL_200");
						}
					});

					setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCstmFunctionUserdefFieldsModel>() {
						{
							setTargetType(TransCstmFunctionUserdefFieldsModel.class);
						}
					});

				}
			});
			flatFileItemReader.setLinesToSkip(1);

			return flatFileItemReader;
		}

		@Bean
		public JpaItemWriter<TransCstmFunctionUserdefFields> jpaItemWriterCstmFunctionUserdefFields() {
			JpaItemWriter<TransCstmFunctionUserdefFields> jpaItemWriter = new JpaItemWriter<TransCstmFunctionUserdefFields>();
			jpaItemWriter.setEntityManagerFactory(entityManagerFactory);

			return jpaItemWriter;
		}

 //Job Object
  /* @Bean
   public Job cstbrelationshipupload(){   	
      return jobBuilderFactory.get("cstbrelationshipupload_Job")
             .incrementer(new RunIdIncrementer())
             .listener(listener())
             .start(cstbRelationshipUploadChunkStep())
             .build();
   }
   
 
   
   private Step cstbRelationshipUploadChunkStep() {
		return stepBuilderFactory.get("cstbRelationshipUploadChunkStep")
				.<TransCstbRelationshipUploadModel, TransCstbRelationshipUpload>chunk(100)
				.reader(flatFileItemReaderCstbRelationshipUpload())
				.processor(firstItemProCstbRelationshipUpload)
				.writer(jpaItemWriterCstbRelationshipUpload())
				.faultTolerant()
				.skip(Throwable.class)
				.skip(Exception.class)
				.skip(BindException.class)
				.skipLimit(1000)
				//.skipPolicy(new AlwaysSkipItemSkipPolicy())
				.retryLimit(3)
				.retry(Throwable.class)
				//.listener(skipListener)
				.build();
	}
   
   @StepScope
	@Bean
	public FlatFileItemReader<TransCstbRelationshipUploadModel> flatFileItemReaderCstbRelationshipUpload() {
		FlatFileItemReader<TransCstbRelationshipUploadModel> flatFileItemReader = new FlatFileItemReader<TransCstbRelationshipUploadModel>();
		flatFileItemReader.setResource(new FileSystemResource("E:\\JMR Infotech\\MigrationTool\\Documents\\CSV\\CIFCSV\\CIF\\CSTB_RELATIONSHIP_UPLOAD.csv"));

		flatFileItemReader.setLineMapper(new DefaultLineMapper<TransCstbRelationshipUploadModel>() {
			{
				setLineTokenizer(new DelimitedLineTokenizer() {
					{
						setNames("MAINTENANCE_SEQ_NO", "REF_NO", "CATEGORY", "CUSTOMER_NO", "RELATION", "INHERIT",
								"BRANCH", "SOURCE_SEQ_NO", "BRANCH_CODE", "SOURCE_CODE", "SOURCE_REF");
					}
				});

				setFieldSetMapper(new BeanWrapperFieldSetMapper<TransCstbRelationshipUploadModel>() {
					{
						setTargetType(TransCstbRelationshipUploadModel.class);
					}
				});

			}
		});
		flatFileItemReader.setLinesToSkip(1);

		return flatFileItemReader;
	} 
   
   @Bean
   public JpaItemWriter<TransCstbRelationshipUpload> jpaItemWriterCstbRelationshipUpload() {
		JpaItemWriter<TransCstbRelationshipUpload> jpaItemWriter = 
				new JpaItemWriter<TransCstbRelationshipUpload>();		
		jpaItemWriter.setEntityManagerFactory(entityManagerFactory);
		
		return jpaItemWriter;
	}*/
}