package com.epam;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CucmberDemoApplication {
    public static void main(String[] args) {

        SpringApplication.run(CucmberDemoApplication.class, args);
    }
}
