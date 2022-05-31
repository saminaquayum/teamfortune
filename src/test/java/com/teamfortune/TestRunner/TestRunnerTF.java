package com.teamfortune.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerTF {
	@CucumberOptions(

			features = { "Features" }, 
			glue = { "com.teamfortune.Sepdefs" }
			//,
			//plugin= {"json:target/cucumber.json"}

	)

	public class TestRunner extends AbstractTestNGCucumberTests {

	}

}
