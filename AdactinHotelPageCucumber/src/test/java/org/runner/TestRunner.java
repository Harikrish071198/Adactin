package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\harik\\eclipse-workspace\\AdactinHotelPageCucumber\\src\\test\\resources\\Adactin.feature",glue="org.step")
public class TestRunner {

}
