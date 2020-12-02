package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	    
	    WebDriver driver;
	    
	    public HomePage(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }

	     @FindBy(xpath="//title")
	    WebElement title;
	 
	     //Clicking Help and Contact Using Xpath
	     
	     @FindBy(linkText=("Help & Contact"))
	    WebElement Help;
	    
	    public WebElement getTitle() {
	        return title;
	    }
	    public WebElement getHelpAndContact() {
	        return Help;
	    }
	}

