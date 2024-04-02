package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
		features="Features",
		glue="stepdefinitions",
		tags="@sanitytest")
//plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
//plugin={"html:target/cucumber.html"})
//plugin={"pretty","json:target/cucumberReports.json"})
//plugin={"pretty","junit:target/cucumberReports.xml"}

public class runnerSample extends AbstractTestNGCucumberTests{

}
