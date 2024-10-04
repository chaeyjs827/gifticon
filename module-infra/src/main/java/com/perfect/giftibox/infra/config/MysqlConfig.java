package com.perfect.giftibox.infra.config;//package com.perfect.giftibox.infra.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.perfect.giftibox")  // 패키지 스캔
@EntityScan(basePackages = "com.perfect.giftibox")  // 엔티티 스캔
public class MysqlConfig {

}