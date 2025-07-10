package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\harik\\eclipse-workspace\\AdactinHotel2\\src\\test\\resources\\Adactin.feature", glue = "org.execution",plugin = {"json:target/cucumber.json"})
public class TestRunner {

}
