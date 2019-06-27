package BDD;

import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(features="Featur",glue={"StepDef"})
public class TestRunner {

}
