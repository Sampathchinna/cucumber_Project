//package Runner;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.AfterClass;
//import org.junit.jupiter.api.parallel.Execution;
//import org.junit.jupiter.api.parallel.ExecutionMode;
//import org.junit.runner.RunWith;
//
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/features",  // Path to the login feature file
//
//        glue = "org.example.Stepdefs",  // Step definitions package
//        plugin = {"pretty", "html:target/cucumber-reports"}
//)
//@Execution(ExecutionMode.CONCURRENT)  // JUnit 5 Parallel execution annotation
//        public class Runnerclass {
//}
//
package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // update to your real folder
        glue = {"org.example.Stepdefs"},           // update to your actual step defs package
        plugin = {"html:target/cucumber-html-report","json:target/cucumber.json"},
        publish=true
)

public class RunnerClass {
}
