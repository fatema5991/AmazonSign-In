package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Feature",
		glue = "com.stepdefinition",
		tags = "@amazon"
		
		)

public class amazonLoginTestRunner extends AbstractTestNGCucumberTests {

}
