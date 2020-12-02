package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ItemNotRecived {
	    
	    WebDriver driver;
	    
	    public ItemNotRecived(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }

	 

	    @FindBy(xpath="//title")
	    WebElement title;
	    
	    @FindBy(css = "a[id='popular_solution_3']")
	    WebElement notRecived;
	    
	    public WebElement getTitle() {
	        return title;
	    }
	    public WebElement getItemNR() {
	        return notRecived;
	    }
	}
