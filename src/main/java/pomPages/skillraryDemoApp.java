   package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryDemoApp {

	//Declaration
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	
	private WebElement seleniumTraining;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	
	
	

	public skillraryDemoApp(WebDriver driver) {
    
	PageFactory.initElements(driver, this);
	}

	public WebElement getCourseTab() {
		return courseTab;
	}
	
	public void seleniumTrainingTab() {
		seleniumTraining.click();
	}

	public WebElement getCoursedd() {
		return coursedd;
	}
	
	}

	
	
