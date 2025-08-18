package com.jmr.batch.config;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadAccExc;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadAccFate;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadAssigneeDetails;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadBrokDetail;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadBrokMaster;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadDocsClauses;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadDraftsDetails;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadFft;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadGoods;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadInsurance;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadInvoiceDetail;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadInvoiceMaster;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadLimits;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadMaster;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadMultitnr;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadPackCreditDtls;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadParties;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadPartiesAddresses;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadPayExc;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadPayFate;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadReserve;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadShipmentInfo;
import com.jmr.batch.entity.billsandcollections.TransBctmUploadLoanIccf;
import com.jmr.batch.entity.billsandcollections.TransBctmUploadLoanPreference;
import com.jmr.batch.entity.billsandcollections.TransLctbUploadCollateral;
import com.jmr.batch.entity.billsandcollections.TransLctbUploadLicUtlDtl;
import com.jmr.batch.entity.billsandcollections.TransLdtbUploadLinkages;
import com.jmr.batch.entity.billsandcollections.TransTftbUploadFxLinkage;
import com.jmr.batch.model.billsandcollections.TransBctbUploadAccExcModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadAccFateModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadAssigneeDetailsModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadBrokDetailModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadBrokMasterModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadDocsClausesModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadDraftsDetailsModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadFftModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadGoodsModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadInsuranceModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadInvoiceDetailModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadInvoiceMasterModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadLimitsModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadMasterModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadMultitnrModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPackCreditDtlsModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPartiesAddressesModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPartiesModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPayExcModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPayFateModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadReserveModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadShipmentInfoModel;
import com.jmr.batch.model.billsandcollections.TransBctmUploadLoanIccfModel;
import com.jmr.batch.model.billsandcollections.TransBctmUploadLoanPreferenceModel;
import com.jmr.batch.model.billsandcollections.TransLctbUploadCollateralModel;
import com.jmr.batch.model.billsandcollections.TransLctbUploadLicUtlDtlModel;
import com.jmr.batch.model.billsandcollections.TransLdtbUploadLinkagesModel;
import com.jmr.batch.model.billsandcollections.TransTftbUploadFxLinkageModel;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadAccExc;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadAccFate;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadAssigneeDetails;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadBrokDetail;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadBrokMaster;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadDocsClauses;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadDraftsDetails;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadFft;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadGoods;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadInsurance;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadInvoiceDetail;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadInvoiceMaster;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadLimits;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadMaster;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadMultitnr;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadPackCreditDtls;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadParties;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadPartiesAddresses;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadPayExc;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadPayFate;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadReserve;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadShipmentInfo;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctmUploadLoanIccf;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctmUploadLoanPreference;
import com.jmr.batch.processor.billsandcollections.FirstItemProLctbUploadCollateral;
import com.jmr.batch.processor.billsandcollections.FirstItemProLctbUploadLicUtlDtl;
import com.jmr.batch.processor.billsandcollections.FirstItemProLdtbUploadLinkages;
import com.jmr.batch.processor.billsandcollections.FirstItemProTftbUploadFxLinkage;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUpldPackCreditDtls;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadAccExc;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadAccFate;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadAssigneeDetails;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadBrokDetail;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadBrokMaster;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadDocsClauses;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadDraftsDetails;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadFft;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadGoods;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadInsurance;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadInvoiceDetail;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadInvoiceMaster;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadLimits;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadMaster;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadMultitnr;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadParties;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadPartiesAddresses;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadPayExc;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadReserve;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadShipmentInfo;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctmUploadLoanIccf;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctmUploadLoanPreference;
import com.jmr.batch.listener.billsandcollections.SkipListenerLctbUploadCollateral;
import com.jmr.batch.listener.billsandcollections.SkipListenerLctbUploadLicUtlDtl;
import com.jmr.batch.listener.billsandcollections.SkipListenerLdtbUploadLinkages;
import com.jmr.batch.listener.billsandcollections.SkipListenerTftbUploadFxLinkage;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import javax.persistence.EntityManagerFactory;

@Configuration
@EnableBatchProcessing
public class BatchConfigBillsAndCollections {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private EntityManagerFactory entityManagerFactory;
    
    //------Processors--------

    @Autowired
    private FirstItemProBctbUploadLimits bctbUploadLimitsProcessor;

    @Autowired
    private FirstItemProBctbUploadParties bctbUploadPartiesProcessor;
    
    @Autowired
    private FirstItemProBctbUploadPartiesAddresses bctbUploadPartiesProcessorAddresses;
    
    @Autowired
    private FirstItemProBctbUploadDocsClauses bctbUploadDocsClauses;
    
    @Autowired
    private FirstItemProBctbUploadInvoiceDetail bctbUploadInvoiceDetail;
    
    @Autowired
    private FirstItemProBctbUploadDraftsDetails bctbUploadDraftsDetails;
    
    @Autowired
    private FirstItemProBctbUploadFft bctbUploadFft;
    
    @Autowired
    private FirstItemProLdtbUploadLinkages ldtbUploadLinkages;
    
    @Autowired
    private FirstItemProTftbUploadFxLinkage tftbUploadFxLinkage;
    
    @Autowired
    private FirstItemProBctmUploadLoanIccf bctmUploadLoanIccf;
    
    @Autowired
    private FirstItemProBctbUploadMaster bctbUploadMaster;
    
    @Autowired
    private FirstItemProBctbUploadGoods bctbUploadGoods;
    
    @Autowired
    private FirstItemProBctbUploadShipmentInfo bctbUploadShipmentInfo;
    
    @Autowired
    private FirstItemProBctbUploadPayExc bctbUploadPayExc;
    
    @Autowired
    private FirstItemProBctbUploadPayFate bctbUploadPayFate;
    
    @Autowired
    private FirstItemProBctbUploadAccExc bctbUploadAccExc;
    
    @Autowired
    private FirstItemProBctbUploadAccFate bctbUploadAccFate;
    
    @Autowired
    private FirstItemProBctbUploadReserve bctbUploadReserve;
    
    @Autowired
    private FirstItemProBctbUploadInvoiceMaster bctbUploadInvoiceMaster;
    
    @Autowired
    private FirstItemProBctbUploadInsurance bctbUploadInsurance;
    
    @Autowired
    private FirstItemProBctmUploadLoanPreference bctmUploadLoanPreference;
    
    @Autowired
    private FirstItemProLctbUploadCollateral lctbUploadCollateral;
    
    @Autowired
    private FirstItemProBctbUploadPackCreditDtls bctbUploadPackCreditDtls;
    
    @Autowired
    private FirstItemProBctbUploadBrokMaster bctbUploadBrokMaster;
    
    @Autowired
    private FirstItemProBctbUploadBrokDetail bctbUploadBrokDetail;
    
    @Autowired
    private FirstItemProBctbUploadMultitnr bctbUploadMultitnr;
    
    @Autowired
    private FirstItemProLctbUploadLicUtlDtl lctbUploadLicUtlDtl;
    
    @Autowired
    private FirstItemProBctbUploadAssigneeDetails bctbUploadAssigneeDetails;
    
    //------Skiplisteners------

    @Autowired
    private SkipListenerBctbUploadLimits bctbUploadLimitsSkipListener;

    @Autowired
    private SkipListenerBctbUploadParties bctbUploadPartiesSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadPartiesAddresses bctbUploadPartiesAddressesSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadDocsClauses bctbUploadDocsClausesSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadInvoiceDetail bctbUploadInvoiceDetailSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadDraftsDetails bctbUploadDraftsDetailsSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadFft bctbUploadFftSkipListener;
    
    @Autowired
    private SkipListenerLdtbUploadLinkages ldtbUploadLinkagesSkipListener;
    
    @Autowired
    private SkipListenerTftbUploadFxLinkage tftbUploadFxLinkageSkipListener;
    
    @Autowired
    private SkipListenerBctmUploadLoanIccf bctmUploadLoanIccfSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadMaster bctbUploadMasterSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadGoods bctbUploadGoodsSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadShipmentInfo bctbUploadShipmentInfoSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadPayExc bctbUploadPayExcSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadAccExc bctbUploadAccExcSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadAccFate bctbUploadAccFateSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadReserve bctbUploadReserveSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadInvoiceMaster bctbUploadInvoiceMasterSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadInsurance bctbUploadInsuranceSkipListener;
    
    @Autowired
    private SkipListenerBctmUploadLoanPreference bctmUploadLoanPreferenceSkipListener;
    
    @Autowired
    private SkipListenerLctbUploadCollateral lctbUploadCollateralSkipListener;
    
    @Autowired
    private SkipListenerBctbUpldPackCreditDtls bctbUploadPackCreditDtlsSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadBrokMaster bctbUploadBrokMasterSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadBrokDetail bctbUploadBrokDetailSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadMultitnr bctbUploadMultitnrSkipListener;
    
    @Autowired
    private SkipListenerLctbUploadLicUtlDtl lctbUploadLicUtlDtlSkipListener;
    
    @Autowired
    private SkipListenerBctbUploadAssigneeDetails bctbUploadAssigneeDetailsSkipListener;

    // -------------------- BCTB_UPLOAD_LIMITS --------------------
    @Bean
    public Job bctbUploadLimitsJob() {
        return jobBuilderFactory.get("bctbUploadLimitsJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadLimitsStep())
                .build();
    }

    @Bean
    public Step bctbUploadLimitsStep() {
        return stepBuilderFactory.get("bctbUploadLimitsStep")
                .<TransBctbUploadLimitsModel, TransBctbUploadLimits>chunk(100)
                .reader(bctbUploadLimitsReader())
                .processor(bctbUploadLimitsProcessor)
                .writer(bctbUploadLimitsWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadLimitsSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadLimitsModel> bctbUploadLimitsReader() {
        FlatFileItemReader<TransBctbUploadLimitsModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_LIMITS.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadLimitsModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("BRANCH_CODE", "SOURCE_CODE", "SOURCE_REF", "PARTY_TYPE", "OPERATION", "LINE",
                        "LIMIT_AMOUNT", "CONV_STATUS", "ERR_MSG", "SOURCE_SEQ_NO");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadLimitsModel>() {{
                setTargetType(TransBctbUploadLimitsModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadLimits> bctbUploadLimitsWriter() {
        JpaItemWriter<TransBctbUploadLimits> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }

    // -------------------- BCTB_UPLOAD_PARTIES --------------------
    @Bean
    public Job bctbUploadPartiesJob() {
        return jobBuilderFactory.get("bctbUploadPartiesJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadPartiesStep())
                .build();
    }

    @Bean
    public Step bctbUploadPartiesStep() {
        return stepBuilderFactory.get("bctbUploadPartiesStep")
                .<TransBctbUploadPartiesModel, TransBctbUploadParties>chunk(100)
                .reader(bctbUploadPartiesReader())
                .processor(bctbUploadPartiesProcessor)
                .writer(bctbUploadPartiesWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadPartiesSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadPartiesModel> bctbUploadPartiesReader() {
        FlatFileItemReader<TransBctbUploadPartiesModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_PARTIES.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadPartiesModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE",
                        "PARTY_LANGUAGE", "PARTY_COUNTRY_CODE", "PARTY_REFNO",
                        "PARTY_NAME", "PARTY_ADDR1", "PARTY_ADDR2", "PARTY_ADDR3",
                        "PARTY_ADDR4", "WALKIN_CUSTOMER_FLAG", "PARTY_ID",
                        "PARTY_TYPE", "CONV_STATUS", "ERR_MSG", "SOURCE_SEQ_NO");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadPartiesModel>() {{
                setTargetType(TransBctbUploadPartiesModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadParties> bctbUploadPartiesWriter() {
        JpaItemWriter<TransBctbUploadParties> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //---------------Bctb_Upload_Parties_Addresses---------
    @Bean
    public Job bctbUploadPartiesAddressesJob() {
        return jobBuilderFactory.get("bctbUploadPartiesAddressesJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadPartiesStep())
                .build();
    }

    @Bean
    public Step bctbUploadPartiesAddressesStep() {
        return stepBuilderFactory.get("bctbUploadPartiesStep")
                .<TransBctbUploadPartiesAddressesModel, TransBctbUploadPartiesAddresses>chunk(100)
                .reader(bctbUploadPartiesAddressesReader())
                .processor(bctbUploadPartiesProcessorAddresses)
                .writer(bctbUploadPartiesAddressesWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadPartiesAddressesSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadPartiesAddressesModel> bctbUploadPartiesAddressesReader() {
        FlatFileItemReader<TransBctbUploadPartiesAddressesModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_PARTIES.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadPartiesAddressesModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE", 
                		"PARTY_TYPE", "MEDIA", "ADDRESS", "SOURCE_SEQ_NO");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadPartiesAddressesModel>() {{
                setTargetType(TransBctbUploadPartiesAddressesModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadPartiesAddresses> bctbUploadPartiesAddressesWriter() {
        JpaItemWriter<TransBctbUploadPartiesAddresses> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
  //---------------Bctb_Upload_Docs_Clauses---------
    @Bean
    public Job bctbUploadDocsClausesJob() {
        return jobBuilderFactory.get("bctbUploadDocsClausesJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadPartiesStep())
                .build();
    }

    @Bean
    public Step bctbUploadDocsClausesStep() {
        return stepBuilderFactory.get("bctbUploadDocsClausesStep")
                .<TransBctbUploadDocsClausesModel, TransBctbUploadDocsClauses>chunk(100)
                .reader(bctbUploadDocsClausesReader())
                .processor(bctbUploadDocsClauses)
                .writer(bctbUploadDocsClausesWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadDocsClausesSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadDocsClausesModel> bctbUploadDocsClausesReader() {
        FlatFileItemReader<TransBctbUploadDocsClausesModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_PARTIES.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadDocsClausesModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("BRANCH_CODE", "SOURCE_CODE", "SOURCE_REF", "SOURCE_SEQ_NO", 
                		"BCREFNO", "CL_ACCOUNT", "SEQ_NO", "LINKED_CCY", 
                		"OUTSTANDING_AMT", "EVENT_CODE", "SETTLED_AMT");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadDocsClausesModel>() {{
                setTargetType(TransBctbUploadDocsClausesModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadDocsClauses> bctbUploadDocsClausesWriter() {
        JpaItemWriter<TransBctbUploadDocsClauses> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
  //---------------Bctb_Upload_Invoice_Detail---------
    
    @Bean
    public Job bctbUploadInvoiceDetailJob() {
        return jobBuilderFactory.get("bctbUploadInvoiceDetailJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadInvoiceDetailStep())
                .build();
    }

    @Bean
    public Step bctbUploadInvoiceDetailStep() {
        return stepBuilderFactory.get("bctbUploadInvoiceDetailStep")
                .<TransBctbUploadInvoiceDetailModel, TransBctbUploadInvoiceDetail>chunk(100)
                .reader(bctbUploadInvoiceDetailReader())
                .processor(bctbUploadInvoiceDetail)
                .writer(bctbUploadInvoiceDetailWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadInvoiceDetailSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadInvoiceDetailModel> bctbUploadInvoiceDetailReader() {
        FlatFileItemReader<TransBctbUploadInvoiceDetailModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_PARTIES.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadInvoiceDetailModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "INVOICE_NO", "INVOICE_DATE", 
                		"AMOUNT", "BRANCH_CODE", "SOURCE_SEQ_NO");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadInvoiceDetailModel>() {{
                setTargetType(TransBctbUploadInvoiceDetailModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadInvoiceDetail> bctbUploadInvoiceDetailWriter() {
        JpaItemWriter<TransBctbUploadInvoiceDetail> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //-------Bctb_Upload_Drafts_Details-------
    
    @Bean
    public Job bctbUploadDraftsDetailsJob() {
        return jobBuilderFactory.get("bctbUploadDraftsDetailsJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadDraftsDetailsStep())
                .build();
    }

    @Bean
    public Step bctbUploadDraftsDetailsStep() {
        return stepBuilderFactory.get("bctbUploadDraftsDetailsStep")
                .<TransBctbUploadDraftsDetailsModel, TransBctbUploadDraftsDetails>chunk(100)
                .reader(bctbUploadDraftsDetailsReader())
                .processor(bctbUploadDraftsDetails) // your processor bean
                .writer(bctbUploadDraftsDetailsWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadDraftsDetailsSkipListener) // your skip listener bean
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadDraftsDetailsModel> bctbUploadDraftsDetailsReader() {
        FlatFileItemReader<TransBctbUploadDraftsDetailsModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_DRAFTS_DETAILS.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadDraftsDetailsModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "AMOUNT_NAME", "AMOUNT", "BRANCH_CODE", "SOURCE_SEQ_NO");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadDraftsDetailsModel>() {{
                setTargetType(TransBctbUploadDraftsDetailsModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadDraftsDetails> bctbUploadDraftsDetailsWriter() {
        JpaItemWriter<TransBctbUploadDraftsDetails> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }

    //-----Bctb_Upload_Fft-----
    
    @Bean
    public Job bctbUploadFftJob() {
        return jobBuilderFactory.get("bctbUploadFftJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadFftStep())
                .build();
    }

    @Bean
    public Step bctbUploadFftStep() {
        return stepBuilderFactory.get("bctbUploadFftStep")
                .<TransBctbUploadFftModel, TransBctbUploadFft>chunk(100)
                .reader(bctbUploadFftReader())
                .processor(bctbUploadFft) // your processor bean
                .writer(bctbUploadFftWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadFftSkipListener) // optional skip listener
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadFftModel> bctbUploadFftReader() {
        FlatFileItemReader<TransBctbUploadFftModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_FFT.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadFftModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE", "RECORD_SEQ_NO",
                         "FFT_CODE", "ADV_CODE", "CONV_STATUS", "ERR_MSG",
                         "SOURCE_SEQ_NO", "FREE_FORMAT_TEXT");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadFftModel>() {{
                setTargetType(TransBctbUploadFftModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadFft> bctbUploadFftWriter() {
        JpaItemWriter<TransBctbUploadFft> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //-----Ldtb_Upload_Linkages----
    
    @Bean
    public Job ldtbUploadLinkagesJob() {
        return jobBuilderFactory.get("ldtbUploadLinkagesJob")
                .incrementer(new RunIdIncrementer())
                .start(ldtbUploadLinkagesStep())
                .build();
    }

    @Bean
    public Step ldtbUploadLinkagesStep() {
        return stepBuilderFactory.get("ldtbUploadLinkagesStep")
                .<TransLdtbUploadLinkagesModel, TransLdtbUploadLinkages>chunk(100)
                .reader(ldtbUploadLinkagesReader())
                .processor(ldtbUploadLinkages) // your ItemProcessor bean
                .writer(ldtbUploadLinkagesWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(ldtbUploadLinkagesSkipListener) // optional skip listener bean
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransLdtbUploadLinkagesModel> ldtbUploadLinkagesReader() {
        FlatFileItemReader<TransLdtbUploadLinkagesModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/LDTB_UPLOAD_LINKAGES.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransLdtbUploadLinkagesModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(
                    "EXT_CONTRACT_REF_NO",
                    "SOURCE_CODE",
                    "BRANCH_CODE",
                    "LINKED_TO_REF",
                    "LINKED_TO_BRANCH",
                    "LINKAGE_TYPE",
                    "LINKED_TO_CURRENCY",
                    "LINKAGE_VALID",
                    "LINKED_AMOUNT",
                    "CONVERTED_LINKED_AMOUNT",
                    "EXCHANGE_RATE",
                    "LOAN_CURRENCY",
                    "SOURCE_REF",
                    "FUNCTION_ID",
                    "SOURCE_SEQ_NO",
                    "ACTION_CODE",
                    "UPLOAD_ID"
                );
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransLdtbUploadLinkagesModel>() {{
                setTargetType(TransLdtbUploadLinkagesModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransLdtbUploadLinkages> ldtbUploadLinkagesWriter() {
        JpaItemWriter<TransLdtbUploadLinkages> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //-----Tftb_Upload_Fx_Linkage----
    
    @Bean
    public Job tftbUploadFxLinkageJob() {
        return jobBuilderFactory.get("tftbUploadFxLinkageJob")
                .incrementer(new RunIdIncrementer())
                .start(tftbUploadFxLinkageStep())
                .build();
    }

    @Bean
    public Step tftbUploadFxLinkageStep() {
        return stepBuilderFactory.get("tftbUploadFxLinkageStep")
                .<TransTftbUploadFxLinkageModel, TransTftbUploadFxLinkage>chunk(100)
                .reader(tftbUploadFxLinkageReader())
                .processor(tftbUploadFxLinkage) // Your ItemProcessor bean
                .writer(tftbUploadFxLinkageWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(tftbUploadFxLinkageSkipListener) // Optional skip listener
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransTftbUploadFxLinkageModel> tftbUploadFxLinkageReader() {
        FlatFileItemReader<TransTftbUploadFxLinkageModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/TFTB_UPLOAD_FX_LINKAGE.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransTftbUploadFxLinkageModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(
                    "SOURCE_CODE",
                    "EXTERNAL_REF_NO",
                    "TF_REF_NO",
                    "EVENT_SEQ_NO",
                    "FX_REF_NO",
                    "TF_AMOUNT",
                    "TF_RATE",
                    "CURRENCY",
                    "BRANCH_CODE",
                    "SOURCE_REF",
                    "SOURCE_SEQ_NO"
                );
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransTftbUploadFxLinkageModel>() {{
                setTargetType(TransTftbUploadFxLinkageModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransTftbUploadFxLinkage> tftbUploadFxLinkageWriter() {
        JpaItemWriter<TransTftbUploadFxLinkage> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //----Bctm_Upload_Loan_Iccf-----
    
    @Bean
    public Job bctmUploadLoanIccfJob() {
        return jobBuilderFactory.get("bctmUploadLoanIccfJob")
                .incrementer(new RunIdIncrementer())
                .start(bctmUploadLoanIccfStep())
                .build();
    }

    @Bean
    public Step bctmUploadLoanIccfStep() {
        return stepBuilderFactory.get("bctmUploadLoanIccfStep")
                .<TransBctmUploadLoanIccfModel, TransBctmUploadLoanIccf>chunk(100)
                .reader(bctmUploadLoanIccfReader())
                .processor(bctmUploadLoanIccf)
                .writer(bctmUploadLoanIccfWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctmUploadLoanIccfSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctmUploadLoanIccfModel> bctmUploadLoanIccfReader() {
        FlatFileItemReader<TransBctmUploadLoanIccfModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTM_UPLOAD_LOAN_ICCF.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctmUploadLoanIccfModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "COMPONENT", "RATE_CODE",
                         "INT_BASIS", "INT_RATE", "INT_SPREAD", "SPECIAL_AMOUNT",
                         "BRANCH_CODE", "SOURCE_SEQ_NO", "USAGE");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctmUploadLoanIccfModel>() {{
                setTargetType(TransBctmUploadLoanIccfModel.class);
            }});
        }});

        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctmUploadLoanIccf> bctmUploadLoanIccfWriter() {
        JpaItemWriter<TransBctmUploadLoanIccf> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //----Bctb_Upload_Master----
    
    @Bean
    public Job bctbUploadMasterJob() {
        return jobBuilderFactory.get("bctbUploadMasterJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadMasterStep())
                .build();
    }

    @Bean
    public Step bctbUploadMasterStep() {
        return stepBuilderFactory.get("bctbUploadMasterStep")
                .<TransBctbUploadMasterModel, TransBctbUploadMaster>chunk(100)
                .reader(bctbUploadMasterReader())
                .processor(bctbUploadMaster)
                .writer(bctbUploadMasterWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadMasterSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadMasterModel> bctbUploadMasterReader() {
        FlatFileItemReader<TransBctbUploadMasterModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_MASTER.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadMasterModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(
                    "SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE", "OPERATION", "STAGE", 
                    "STAGE_ASOF_DATE", "PRODUCT_TYPE", "DOC_FLAG", "LC_FLAG", "TXN_DATE",
                    "LIQUIDATION_DATE", "VALUE_DATE", "MATURITY_DATE", "LC_ISSUE_DATE", "OURLC_APPLICANT",
                    "TENOR_DAYS", "BILL_AMT_LCY", "COLLATERAL_AMT_LCY", "BILL_DUE_AMT", "CUSTOMER_ID",
                    "CUSTOMER_PARTY_TYPE", "BILL_AMT_LIQD", "FROM_CALC_DATE", "TO_CALC_DATE", "TRANSIT_DAYS",
                    "STATUS_CHK_REQD", "INTERNAL_REMARKS", "ACP_TO_ADV_FLAG", "ACP_TO_DIS_FLAG", "COLL_TO_PUR_FLAG",
                    "AUTO_ACP_TO_ADV_FLAG", "OVD_OVERDRAFT_FLAG", "IS_ICCF_CHANGED", "IS_TAX_CHANGED", "IS_SETTLEMENT_CHANGED",
                    "OUR_LC_REF", "THEIR_LC_REF", "BASE_DATE", "BASE_DATE_DESC", "COLLECTION_REF",
                    "TENOR_CODE", "BILL_CCY", "BILL_AMT", "COLLATERAL_CCY", "COLLATERAL_AMT",
                    "COLLATERAL_DESC", "DOC_ORG_RECV_FLAG", "DOC_DUP_RECV_FLAG", "COVERING_LETTER_DATE", "LIMITS_MONITORING_FLAG",
                    "REDISCOUNT_FLAG", "STATUS_CONTROL_FLAG", "AUTO_LIQ_FLAG", "GRACE_DAYS", "USER_DEFINED_STATUS",
                    "STATUS_ASOF_DATE", "CONV_STATUS", "ERR_MSG", "CR_VALUE_DATE", "DR_VALUE_DATE",
                    "DIS_TO_COLL_FLAG", "PUR_TO_COLL_FLAG", "ACP_FROM_DATE", "ACP_TO_DATE", "ACP_INT_COMP",
                    "ACP_ICCF_COL_TYPE", "ADVANCE_BY_LOAN", "ALLOW_ROLLOVER", "USE_LCREF_IN_MSG", "CONTRACT_REF_NO",
                    "PRODUCT_CODE", "FUND_REFERENCE_NO", "THEIR_CHG_CCY", "THEIR_CHG_AMT", "PASS_OUR_CHG_TO_THEM",
                    "PASS_INTEREST_TO_THEM", "OUR_CHARGES_REFUSED", "THEIR_CHARGES_REFUSED", "MSG_PROC_FLAG", "ICCF_PICKUP_CCY",
                    "EXCH_RATE", "BASE_DATE_CODE", "LC_AMT", "USER_REF", "CHECK_NUMBER",
                    "REIMBURSEMENT_DAYS", "MARGIN_AMT_LIQD", "EVENT_SEQ_NO", "INT_LIQD_MODE", "SUBSYSTEM_STAT",
                    "ULTI_ROLL_PARENT", "DISCOUNTING_METHOD", "VERSION_NO", "EVENT_CODE", "IS_CHARGE_CHANGED",
                    "MARGIN_DUE_AMT", "MARGIN_AMT", "CUST_MARGIN", "ALLOW_PREPAY", "LOAN_REF_NO",
                    "LATEST_VERSION_NO", "BOOK_DATE", "LATEST_EVENT_SEQ_NO", "ACTION_CODE", "FUNCTION_ID",
                    "SOURCE_SEQ_NO", "LC_LIAB_AMT", "ACKN_RECVD", "ACKN_DATE", "FORFAITING_REQ_DATE",
                    "FORFAITING_DOC_DATE", "ACP_TO_FORFAIT_FLAG", "DIS_TO_FORFAIT_FLAG", "LINKED_TO_LOAN", "PURCHASE_AMT",
                    "UNLINKED_FX_RATE", "EFFC_LCY_COL_EX_RATE", "EFFC_LCY_PUR_XRATE", "FUND_ID", "SETTLE_AVAILABLE_AMT",
                    "ALLOW_BROKERAGE", "BROK_PAID_BY_US", "BROKER", "COLL_CONTRIBUTION", "LIQD_USING_COLLAT",
                    "CHG_CLM_SWIFT", "CHGCLM_TEMPLATE_ID", "CONTRACT_DERIVED_STATUS", "COLLECT_LC_ADV_CHG_FROM", "TFR_COLLATERAL_FROM_LC",
                    "TRANSFERRED_COLLATERAL_AMT", "REFUND_INTEREST", "REFUND_INT_RATE", "REFUND_INT_CODE", "REBATE_AMT",
                    "LC_NOT_ADVISED", "DEBIT_ACCOUNT", "DEBIT_ACC_BRN", "DEBIT_ACC_CCY", "UI_DEBIT_ACCOUNT",
                    "CHG_DEBIT_ACCOUNT", "CHG_DEBIT_ACC_BRN", "CHG_DEBIT_ACC_CCY", "UI_CHG_DEBIT_ACCOUNT", "CREDIT_ACCOUNT",
                    "CREDIT_ACC_BRN", "CREDIT_ACC_CCY", "UI_CREDIT_ACCOUNT", "WAIVE_END_DATE", "EXT_CHARGE",
                    "ANCILLARY_MESG", "ANCILLARY_MESG_FUNCTION", "ASSIGNED_BY_US", "REASON_NONPMNT_CODE", "REASON_NONPMNT_NARATIV",
                    "DISP_OF_REIM_CLM", "DISP_OF_REIM_CLAIM_NARATIV", "COLL_TO_CAC_FLAG", "SOURCE_BRANCH"
                );
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadMasterModel>() {{
                setTargetType(TransBctbUploadMasterModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadMaster> bctbUploadMasterWriter() {
        JpaItemWriter<TransBctbUploadMaster> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //----Bctb_Upload_Goods----
    
    @Bean
    public Job bctbUploadGoodsJob() {
        return jobBuilderFactory.get("bctbUploadGoodsJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadGoodsStep())
                .build();
    }

    @Bean
    public Step bctbUploadGoodsStep() {
        return stepBuilderFactory.get("bctbUploadGoodsStep")
                .<TransBctbUploadGoodsModel, TransBctbUploadGoods>chunk(100)
                .reader(bctbUploadGoodsReader())
                .processor(bctbUploadGoods)
                .writer(bctbUploadGoodsWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadGoodsSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadGoodsModel> bctbUploadGoodsReader() {
        FlatFileItemReader<TransBctbUploadGoodsModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_GOODS.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadGoodsModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE", "GOODS_CODE", "GOODS_DESC",
                        "CONV_STATUS", "ERR_MSG", "SOURCE_SEQ_NO", "INCO_TERM");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadGoodsModel>() {{
                setTargetType(TransBctbUploadGoodsModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadGoods> bctbUploadGoodsWriter() {
        JpaItemWriter<TransBctbUploadGoods> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //----Bctb_Upload_Shipment_Info----
    
    @Bean
    public Job bctbUploadShipmentInfoJob() {
        return jobBuilderFactory.get("bctbUploadShipmentInfoJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadShipmentInfoStep())
                .build();
    }

    @Bean
    public Step bctbUploadShipmentInfoStep() {
        return stepBuilderFactory.get("bctbUploadShipmentInfoStep")
                .<TransBctbUploadShipmentInfoModel, TransBctbUploadShipmentInfo>chunk(100)
                .reader(bctbUploadShipmentInfoReader())
                .processor(bctbUploadShipmentInfo)
                .writer(bctbUploadShipmentInfoWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadShipmentInfoSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadShipmentInfoModel> bctbUploadShipmentInfoReader() {
        FlatFileItemReader<TransBctbUploadShipmentInfoModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_SHIPMENT_INFO.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadShipmentInfoModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE", "SHIPMENT_MARKS", "DESPATCHED_FROM",
                        "DESPATCHED_TO", "CARRIER_NAME", "PARTIAL_SHIPMENT_FLAG", "SHIPMENT_DETAILS", "LATEST_SHIPMENT_DATE",
                        "TRANS_SHIPMENT_FLAG", "SHIPMENT_DATE", "ARRIVAL_DATE", "OTHER_SHIPMENT_INFO", "CONV_STATUS",
                        "ERR_MSG", "SOURCE_SEQ_NO");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadShipmentInfoModel>() {{
                setTargetType(TransBctbUploadShipmentInfoModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadShipmentInfo> bctbUploadShipmentInfoWriter() {
        JpaItemWriter<TransBctbUploadShipmentInfo> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //----Bctb_Upload_Pay_Exc----
    
    @Bean
    public Job bctbUploadPayExcJob() {
        return jobBuilderFactory.get("bctbUploadPayExcJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadPayExcStep())
                .build();
    }

    @Bean
    public Step bctbUploadPayExcStep() {
        return stepBuilderFactory.get("bctbUploadPayExcStep")
                .<TransBctbUploadPayExcModel, TransBctbUploadPayExc>chunk(100)
                .reader(bctbUploadPayExcReader())
                .processor(bctbUploadPayExc)
                .writer(bctbUploadPayExcWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadPayExcSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadPayExcModel> bctbUploadPayExcReader() {
        FlatFileItemReader<TransBctbUploadPayExcModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_PAY_EXC.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadPayExcModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE", "TRACER_REQD_FLAG", "NUM_TRACERS_TOBE_SENT",
                        "TRACER_MEDIUM", "TRACER_START_DATE", "TRACER_FREQUENCY", "PREVIOUS_TRACER_DATE", "NUM_TRACERS_SENT",
                        "NEXT_TRACER_DATE", "PAYMENT_EXCEPTION_FLAG", "TRACER_RECEIVER_PARTYTYPE", "PAYMENT_MSG_DATE", "NON_PAYMENT_MSG_DATE",
                        "PROTEST_FLAG", "DATE_OF_PROTEST", "CONV_STATUS", "ERR_MSG", "MANUALLY_GENERATE_FLAG", "SOURCE_SEQ_NO");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadPayExcModel>() {{
                setTargetType(TransBctbUploadPayExcModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadPayExc> bctbUploadPayExcWriter() {
        JpaItemWriter<TransBctbUploadPayExc> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //----Bctb_Upload_Pay_Fate----
    
    @Bean
    public Job bctbUploadPayFateJob() {
        return jobBuilderFactory.get("bctbUploadPayFateJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadPayFateStep())
                .build();
    }

    @Bean
    public Step bctbUploadPayFateStep() {
        return stepBuilderFactory.get("bctbUploadPayFateStep")
                .<TransBctbUploadPayFateModel, TransBctbUploadPayFate>chunk(100)
                .reader(bctbUploadPayFateReader())
                .processor(bctbUploadPayFate)
                .writer(bctbUploadPayFateWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadPayExcSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadPayFateModel> bctbUploadPayFateReader() {
        FlatFileItemReader<TransBctbUploadPayFateModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_PAY_FATE.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadPayFateModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE", "ADVFATE_REQD_FLAG", "ADVFATE_MEDIUM",
                        "PREVIOUS_ADVFATE_DATE", "NUM_ADVFATES_SENT", "NEXT_ADVFATE_DATE", "ADVFATE_RECEIVER_PARTYTYPE", "MANUALLY_GENERATE_FLAG",
                        "CONV_STATUS", "ERR_MSG", "SOURCE_SEQ_NO");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadPayFateModel>() {{
                setTargetType(TransBctbUploadPayFateModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadPayFate> bctbUploadPayFateWriter() {
        JpaItemWriter<TransBctbUploadPayFate> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //----Bctb_Upload_Acc_Exc----
    
    @Bean
    public Job bctbUploadAccExcJob() {
        return jobBuilderFactory.get("bctbUploadAccExcJob")
                .incrementer(new RunIdIncrementer())
                .start(bctbUploadAccExcStep())
                .build();
    }

    @Bean
    public Step bctbUploadAccExcStep() {
        return stepBuilderFactory.get("bctbUploadAccExcStep")
                .<TransBctbUploadAccExcModel, TransBctbUploadAccExc>chunk(100)
                .reader(bctbUploadAccExcReader())
                .processor(bctbUploadAccExc)
                .writer(bctbUploadAccExcWriter())
                .faultTolerant()
                .skip(Exception.class)
                .skipLimit(100)
                .listener(bctbUploadAccExcSkipListener)
                .build();
    }

    @StepScope
    @Bean
    public FlatFileItemReader<TransBctbUploadAccExcModel> bctbUploadAccExcReader() {
        FlatFileItemReader<TransBctbUploadAccExcModel> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_ACC_EXC.csv"));
        reader.setLinesToSkip(1);

        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadAccExcModel>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames("SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE", "TRACER_REQD_FLAG", "NUM_TRACERS_TOBE_SENT",
                        "TRACER_MEDIUM", "TRACER_START_DATE", "TRACER_FREQUENCY", "PREVIOUS_TRACER_DATE",
                        "NEXT_TRACER_DATE", "NUM_TRACERS_SENT", "NON_ACCEPTANCE_MSG_DATE", "PROTEST_FLAG",
                        "ACCEPTANCE_EXCEPTION_FLAG", "TRACER_RECEIVER_PARTYTYPE", "DATE_OF_PROTEST",
                        "ACCEPTANCE_MSG_DATE", "CONV_STATUS", "ERR_MSG", "MANUALLY_GENERATE_FLAG", "SOURCE_SEQ_NO");
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadAccExcModel>() {{
                setTargetType(TransBctbUploadAccExcModel.class);
            }});
        }});
        return reader;
    }

    @Bean
    public JpaItemWriter<TransBctbUploadAccExc> bctbUploadAccExcWriter() {
        JpaItemWriter<TransBctbUploadAccExc> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
    //----Bctb_Upload_Acc_Fate----
    
	    @Bean
	    public Job bctbUploadAccFateJob() {
	        return jobBuilderFactory.get("bctbUploadAccFateJob")
	                .incrementer(new RunIdIncrementer())
	                .start(bctbUploadAccFateStep())
	                .build();
	    }
	
	    @Bean
	    public Step bctbUploadAccFateStep() {
	        return stepBuilderFactory.get("bctbUploadAccFateStep")
	                .<TransBctbUploadAccFateModel, TransBctbUploadAccFate>chunk(100)
	                .reader(bctbUploadAccFateReader())
	                .processor(bctbUploadAccFate)
	                .writer(bctbUploadAccFateWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(bctbUploadAccFateSkipListener)
	                .build();
	    }
	
	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransBctbUploadAccFateModel> bctbUploadAccFateReader() {
	        FlatFileItemReader<TransBctbUploadAccFateModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_ACC_FATE.csv"));
	        reader.setLinesToSkip(1);
	
	        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadAccFateModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames("SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE", "ADVFATE_REQD_FLAG", "ADVFATE_MEDIUM",
	                        "PREVIOUS_ADVFATE_DATE", "NUM_ADVFATES_SENT", "NEXT_ADVFATE_DATE",
	                        "ADVFATE_RECEIVER_PARTYTYPE", "MANUALLY_GENERATE_FLAG",
	                        "CONV_STATUS", "ERR_MSG", "SOURCE_SEQ_NO");
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadAccFateModel>() {{
	                setTargetType(TransBctbUploadAccFateModel.class);
	            }});
	        }});
	        return reader;
	    }
	
	    @Bean
	    public JpaItemWriter<TransBctbUploadAccFate> bctbUploadAccFateWriter() {
	        JpaItemWriter<TransBctbUploadAccFate> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
    
    //----Bctb_Upload_Reserve----
    
	    @Bean
	    public Job bctbUploadReserveJob() {
	        return jobBuilderFactory.get("bctbUploadReserveJob")
	                .incrementer(new RunIdIncrementer())
	                .start(bctbUploadReserveStep())
	                .build();
	    }

	    @Bean
	    public Step bctbUploadReserveStep() {
	        return stepBuilderFactory.get("bctbUploadReserveStep")
	                .<TransBctbUploadReserveModel, TransBctbUploadReserve>chunk(100)
	                .reader(bctbUploadReserveReader())
	                .processor(bctbUploadReserve)
	                .writer(bctbUploadReserveWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(bctbUploadReserveSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransBctbUploadReserveModel> bctbUploadReserveReader() {
	        FlatFileItemReader<TransBctbUploadReserveModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_RESERVE.csv"));
	        reader.setLinesToSkip(1);

	        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadReserveModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames("SOURCE_CODE", "BRANCH_CODE", "SOURCE_REF", "UNDER_RESERVE_FLAG",
	                        "TRACER_REQD_FLAG", "NUM_TRACERS_TOBE_SENT", "TRACER_MEDIUM", "TRACER_FREQUENCY",
	                        "TRACER_START_DATE", "PREVIOUS_TRACER_DATE", "NUM_TRACERS_SENT", "NEXT_TRACER_DATE",
	                        "RESERVE_RELEASE_DATE", "CABLE_ISSUING_BANK_FLAG", "DISC_APPROVED_DATE",
	                        "RESERVE_EXCEPTION_FLAG", "TRACER_RECEIVER_PARTYTYPE",
	                        "CONV_STATUS", "ERR_MSG", "SOURCE_SEQ_NO");
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadReserveModel>() {{
	                setTargetType(TransBctbUploadReserveModel.class);
	            }});
	        }});
	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransBctbUploadReserve> bctbUploadReserveWriter() {
	        JpaItemWriter<TransBctbUploadReserve> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }

    //---Bctb_Upload_Invoice_Master---
	    @Bean
	    public Job bctbUploadInvoiceMasterJob() {
	        return jobBuilderFactory.get("bctbUploadInvoiceMasterJob")
	                .incrementer(new RunIdIncrementer())
	                .start(bctbUploadInvoiceMasterStep())
	                .build();
	    }

	    @Bean
	    public Step bctbUploadInvoiceMasterStep() {
	        return stepBuilderFactory.get("bctbUploadInvoiceMasterStep")
	                .<TransBctbUploadInvoiceMasterModel, TransBctbUploadInvoiceMaster>chunk(100)
	                .reader(bctbUploadInvoiceMasterReader())
	                .processor(bctbUploadInvoiceMaster)
	                .writer(bctbUploadInvoiceMasterWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(bctbUploadInvoiceMasterSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransBctbUploadInvoiceMasterModel> bctbUploadInvoiceMasterReader() {
	        FlatFileItemReader<TransBctbUploadInvoiceMasterModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_INVOICE_MASTER.csv"));
	        reader.setLinesToSkip(1);

	        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadInvoiceMasterModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames("SOURCE_CODE", "SOURCE_REF", "MARGIN_IND", "MARGIN",
	                        "ELIGIBLE_AMOUNT", "INVOICE_CCY", "BRANCH_CODE", "SOURCE_SEQ_NO");
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadInvoiceMasterModel>() {{
	                setTargetType(TransBctbUploadInvoiceMasterModel.class);
	            }});
	        }});
	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransBctbUploadInvoiceMaster> bctbUploadInvoiceMasterWriter() {
	        JpaItemWriter<TransBctbUploadInvoiceMaster> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
	    
	    //-----Bctb_Upload_Insurance----
	    
	    @Bean
	    public Job bctbUploadInsuranceJob() {
	        return jobBuilderFactory.get("bctbUploadInsuranceJob")
	                .incrementer(new RunIdIncrementer())
	                .start(bctbUploadInsuranceStep())
	                .build();
	    }

	    @Bean
	    public Step bctbUploadInsuranceStep() {
	        return stepBuilderFactory.get("bctbUploadInsuranceStep")
	                .<TransBctbUploadInsuranceModel, TransBctbUploadInsurance>chunk(100)
	                .reader(bctbUploadInsuranceReader())
	                .processor(bctbUploadInsurance)
	                .writer(bctbUploadInsuranceWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(bctbUploadInsuranceSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransBctbUploadInsuranceModel> bctbUploadInsuranceReader() {
	        FlatFileItemReader<TransBctbUploadInsuranceModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_INSURANCE.csv"));
	        reader.setLinesToSkip(1);

	        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadInsuranceModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames("SOURCE_CODE", "SOURCE_REF", "BRANCH_CODE", "BCREFNO",
	                         "INSURANCE_COMP_CODE", "INSURANCE_COMP_NAME", "INSURANCE_POL_NO",
	                         "CONV_STATUS", "ERR_MSG", "SOURCE_SEQ_NO");
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadInsuranceModel>() {{
	                setTargetType(TransBctbUploadInsuranceModel.class);
	            }});
	        }});
	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransBctbUploadInsurance> bctbUploadInsuranceWriter() {
	        JpaItemWriter<TransBctbUploadInsurance> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
	    
	    //-----Bctm_Upload_Loan_Preference----
	    
	    @Bean
	    public Job bctmUploadLoanPreferenceJob() {
	        return jobBuilderFactory.get("bctmUploadLoanPreferenceJob")
	                .incrementer(new RunIdIncrementer())
	                .start(bctmUploadLoanPreferenceStep())
	                .build();
	    }

	    @Bean
	    public Step bctmUploadLoanPreferenceStep() {
	        return stepBuilderFactory.get("bctmUploadLoanPreferenceStep")
	                .<TransBctmUploadLoanPreferenceModel, TransBctmUploadLoanPreference>chunk(100)
	                .reader(bctmUploadLoanPreferenceReader())
	                .processor(bctmUploadLoanPreference)
	                .writer(bctmUploadLoanPreferenceWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(bctmUploadLoanPreferenceSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransBctmUploadLoanPreferenceModel> bctmUploadLoanPreferenceReader() {
	        FlatFileItemReader<TransBctmUploadLoanPreferenceModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/STTM_UPLOAD_CUSTOMER.csv"));
	        reader.setLinesToSkip(1); // Skip header row
	        reader.setStrict(true); // Fail if file doesn't exist

	        reader.setLineMapper(new DefaultLineMapper<TransBctmUploadLoanPreferenceModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames(
	                    "SOURCE_CODE",
	                    "SOURCE_REF", 
	                    "TENOR",
	                    "UNITS",
	                    "CREDIT_LINE",
	                    "RATE_CODE",
	                    "EXCHANGE_RATE",
	                    "RATE_TYPE",
	                    "MATURITY_ACCOUNT",
	                    "BRANCH_CODE",
	                    "SOURCE_SEQ_NO",
	                    "CRYSTALLIZATION_TYPE",
	                    "COLL_LIQD_AMOUNT",
	                    "LIQD_LC_CHRG_COMM",
	                    "MATURITY_DATE",
	                    "LOAN_AMOUNT",
	                    "BILL_OUTSTANDING",
	                    "BILL_CCY",
	                    "RATE_CODE_PREF",
	                    "MAXIMUM_RATE_VARIANCE",
	                    "NORMAL_RATE_VARIANCE",
	                    "PAYMENT_MODE",
	                    "DR_ACC_BRN",
	                    "DR_PROD_AC",
	                    "CR_ACC_BRN",
	                    "CR_PROD_AC",
	                    "BRIDGE_GL",
	                    "PRODUCT",
	                    "CURRENCY"
	                );
	                setDelimiter(",");
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctmUploadLoanPreferenceModel>() {{
	                setTargetType(TransBctmUploadLoanPreferenceModel.class);
	            }});
	        }});

	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransBctmUploadLoanPreference> bctmUploadLoanPreferenceWriter() {
	        JpaItemWriter<TransBctmUploadLoanPreference> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
	    
	    //----Lctb_Upload_Collateral---
	    
	    @Bean
	    public Job lctbUploadCollateralJob() {
	        return jobBuilderFactory.get("lctbUploadCollateralJob")
	                .incrementer(new RunIdIncrementer())
	                .start(lctbUploadCollateralStep())
	                .build();
	    }

	    @Bean
	    public Step lctbUploadCollateralStep() {
	        return stepBuilderFactory.get("lctbUploadCollateralStep")
	                .<TransLctbUploadCollateralModel, TransLctbUploadCollateral>chunk(100)
	                .reader(lctbUploadCollateralReader())
	                .processor(lctbUploadCollateral)
	                .writer(lctbUploadCollateralWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(lctbUploadCollateralSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransLctbUploadCollateralModel> lctbUploadCollateralReader() {
	        FlatFileItemReader<TransLctbUploadCollateralModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/LCTB_UPLOAD_COLLATERAL.csv"));
	        reader.setLinesToSkip(1); // Skip header row
	        reader.setStrict(true); // Fail if file doesn't exist

	        reader.setLineMapper(new DefaultLineMapper<TransLctbUploadCollateralModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames(
	                    "BRANCH_CODE",
	                    "SOURCE_CODE",
	                    "SOURCE_REF",
	                    "COLLATERAL_CCY",
	                    "COLLATERAL_PCT",
	                    "COLLATERAL_AMT",
	                    "COLLATERAL_DESCR",
	                    "EXCH_RATE",
	                    "ADJUSTMENT_AMT",
	                    "ADJUSTMENT_SIGN",
	                    "SOURCE_SEQ_NO"
	                );
	                setDelimiter(",");
	                setQuoteCharacter('"');
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransLctbUploadCollateralModel>() {{
	                setTargetType(TransLctbUploadCollateralModel.class);
	            }});
	        }});

	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransLctbUploadCollateral> lctbUploadCollateralWriter() {
	        JpaItemWriter<TransLctbUploadCollateral> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
	    
	    //----Bctb_upld_pack_credit_dtls----
	    
	    @Bean
	    public Job bctbUploadPackCreditDtlsJob() {
	        return jobBuilderFactory.get("bctbUploadPackCreditDtlsJob")
	                .incrementer(new RunIdIncrementer())
	                .start(bctbUploadPackCreditDtlsStep())
	                .build();
	    }

	    @Bean
	    public Step bctbUploadPackCreditDtlsStep() {
	        return stepBuilderFactory.get("bctbUploadPackCreditDtlsStep")
	                .<TransBctbUploadPackCreditDtlsModel, TransBctbUploadPackCreditDtls>chunk(100)
	                .reader(bctbUploadPackCreditDtlsReader())
	                .processor(bctbUploadPackCreditDtls)
	                .writer(bctbUploadPackCreditDtlsWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(bctbUploadPackCreditDtlsSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransBctbUploadPackCreditDtlsModel> bctbUploadPackCreditDtlsReader() {
	        FlatFileItemReader<TransBctbUploadPackCreditDtlsModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_PACK_CREDIT_DTLS.csv"));
	        reader.setLinesToSkip(1); // Skip header row
	        reader.setStrict(true); // Fail if file doesn't exist

	        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadPackCreditDtlsModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames(
	                    "BRANCH_CODE",
	                    "SOURCE_CODE",
	                    "SOURCE_REF",
	                    "SOURCE_SEQ_NO",
	                    "BCREFNO",
	                    "CL_ACCOUNT",
	                    "SEQ_NO",
	                    "LINKED_CCY",
	                    "OUTSTANDING_AMT",
	                    "EVENT_CODE",
	                    "SETTLED_AMT"
	                );
	                setDelimiter(",");
	                setQuoteCharacter('"');
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadPackCreditDtlsModel>() {{
	                setTargetType(TransBctbUploadPackCreditDtlsModel.class);
	            }});
	        }});

	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransBctbUploadPackCreditDtls> bctbUploadPackCreditDtlsWriter() {
	        JpaItemWriter<TransBctbUploadPackCreditDtls> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
	    
	    //----Bctb_Upload_Brok_Master----
	    
	    @Bean
	    public Job bctbUploadBrokMasterJob() {
	        return jobBuilderFactory.get("bctbUploadBrokMasterJob")
	                .incrementer(new RunIdIncrementer())
	                .start(bctbUploadBrokMasterStep())
	                .build();
	    }

	    @Bean
	    public Step bctbUploadBrokMasterStep() {
	        return stepBuilderFactory.get("bctbUploadBrokMasterStep")
	                .<TransBctbUploadBrokMasterModel, TransBctbUploadBrokMaster>chunk(100)
	                .reader(bctbUploadBrokMasterReader())
	                .processor(bctbUploadBrokMaster)
	                .writer(bctbUploadBrokMasterWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(bctbUploadBrokMasterSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransBctbUploadBrokMasterModel> bctbUploadBrokMasterReader() {
	        FlatFileItemReader<TransBctbUploadBrokMasterModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_BROK_MASTER.csv"));
	        reader.setLinesToSkip(1); // Skip header row
	        reader.setStrict(true); // Fail if file doesn't exist

	        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadBrokMasterModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames(
	                    "BRANCH_CODE",
	                    "SOURCE_CODE",
	                    "SOURCE_REF",
	                    "SOURCE_SEQ_NO",
	                    "CONTRACT_CCY",
	                    "CONTRACT_AMT",
	                    "BROKERAGE_PERCENT",
	                    "BROKERAGE_AMT"
	                );
	                setDelimiter(",");
	                setQuoteCharacter('"');
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadBrokMasterModel>() {{
	                setTargetType(TransBctbUploadBrokMasterModel.class);
	            }});
	        }});

	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransBctbUploadBrokMaster> bctbUploadBrokMasterWriter() {
	        JpaItemWriter<TransBctbUploadBrokMaster> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
	    
	    //----Bctb_Upload_Brok_Detail---
	    
	    @Bean
	    public Job bctbUploadBrokDetailJob() {
	        return jobBuilderFactory.get("bctbUploadBrokDetailJob")
	                .incrementer(new RunIdIncrementer())
	                .start(bctbUploadBrokDetailStep())
	                .build();
	    }

	    @Bean
	    public Step bctbUploadBrokDetailStep() {
	        return stepBuilderFactory.get("bctbUploadBrokDetailStep")
	                .<TransBctbUploadBrokDetailModel, TransBctbUploadBrokDetail>chunk(100)
	                .reader(bctbUploadBrokDetailReader())
	                .processor(bctbUploadBrokDetail)
	                .writer(bctbUploadBrokDetailWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(bctbUploadBrokDetailSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransBctbUploadBrokDetailModel> bctbUploadBrokDetailReader() {
	        FlatFileItemReader<TransBctbUploadBrokDetailModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_BROK_DETAIL.csv"));
	        reader.setLinesToSkip(1); // Skip header row
	        reader.setStrict(true); // Fail if file doesn't exist

	        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadBrokDetailModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames(
	                    "BRANCH_CODE",
	                    "SOURCE_CODE",
	                    "SOURCE_REF",
	                    "SOURCE_SEQ_NO",
	                    "BROK_SEQ_NO",
	                    "BROKER",
	                    "BROKER_ACC",
	                    "BROKER_ACC_CCY",
	                    "BROKER_PERCENT",
	                    "BROKAMT_CON_CCY",
	                    "EXCHANGE_RATE",
	                    "ORIGINAL_EX_RATE",
	                    "BROKAMT_ACC_CCY",
	                    "NEGOTIATED_RATE",
	                    "NEGOTIATION_REF_NO",
	                    "REMARKS",
	                    "LIQ_STATUS"
	                );
	                setDelimiter(",");
	                setQuoteCharacter('"');
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadBrokDetailModel>() {{
	                setTargetType(TransBctbUploadBrokDetailModel.class);
	            }});
	        }});

	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransBctbUploadBrokDetail> bctbUploadBrokDetailWriter() {
	        JpaItemWriter<TransBctbUploadBrokDetail> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
	    
	    //---Bctb_Upload_Multitnr---
	    
	    @Bean
	    public Job bctbUploadMultitnrJob() {
	        return jobBuilderFactory.get("bctbUploadMultitnrJob")
	                .incrementer(new RunIdIncrementer())
	                .start(bctbUploadMultitnrStep())
	                .build();
	    }

	    @Bean
	    public Step bctbUploadMultitnrStep() {
	        return stepBuilderFactory.get("bctbUploadMultitnrStep")
	                .<TransBctbUploadMultitnrModel, TransBctbUploadMultitnr>chunk(100)
	                .reader(bctbUploadMultitnrReader())
	                .processor(bctbUploadMultitnr)
	                .writer(bctbUploadMultitnrWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(bctbUploadMultitnrSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransBctbUploadMultitnrModel> bctbUploadMultitnrReader() {
	        FlatFileItemReader<TransBctbUploadMultitnrModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_MULTITNR.csv"));
	        reader.setLinesToSkip(1); // Skip header row
	        reader.setStrict(true); // Fail if file doesn't exist

	        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadMultitnrModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames(
	                    "SOURCE_CODE",
	                    "SOURCE_REF",
	                    "BRANCH_CODE",
	                    "SOURCE_SEQ_NO",
	                    "BCREFNO",
	                    "EVENT_SEQ_NO",
	                    "SERIAL_NUMBER",
	                    "BASE_DATE",
	                    "BASE_DATE_CODE",
	                    "VALUE_DATE",
	                    "TENOR",
	                    "TRANSIT_DAYS",
	                    "MATURITY_DATE",
	                    "SPLIT_PERCENT",
	                    "BILL_AMOUNT",
	                    "DISCOUNT_AMOUNT",
	                    "REBATE_AMOUNT",
	                    "EXCHANGE_RATE",
	                    "DISCOUNTED_AMOUNT",
	                    "LIQUIDATION_AMOUNT",
	                    "LIQUIDATED_AMOUNT",
	                    "INTEREST_AMOUNT",
	                    "FROM_CALCULATION_DATE",
	                    "TO_CALCULATION_DATE",
	                    "USER_DEFINED_STATUS",
	                    "STATUS_AS_OF_DATE",
	                    "UNDER_PROTEST",
	                    "PROTEST_DATE"
	                );
	                setDelimiter(",");
	                setQuoteCharacter('"');
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadMultitnrModel>() {{
	                setTargetType(TransBctbUploadMultitnrModel.class);
	            }});
	        }});

	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransBctbUploadMultitnr> bctbUploadMultitnrWriter() {
	        JpaItemWriter<TransBctbUploadMultitnr> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
	    
	    //---LCTB_UPLOAD_LIC_UTL_DTL---
	    
	    @Bean
	    public Job lctbUploadLicUtlDtlJob() {
	        return jobBuilderFactory.get("lctbUploadLicUtlDtlJob")
	                .incrementer(new RunIdIncrementer())
	                .start(lctbUploadLicUtlDtlStep())
	                .build();
	    }

	    @Bean
	    public Step lctbUploadLicUtlDtlStep() {
	        return stepBuilderFactory.get("lctbUploadLicUtlDtlStep")
	                .<TransLctbUploadLicUtlDtlModel, TransLctbUploadLicUtlDtl>chunk(100)
	                .reader(lctbUploadLicUtlDtlReader())
	                .processor(lctbUploadLicUtlDtl)
	                .writer(lctbUploadLicUtlDtlWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(lctbUploadLicUtlDtlSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransLctbUploadLicUtlDtlModel> lctbUploadLicUtlDtlReader() {
	        FlatFileItemReader<TransLctbUploadLicUtlDtlModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/LCTB_UPLOAD_LIC_UTL_DTL.csv"));
	        reader.setLinesToSkip(1); // Skip header row
	        reader.setStrict(true); // Fail if file doesn't exist

	        reader.setLineMapper(new DefaultLineMapper<TransLctbUploadLicUtlDtlModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames(
	                    "BRANCH_CODE",
	                    "SOURCE_CODE",
	                    "SOURCE_REF",
	                    "SOURCE_SEQ_NO",
	                    "IMPORT_LICENSE_NO",
	                    "GOODS_CODE",
	                    "AMOUNT_REINSTATED",
	                    "QUANTITY_REINSTATED",
	                    "AMOUNT_UTILIZED",
	                    "QUANTITY_UTILIZED",
	                    "REMARKS"
	                );
	                setDelimiter(",");
	                setQuoteCharacter('"');
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransLctbUploadLicUtlDtlModel>() {{
	                setTargetType(TransLctbUploadLicUtlDtlModel.class);
	            }});
	        }});

	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransLctbUploadLicUtlDtl> lctbUploadLicUtlDtlWriter() {
	        JpaItemWriter<TransLctbUploadLicUtlDtl> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
	    
	    //---Bctb_Upload_Assignee_Details---
	    
	    @Bean
	    public Job bctbUploadAssigneeDetailsJob() {
	        return jobBuilderFactory.get("bctbUploadAssigneeDetailsJob")
	                .incrementer(new RunIdIncrementer())
	                .start(bctbUploadAssigneeDetailsStep())
	                .build();
	    }

	    @Bean
	    public Step bctbUploadAssigneeDetailsStep() {
	        return stepBuilderFactory.get("bctbUploadAssigneeDetailsStep")
	                .<TransBctbUploadAssigneeDetailsModel, TransBctbUploadAssigneeDetails>chunk(100)
	                .reader(bctbUploadAssigneeDetailsReader())
	                .processor(bctbUploadAssigneeDetails)
	                .writer(bctbUploadAssigneeDetailsWriter())
	                .faultTolerant()
	                .skip(Exception.class)
	                .skipLimit(100)
	                .listener(bctbUploadAssigneeDetailsSkipListener)
	                .build();
	    }

	    @StepScope
	    @Bean
	    public FlatFileItemReader<TransBctbUploadAssigneeDetailsModel> bctbUploadAssigneeDetailsReader() {
	        FlatFileItemReader<TransBctbUploadAssigneeDetailsModel> reader = new FlatFileItemReader<>();
	        reader.setResource(new FileSystemResource("C:/Users/2942/Downloads/BCTB_UPLOAD_ASSIGNEE_DETAILS.csv"));
	        reader.setLinesToSkip(1); // Skip header row
	        reader.setStrict(true); // Fail if file doesn't exist

	        reader.setLineMapper(new DefaultLineMapper<TransBctbUploadAssigneeDetailsModel>() {{
	            setLineTokenizer(new DelimitedLineTokenizer() {{
	                setNames(
	                    "SOURCE_CODE",
	                    "SOURCE_REF",
	                    "SOURCE_SEQ_NO",
	                    "BRANCH_CODE",
	                    "SEQUENCE",
	                    "ASSIGNEE_ID",
	                    "ASSIGNEE_NAME",
	                    "AMT_BILL_CCY",
	                    "AC_CCY",
	                    "ACCOUNT"
	                );
	                setDelimiter(",");
	                setQuoteCharacter('"');
	            }});
	            setFieldSetMapper(new BeanWrapperFieldSetMapper<TransBctbUploadAssigneeDetailsModel>() {{
	                setTargetType(TransBctbUploadAssigneeDetailsModel.class);
	            }});
	        }});

	        return reader;
	    }

	    @Bean
	    public JpaItemWriter<TransBctbUploadAssigneeDetails> bctbUploadAssigneeDetailsWriter() {
	        JpaItemWriter<TransBctbUploadAssigneeDetails> writer = new JpaItemWriter<>();
	        writer.setEntityManagerFactory(entityManagerFactory);
	        return writer;
	    }
}
