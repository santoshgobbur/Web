package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features="com/qa/feature",
			glue="Web/src/main/java/com/stepdef/LoginFeature.java",
			monochrome=true
 )
public class Runner {
		
	}
			