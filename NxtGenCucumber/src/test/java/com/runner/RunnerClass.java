package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\src\\test\\java\\com\\featurefiles",
		glue="com.stepdefinition",
		dryRun=false,
		plugin= {"pretty","html:target/ExecutionReport.html","json:target/ExecutionReport.json","junit:target/ExecutionReport.xml"},
		tags="@TagTwo")
public class RunnerClass {

}
