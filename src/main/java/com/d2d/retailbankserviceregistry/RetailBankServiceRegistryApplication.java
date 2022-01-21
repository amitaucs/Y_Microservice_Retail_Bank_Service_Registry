package com.d2d.retailbankserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RetailBankServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetailBankServiceRegistryApplication.class, args);
    }

}
