package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Buy {
	    
	    WebDriver driver;
	    
	    public Buy(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }

	 

	    @FindBy(xpath="//title")
	    WebElement title;
	    
	    //Buying As Guest Option clicking is Initiated
	    
	    @FindBy(xpath="//span[text()='Buying as a guest ']")
	    WebElement Buybtn;
	    
	    public WebElement getTitle()
	    {
	        return title;
	    }
	    public WebElement getBuyOption()
	    {
	        return Buybtn;	
	    }    
	    }




