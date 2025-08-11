package com.jmr.batch.config;

import com.jmr.batch.entity.billsandcollections.TransBctbUploadLimits;
import com.jmr.batch.entity.billsandcollections.TransBctbUploadParties;
import com.jmr.batch.model.billsandcollections.TransBctbUploadLimitsModel;
import com.jmr.batch.model.billsandcollections.TransBctbUploadPartiesModel;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadLimits;
import com.jmr.batch.processor.billsandcollections.FirstItemProBctbUploadParties;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadLimits;
import com.jmr.batch.listener.billsandcollections.SkipListenerBctbUploadParties;
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

    @Autowired
    private FirstItemProBctbUploadLimits bctbUploadLimitsProcessor;

    @Autowired
    private FirstItemProBctbUploadParties bctbUploadPartiesProcessor;

    @Autowired
    private SkipListenerBctbUploadLimits bctbUploadLimitsSkipListener;

    @Autowired
    private SkipListenerBctbUploadParties bctbUploadPartiesSkipListener;

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
}
