package com.epam;

import cucumber.api.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CucumberContextConfiguration
@CucumberOptions(features="Cucmber.feature",glue="CucumberServiceTest.class")
class CucmberDemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
