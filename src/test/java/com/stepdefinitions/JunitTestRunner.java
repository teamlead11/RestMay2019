package com.stepdefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureFiles/pet/FindByStatus.feature", glue = { "com.stepdefinitions",
		"com.common" }, dryRun = false, monochrome = true, plugin = { "html:target" })
public class JunitTestRunner {

}
