package co.com.starshap.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        tags = "@stories",
        glue = "co.com.starshap.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {
}
