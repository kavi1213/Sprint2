package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerService {
	 WebDriver driver;
	    
	    public CustomerService(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }

	 

	    @FindBy(xpath="//title")
	    WebElement title;
	    
	    public WebElement getTitle() {
	        return title;
	    }
	

}
