package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/nguoidung",
        glue = "stepDefinations",
        monochrome=true,
        dryRun = false,
        plugin= {"pretty",
                "html:target/site/cucumber-report-default",
                "json:target/site/cucumber.json"},
        snippets = SnippetType.CAMELCASE,
        tags = {"@Create-User, @Execute-With-New-User"})
public class DemoTestRunner {
    
}
