package com.qf.smsplatfromeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SmsplatfromEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsplatfromEurekaApplication.class, args);
    }

}
