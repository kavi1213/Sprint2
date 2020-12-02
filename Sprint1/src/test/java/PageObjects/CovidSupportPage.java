package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CovidSupportPage {
	    
	    WebDriver driver;
	    
	    public CovidSupportPage(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }

	 

	    @FindBy(xpath="//title")
	    WebElement title;
	    
	    //Search Bar Is Identified And Clicked
	    
	    @FindBy(id="search_input_element")
	    WebElement name;
	    
	    //Clicking on Covid-19 Additional Support
	    
	    @FindBy(xpath="//span[text()=\"Additional support during COVID-19 for buyers and sellers on eBay\"]")
	    WebElement Covid;
	    
	    public WebElement getTitle() {
	        return title;
	     }
	    public WebElement getName() {
	        return name;
	    }
	    public WebElement getCovidSupport() {
	        return Covid;
	    }
         
}

	

