package com.orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orabgehrm.baseclass.Baseclass;
import com.orangehrm.dataprovider.DataProvide;
import com.orangehrm.pageobject.HomePage;
import com.orangehrm.pageobject.LoginPage;
import com.orangehrm.pageobject.PasswordResetCodePage;

public class LoginPageTest extends Baseclass
{
  HomePage homepage;
  //DataProvide data=new DataProvide();   
  @Test(priority=1)
  public void validateLog() throws Throwable
  {
	login=new LoginPage();
	boolean b=login.validateLogo();
	System.out.println("Logo is displayed : "+b);
	Assert.assertTrue(b);
  }
  
  @Test(priority=2)
  public void validateTitle() throws Throwable
  {
	  String actual=login.getTiltle();
	  String expected="OrangeHRM";
	  Assert.assertEquals(actual, expected);
  }
  
@Test(priority=3,dataProvider="data")
  public void loginTo(String user,String pass) throws Throwable
  {
	 homepage= login.login(user,pass);
	 Thread.sleep(1000);
	 String expectedUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	 String actualUrl=driver.getCurrentUrl();
	 System.out.println("actualUrl :"+ actualUrl);
	 Assert.assertEquals(actualUrl, expectedUrl);
  }

}
