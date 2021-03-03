package com.vastika.um.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {
    @Value("${db.url}")
    private String DB_URL;
    @Value("${db.driver}")
    private String DB_DRIVER;
    @Value("${db.username}")
    private String DB_USERNAME;
    @Value("${db.password}")
    private String DB_PASSWORD;
    @Value("${hibernate.dialect}")
    private String HIBERNATE_DIALECT;//it refers to HQL
    @Value("${hibernate.hbm2ddl}")
    private String HBM2DDL;
    @Value("${hibernate.show_sql}")
    private String SHOW_SQL;
    @Value("${package_to_scan}")
    private String PACKAGE_TO_SCAN;

    @Bean
    public DataSource dataSource(){ //it connects basic datasource to datasource using bean
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(DB_DRIVER);
        dataSource.setUrl(DB_URL);
        dataSource.setUsername(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        return dataSource;

    }

    @Bean// beans helps to create object of the classes
    public LocalSessionFactoryBean sessionFactory() {//sessionfactory-to use CRUD operation in database,it is requred
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan(PACKAGE_TO_SCAN);

        Properties prop = new Properties();//for mapping purposes,they are required
        prop.put("hibernate.dialect", HIBERNATE_DIALECT);
        prop.put("hibernate.hbm2ddl.auto", HBM2DDL);
        prop.put("hibernate.show_sql", SHOW_SQL);

        factoryBean.setHibernateProperties(prop);
        return factoryBean;
    }

    @Bean
    public TransactionManager getTransactionManager() {//to commit or rollback for database,it is required
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory().getObject());
        return transactionManager;

    }

}
