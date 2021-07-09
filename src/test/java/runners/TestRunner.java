package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-report/report.html",
                "json:target/cucumber-report/report.json",
                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
        features = "classpath:features",
        glue = {"steps"},
        tags = {"@PhpTravels_001"},
        snippets = SnippetType.CAMELCASE,
        strict = false,
        monochrome = true,
        dryRun = false)

public class TestRunner {
	
}
