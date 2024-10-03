package com.perfect.giftibox.infra.config;//package com.perfect.giftibox.infra.config;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = "com.perfect.giftibox")
//@EntityScan(basePackages = "com.perfect.giftibox.domain")
//public class MysqlConfig {
//
//    @Bean
//    public DataSource dataSource() {
//        return DataSourceBuilder.create()
//                .driverClassName("com.mysql.cj.jdbc.Driver")
//                .url("jdbc:mysql://localhost:3306/giftibox")
////                .url("jdbc:mysql://localhost:3306/giftibox?useUnicode=true&characterEncoding=utf8")
//                .username("root")
//                .password("1234")
//                .build();
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setGenerateDdl(true);
//
//        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//        factory.setJpaVendorAdapter(vendorAdapter);
//        factory.setDataSource(dataSource());
//        factory.setPackagesToScan("com.perfect.giftibox.domain");
//
//        return factory;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
////
////    @Bean
////    public EntityManagerFactory entityManagerFactory() {
////        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
////        vendorAdapter.setGenerateDdl(true);
////
////        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
////        factory.setJpaVendorAdapter(vendorAdapter);
////        factory.setPackagesToScan("com.perfect.giftbox");
////        factory.setDataSource(dataSource());
////        factory.afterPropertiesSet();
////
////        return factory.getObject();
////    }
//}

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.perfect.giftibox")  // 패키지 스캔
@EntityScan(basePackages = "com.perfect.giftibox")  // 엔티티 스캔
public class MysqlConfig {
    // 추가적인 Bean 설정이 필요한 경우 여기에 작성
}