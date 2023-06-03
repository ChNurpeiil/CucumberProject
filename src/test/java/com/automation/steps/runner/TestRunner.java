package com.automation.steps.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features//Login.feature",
        glue = "com.automation.steps",
        //tags = "@smoke or @regression",
        plugin = {"html:target/report.html","json:target/cucumber.json"}
)
public class TestRunner {

}
