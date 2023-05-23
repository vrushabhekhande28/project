package com.orangehrm.testcases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.orabgehrm.baseclass.Baseclass;
import com.orangehrm.pageobject.HomePage;
import com.orangehrm.pageobject.MyInfoPage;

public class MyInfoPageTest extends Baseclass
{
	HomePage homepage;
	MyInfoPage myInfo ;
	
	@Test
   public void updateMyInfo() throws Throwable
   {
	 homepage=login.login("Admin","admin123");
	 myInfo = homepage.clickOnMyInfoPage();
	 Thread.sleep(2000);
	myInfo.enterEmployeeFullName("vrushabh", "vrushabh", "vrushabh");
	 myInfo.Save();
	 homepage.clickOnAdminTab();
	String s=myInfo.getUpdateName();
	System.out.println(s);
	    Assert.assertEquals(s, "vrushabh vrushabh vrushabh");
   }
   
}
