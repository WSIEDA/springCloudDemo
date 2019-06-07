package com.jsoft;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceGateway {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGateway.class, args);
    }

    @Value("${test.uri}")
    private String uri;

    @Value("${test.customerUri}")
    private String customerUri;

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder) {

        return builder.routes()
                //basic proxy
                .route(r -> r.path("/order/**")
                        .uri(uri)
                )

                .route(r -> r.path("/customer/**")
                        .uri(customerUri)
                )

                .build();
    }
}