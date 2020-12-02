package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HackedAccount {
	    
	    WebDriver driver;
	    
	    public HackedAccount(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }

	 

	    @FindBy(xpath="//title")
	    WebElement title;
	    
	    //Clicking Hacked Account Using The Xpath
	    
	    @FindBy(xpath="//span[text()=\"Get help with a hacked account\"]")
	    WebElement AcHack;
	    
	    public WebElement getTitle() {
	        return title;
	    }
	    
	    public WebElement getHackedAccount() {
	        return AcHack;
	    }
	}



