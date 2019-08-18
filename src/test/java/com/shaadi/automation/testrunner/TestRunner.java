package com.shaadi.automation.testrunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(
        features = {"src/test/resources"},
        glue = "com.shaadi.automation.test",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun-reports/rerun.txt"
        },
        monochrome=true
        )
public class TestRunner extends AbstractTestNGCucumberTests{
	
	/*
	 * private TestNGCucumberRunner testNGCucumberRunner;
	 * 
	 * @BeforeClass(alwaysRun = true) public void setUpClass() {
	 * testNGCucumberRunner = new TestNGCucumberRunner(this.getClass()); }
	 * 
	 * @Test(groups = "cucumber", description = "Runs Cucumber Feature",
	 * dataProvider = "features") public void feature(CucumberFeatureWrapper
	 * cucumberFeature) {
	 * testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature()); }
	 * 
	 * @DataProvider public Object[][] features() { return
	 * testNGCucumberRunner.provideFeatures(); }
	 * 
	 * @AfterClass(alwaysRun = true) public void tearDownClass() {
	 * testNGCucumberRunner.finish(); }
	 */
    
}
