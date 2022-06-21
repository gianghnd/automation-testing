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
        tags = {"@Tao_Nguoi_Dung"})
public class DemoTestRunner {
    
}
