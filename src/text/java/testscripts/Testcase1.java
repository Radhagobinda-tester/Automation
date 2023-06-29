package testscripts;

   import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryLoginPage;
import pomPages.skillraryDemoApp;

    public class Testcase1 extends BaseClass {
          
	@Test
	
	public void tc1() {
	
	SkillraryLoginPage s = new SkillraryLoginPage(driver);
	s.gearsButton();
	s.skillrarydemoapp();
	skillraryDemoApp d= new skillraryDemoApp(driver);
	driverutilies.SwitchingTabs(driver);
	driverutilies.mouseHover(driver,d.getCourseTab());
	d.seleniumTrainingTab();
	
	AddtocartPage ad = new AddtocartPage(driver);
	driverutilies.doubleClick(driver, ad.getAdd());
	ad.addtocartbutton();
	driverutilies.alertPopup(driver);
	// execute all test case and generate report
	
		Reporter.log(driver.getTitle(),true);
	
	}
	
}
