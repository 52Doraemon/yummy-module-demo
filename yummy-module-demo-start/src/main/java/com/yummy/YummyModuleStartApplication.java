package com.yummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class YummyModuleStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(YummyModuleStartApplication.class, args);
    }

}
