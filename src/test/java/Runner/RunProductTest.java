package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/products.feature",
        glue = {"org.example.Stepdefs"},
        plugin = {"html:target/cucumber-html-report"},
        publish=true
)
public class RunProductTest {
}
