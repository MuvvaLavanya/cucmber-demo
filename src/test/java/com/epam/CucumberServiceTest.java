package com.epam;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CucumberServiceTest {

    CucumberService cucumberService;
    String result="";

    @Given("^Execute CucumberService isEvenOrOdd$")
    public void execute_CucumberService_isEvenOrOdd() throws Throwable {
        cucumberService=new CucumberService();
    }


    @When("^if i will enter (\\d+)$")
    public void if_i_will_enter(int arg1) throws Throwable {
        result=cucumberService.isEvenOrOdd(arg1);
    }

    @Then("^we should get even$")
    public void we_should_get_even() throws Throwable {
        assertEquals("even",result);
    }

    @Then("^we should get odd$")
    public void we_should_get_odd() throws Throwable {
        assertEquals("odd",result);
    }

}
