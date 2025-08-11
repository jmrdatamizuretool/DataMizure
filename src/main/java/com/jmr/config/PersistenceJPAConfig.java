/*package com.jmr.config;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.jmr.framework.util.JMRUtil;

@Configuration
@EnableTransactionManagement
@PropertySource({ "classpath:database.properties" })
@ComponentScan({ "com.jmr" })
@EnableJpaRepositories(basePackages = "com.jmr")
public class PersistenceJPAConfig {

	@Autowired
	private Environment env;

	public PersistenceJPAConfig() {
		super();
	}
	@Bean
	public DataSource datasource() {
		final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
		dsLookup.setResourceRef(true);
		System.out.println("jdbc.jndiName : " + env.getProperty("jdbc.jndiName"));
		DataSource dataSource = dsLookup.getDataSource(env.getProperty("jdbc.jndiName"));
		return dataSource;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		final LocalContainerEntityManagerFactoryBean entityManagerFactoryOne = new LocalContainerEntityManagerFactoryBean();
		entityManagerFactoryOne.setDataSource(datasource());
		entityManagerFactoryOne.setPackagesToScan(new String[] { "com.jmr" });
		final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		entityManagerFactoryOne.setJpaVendorAdapter(vendorAdapter);
		entityManagerFactoryOne.setPersistenceUnitName(env.getProperty("persistenceUnitName"));
		entityManagerFactoryOne.setJpaProperties(additionalProperties());
		return entityManagerFactoryOne;
	}
	
	final Properties additionalProperties() {
		final Properties hibernateProperties = new Properties();
		if (!JMRUtil.isNullOrEmpty(env.getProperty("hibernate.hbm2ddl.auto"))) {
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		}
		if (!JMRUtil.isNullOrEmpty(env.getProperty("hibernate.show_sql"))) {
			hibernateProperties.setProperty("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		}
		if (!JMRUtil.isNullOrEmpty(env.getProperty("hibernate.dialect"))) {
			hibernateProperties.setProperty("hibernate.dialect", env.getProperty("hibernate.dialect"));
		}
		if (!JMRUtil.isNullOrEmpty(env.getProperty("hibernate.cache.use_second_level_cache"))) {
			hibernateProperties.setProperty("hibernate.cache.use_second_level_cache",
					env.getProperty("hibernate.cache.use_second_level_cache"));
		}
		if (!JMRUtil.isNullOrEmpty(env.getProperty("hibernate.cache.use_query_cache"))) {
			hibernateProperties.setProperty("hibernate.cache.use_query_cache",
					env.getProperty("hibernate.cache.use_query_cache"));
		}
		if (!JMRUtil.isNullOrEmpty(env.getProperty("hibernate.default_schema"))) {
			hibernateProperties.setProperty("hibernate.default_schema",
					env.getProperty("hibernate.default_schema"));
		}
		return hibernateProperties;
	}

	@Bean
	public PlatformTransactionManager transactionManager(final EntityManagerFactory entityManagerFactory) {
		final JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
	
	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
}*/
