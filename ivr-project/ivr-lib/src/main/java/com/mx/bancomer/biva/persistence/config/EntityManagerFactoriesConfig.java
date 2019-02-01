//package com.mx.bancomer.biva.persistence.config;
//
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseFactoryBean;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.test.context.transaction.TransactionConfiguration;
//
//@Configuration
//@TransactionConfiguration
//public class EntityManagerFactoriesConfig {
//    @Autowired
//    private DataSource dataSource;
//    
//    @Bean(name = "entityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean emf() {
//        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//        emf.setDataSource(dataSource);
//        emf.setPersistenceUnitName("bivaPersistenceUnit");
//        emf.setPackagesToScan( new String[] {"com.mx.bancomer.biva.domain"});
//        HibernateJpaVendorAdapter adapter=new HibernateJpaVendorAdapter();
//        adapter.setShowSql(Boolean.TRUE);
//        emf.setJpaVendorAdapter(adapter);
//        return emf;
//    }
//    
//    
//    
//   
//}
