package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TestingPage {

	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	
	
	private WebElement seleniumtesting;
	
	@FindBy(id="cartArea")
	private WebElement areaacart;
     
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbicon;
	
	public TestingPage(WebDriver driver) {
	    
		PageFactory.initElements(driver, this);
		}

	

	public WebElement getSeleniumtesting() {
		return seleniumtesting;
	}



	

	public WebElement getAreaacart() {
		return areaacart;
	}



	public WebElement getFbicon() {
		return fbicon;
	}
	 public void Facebookicon() {
		 fbicon.click();
		 
	 }
	
}
