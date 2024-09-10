package com.codewise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class CodewiseApplication {


    public static void main(String[] args) {
        Logger logger = Logger.getLogger(CodewiseApplication.class.getName());
        SpringApplication.run(CodewiseApplication.class, args);

        logger.info("Starting the application!!");

    }
}
