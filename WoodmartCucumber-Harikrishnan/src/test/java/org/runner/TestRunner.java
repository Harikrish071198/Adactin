package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\harik\\eclipse-workspace\\WoodmartCucumber-Harikrishnan\\src\\test\\resources\\Woodmart.feature",glue="org.step")
public class TestRunner {

}
