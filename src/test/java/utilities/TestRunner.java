package utilities;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "AplloFeatures",
		glue={"com.Sprintfinal"},
		tags = "@Functionality ",
		monochrome = true,
		plugin = {"pretty","junit:target/cucumber reports/SprintReport.xml"}
		)
public class TestRunner {

}
