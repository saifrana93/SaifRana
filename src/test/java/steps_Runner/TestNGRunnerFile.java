package steps_Runner;

import java.io.IOException;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 @CucumberOptions( features = {"src/test/resources/"},
                glue = {"main_steps_defination"},
                plugin={"pretty", "html:target/test-report",
               "json:target/test-report.json",
		       "json:target/cucumber-report.json",
		       "junit:target/test-report.xml"},
               tags = {"@vv"},
               snippets = SnippetType.CAMELCASE)  

 public class TestNGRunnerFile extends AbstractTestNGCucumberTests {

 @Test(groups = "CucumberTest", 
	   description = "TestNGCucumberRunner to invoke Cucumber")
 public void cucumberTest() throws IOException {
   		   
		}
}
