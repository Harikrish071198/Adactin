 package org.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\harik\\eclipse-workspace\\SauceDemoCucumber\\src\\test\\resources\\SauceDemo.feature",glue="org.step"
		)
public class TestRunner {

}
