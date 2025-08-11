package com.jmr.database.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.jmr" })
@EnableJpaRepositories(basePackages = "com.jmr")
@PropertySource("classpath:application.properties")
public class DatabaseConfig {
	@Autowired
	private Environment env;

	public DatabaseConfig() {
		super();
	}
		
	@Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties firstDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSource datasource() {
        return firstDataSourceProperties().initializeDataSourceBuilder().build();
    }
    
    /*@Bean
	@Primary
	public DataSource datasource() {		
		  return DataSourceBuilder.create().driverClassName("oracle.jdbc.OracleDriver")
		  .url("jdbc:oracle:thin:@192.168.1.152:1521:FCUBSPDB").username("bspfcfatoff")
		  .password("bsp456") .build();
		 
		//return DataSourceBuilder.create().build();
	}*/
	
	@Bean
	@Primary
	public EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean lem = 
				new LocalContainerEntityManagerFactoryBean();
		
		lem.setDataSource(datasource());
		lem.setPackagesToScan("com.jmr.batch.entity");
		lem.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		lem.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		lem.afterPropertiesSet();		
		return lem.getObject();
	}
	
	
	
	@Bean
	@Primary
	public JpaTransactionManager jpaTransactionManager() {
		JpaTransactionManager jpaTransactionManager = new 
				JpaTransactionManager();
		
		jpaTransactionManager.setDataSource(datasource());
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory());
		
		return jpaTransactionManager;
	}
	
	
}
