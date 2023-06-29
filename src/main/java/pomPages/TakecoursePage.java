package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TakecoursePage {
	
	
	@FindBy(xpath="//div[@class='PlayButton_module_playButtonWrapper__c50ea884']")
	
	private WebElement playbtn;
	
	@FindBy(xpath="//button[@class='Button_module_button__f5fb72bd shared_module_focusable__63d26f6d Button_module_customColor__f5fb72bd Button_module_md__f5fb72bd Button_module_icon__f5fb72bd Tooltip_module_tooltipContainer__21ae5b80 exclude-global-button-styles PlayButton_module_playButton__c50ea884 shared_module_focusable__63d26f6d']")
	
	private WebElement pausebtn;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[1]")
	
	private WebElement facebookbtn;
	
	public TakecoursePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void playButton() {
	
		
	playbtn.click();
	}

	public void pauseButton() {
		
		
		pausebtn.click();
		}
	
	public void facebookbutton() {
		
		facebookbtn.click();	
	}
}
