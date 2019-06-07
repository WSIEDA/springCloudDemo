package com.jsoft;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@SpringBootApplication
@EnableDiscoveryClient
public class AppCustomer {
    /**
     * 实例化RestTemplate对象实例
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * logger instance
     */
    static org.slf4j.Logger logger = LoggerFactory.getLogger(AppCustomer.class);

    public static void main(String[] args) {
        SpringApplication.run(AppCustomer.class, args);
        logger.info("---------顾客服务启动完成----------");
    }
}
