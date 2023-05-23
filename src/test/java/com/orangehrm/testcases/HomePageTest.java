package com.orangehrm.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orabgehrm.baseclass.Baseclass;
import com.orangehrm.pageobject.HomePage;

public class HomePageTest extends  Baseclass
{
	HomePage homePage;
	@Test(priority=1)
    public void clickOnAdmin() throws Throwable
    {
		homePage=login.login("Admin","admin123");
    	homePage.clickOnAdminTab();
    	Thread.sleep(4000);
    	String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
    	String actualUrl=driver.getCurrentUrl();
    	Assert.assertEquals(actualUrl,expectedUrl);
    }
}
