package testrunners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/AppFeatures/Uber.feature"}, 
        glue = {"stepdefinitions" }, 
        tags = "@All",
        plugin = { "pretty"}

)

public class UberTest {

}
