package runner;

import org.junit.runner.RunWith;

 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
 
@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Feature/Signin.feature",glue = {"StepDefinition", "AppHooks"},
monochrome = true,
plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
	 	"html:target/HtmlReport/htmlreport.html"}
		 
)
public class TestRunner {
	
	
	 
	}

	
 
