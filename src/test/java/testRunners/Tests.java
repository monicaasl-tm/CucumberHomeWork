package testRunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featureFiles", 
glue={"stepDefinitions"},
tags= "@registeredUser and @nonRegisteredUser and @premiumPlanUser and @freePlanUser")
public class Tests extends AbstractTestNGCucumberTests{

}






