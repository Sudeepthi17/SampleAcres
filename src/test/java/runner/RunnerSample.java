package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
		features="Features",
		glue="stepdefinitions",
		tags="@sanitytest")

public class RunnerSample extends AbstractTestNGCucumberTests{

}
