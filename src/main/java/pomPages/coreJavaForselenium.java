package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coreJavaForselenium {
	
  @FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
  
  public WebElement coreJava;
  
  public coreJavaForselenium(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  
public void corejavaSelenium() {
	
	coreJava.click();
	
	
}

}
