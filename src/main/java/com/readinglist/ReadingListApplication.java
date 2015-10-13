package com.readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.openqa.selenium.server.SeleniumServer;

import org.apache.log4j.Logger;

@SpringBootApplication
public class ReadingListApplication {

    private static Logger log = Logger.getLogger(ReadingListApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ReadingListApplication.class, args);
        log.info("SeleniumServer ClassName is " + SeleniumServer.class.getName());
    }
}
