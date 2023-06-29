package testscripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;
import pomPages.skillraryDemoApp;

public class Testcase2 extends BaseClass  {
	
	@Test
	
	public void tc2() throws IOException, InterruptedException  {
		
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapp();
		
		skillraryDemoApp d = new skillraryDemoApp(driver);
	     driverutilies.SwitchingTabs(driver);
	   
	     driverutilies.dropDown(d.getCoursedd(), pdata.getPropertyFileData("coursedd"));
	

	     TestingPage t = new TestingPage(driver);
	     Thread.sleep(10000);
	     driverutilies.dragdrop(driver,t.getSeleniumtesting(),t.getAreaacart());
	     Thread.sleep(10000);
	     WebElement facebook = t.getFbicon();
	     Point loc = facebook.getLocation();
	     int x = loc.getX();
	     int y = loc.getY();
	     
	     driverutilies.scrollBar(driver, x, y);
	    t.Facebookicon();
	     Assert.assertEquals(driver.getTitle(), pdata.getPropertyFileData("fbtitle"));
	     
	     
	     }

}
