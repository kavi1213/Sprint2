package StepDefinition;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import PageObjects.Buy;
import PageObjects.CovidSupportPage;
import PageObjects.CustomerService;
import PageObjects.HackedAccount;
import PageObjects.HomePage;
import PageObjects.ItemNotRecived;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitions {
	WebDriver driver;
	HomePage hp;
	CustomerService cs;
	Buy bp;
	ItemNotRecived inr;
	CovidSupportPage csp;
	HackedAccount ha;
	static int count;
	@Before
	public void  setup()
	{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Testing....");
	}
	
	@After(order = 1)
	public void attachScreenshots(Scenario scenario) throws IOException
	{
		count++;
		File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(System.getProperty("user.dir")+"/target/screenshots/"+scenario.getName()+"_"+count+".png");
		Files.copy(sourcePath, destinationPath);
		Reporter.addScreenCaptureFromPath(destinationPath.toString());
	}
	@After(order=0)
	public void TearDown() {
		driver.close();
		System.out.println("Completed....");
	}
	
	
	@Given("^User is in Homepage$")
    public void user_is_in_homepage() throws Throwable
	{
   		hp = new HomePage(driver);
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		String s1 = driver.getTitle();
    	String s2 = "Electronics, Cars, Fashion, Collectibles & More | eBay";
    	Assert.assertTrue(s1.equals(s2));
    	System.out.println(s1);
    }
	

    @When("^User click Help and Contact option$")
    public void user_click_help_and_contact_option() throws Throwable {
        hp.getHelpAndContact().click();
        Thread.sleep(2000);
        String s3 = driver.getTitle();
    	String s4 = "eBay Customer Service";
    	Assert.assertTrue(s3.equals(s4));
    	 System.out.println(s3);
    }

 
    @Then("^User Clicks Buy As Guest Option$")
    public void user_clicks_buy_as_guest_option() throws Throwable {
       bp = new Buy(driver);
       Thread.sleep(5000);
       bp.getBuyOption().click();
       String s5 = driver.getTitle();
       String s6 = "Buying as a guest | eBay";
       Assert.assertTrue(s5.equals(s6));
       System.out.println(s5);
   }

    
    @Then("^User clicks Get  Help if item has not Arrived Option$")
    public void user_clicks_get_help_if_item_has_not_arrived_option() throws Throwable {
        inr = new ItemNotRecived(driver);
        Thread.sleep(5000);
        inr.getItemNR().click();
        
        String s7 = driver.getTitle();
        String s8 = "Get help with an item that hasn't arrived | eBay";
        Assert.assertTrue(s7.equals(s8));
        System.out.println(s7);
    }

    
    @Then("^User clicks Additional Support During Covid Page (.+)$")
    public void user_clicks_additional_support_during_covid_page(String name) throws Throwable {
        csp = new CovidSupportPage(driver); 
        csp.getName().sendKeys(name);
        Thread.sleep(5000);
        csp.getCovidSupport().click();
        Thread.sleep(5000);
        String s9 = driver.getTitle();
        String s10 = "Additional support during COVID-19 for buyers and sellers | eBay";
        Assert.assertTrue(s9.equals(s10));
        System.out.println(s9);
    }   
        
   

    @Then("^User clicks Help For Hacked Account Page$")
    public void user_clicks_help_for_hacked_account_page() throws Throwable {
        ha = new HackedAccount(driver);
        Thread.sleep(5000);
        ha.getHackedAccount().click();		
        String s11 = driver.getTitle();
        String s12 = "Get help with a hacked account | eBay";
        Assert.assertTrue(s11.equals(s12));
        Thread.sleep(2000);
        System.out.println(s11);
    }

}