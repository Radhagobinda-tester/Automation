package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.TakecoursePage;
import pomPages.coreJavaForselenium;

   public class Testcase3 extends BaseClass {
	
	@Test
	
	public void tc3() throws IOException, InterruptedException {
		
	SkillraryLoginPage s = new 	SkillraryLoginPage(driver);
	s.SearchTextbox(pdata.getPropertyFileData("courseName"));
	s.SearchButton();
		
	coreJavaForselenium c = new 	coreJavaForselenium(driver);
	c.corejavaSelenium();
	
	TakecoursePage t= new TakecoursePage(driver);
	//switching to video frame
	driverutilies.switchingframe(driver);
	Thread.sleep(20000);
	t.playButton();
	Thread.sleep(10000);
	t.pauseButton();

	
	//switching back to video frame
	driverutilies.switchbackFrame(driver);
	/*
	Thread.sleep(20000);

	t.facebookbutton();

	Thread.sleep(20000);

	
	Assert.assertEquals(driver.getTitle(),pdata.getPropertyFileData("twitterTitle"));
	// execute all test case and generate report
	
	Reporter.log(driver.getTitle(),true);
	*/
	}
	
	

}
