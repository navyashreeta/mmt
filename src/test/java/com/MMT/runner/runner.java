package com.MMT.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/MMT/feature",
		glue="com.MMT.stepdefination")
public class runner{
	
}