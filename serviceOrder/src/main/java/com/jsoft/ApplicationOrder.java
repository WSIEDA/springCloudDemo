package com.jsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationOrder {
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
    static Logger logger = LoggerFactory.getLogger(ApplicationOrder.class);

    public static void main(String[] args) {
        SpringApplication.run(ApplicationOrder.class, args);
        logger.info("---------订单启动完成----------");
    }
}