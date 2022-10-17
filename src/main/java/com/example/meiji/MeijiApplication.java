package com.example.meiji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})//加上它就解决了
public class MeijiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeijiApplication.class, args);
    }

}
