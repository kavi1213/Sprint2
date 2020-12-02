package runner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features/Ebay06HelpAndContact.feature",
		glue={"StepDefinition"},
		monochrome = true,
	 // tags= {"@ItemNotRecived"},
	 //  plugin = {"html:target/Destination"} )
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		)

public class Sprint1Runner extends AbstractTestNGCucumberTests 
{
	@AfterClass
	public static void writeExtentReport() {
			
		Reporter.loadXMLConfig("config/extent-configs.xml");
	    
	}}


