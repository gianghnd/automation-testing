package cucumberOption;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/nguoidung/Execute-With-New-User.feature",
        glue = "stepDefinations",
        monochrome=true,
        dryRun = false,
        plugin= {"pretty",
                "html:target/site/cucumber-report-default",
                "json:target/site/cucumber.json"},
        snippets = SnippetType.CAMELCASE,
        tags = {"@Execute-With-New-User"})
public class DemoTestRunner02 {
    
}
