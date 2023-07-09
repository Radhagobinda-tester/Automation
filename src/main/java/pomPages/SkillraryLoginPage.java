package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	//Declaration
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearBtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoApp;
	
	@FindBy(name="q")
	private WebElement Searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement Searchbtn;
	

	//Intialization
	
	public SkillraryLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void gearsButton() {
		
		gearBtn.click();
	}
   
	   
	
   
   public void skillrarydemoapp() {
	   demoApp.click();  
	   
	} 
   
   public void SearchTextbox(String name) {
	   Searchtb.sendKeys(name);  
	   
	}
   
   public void SearchButton() {
	   Searchbtn.click();  
	   
	}
}
