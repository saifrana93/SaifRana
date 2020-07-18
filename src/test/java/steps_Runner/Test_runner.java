package steps_Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

 @RunWith(Cucumber.class)
 @CucumberOptions(features = { "src/test/resources/" }, 
               glue = { "steps_Main" },
               plugin = { "pretty","html:cucumber-report" },
               tags = { "@nr" }, 
               snippets = SnippetType.CAMELCASE)

 public class Test_runner {

}
