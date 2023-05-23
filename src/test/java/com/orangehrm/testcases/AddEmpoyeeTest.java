package com.orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orabgehrm.baseclass.Baseclass;
import com.orangehrm.pageobject.AddEmployee;
import com.orangehrm.pageobject.HomePage;
import com.orangehrm.pageobject.ViewEmployeeList;

public class AddEmpoyeeTest extends Baseclass
{
	HomePage homepage;
	ViewEmployeeList addemployee;
	AddEmployee addemp;
	
	@Test 
    public void addEmployee() throws Throwable
    {
      homepage =login.login("Admin","admin123");
      addemployee = homepage.clickOnPIM();
      addemp = addemployee.clickOnAddEmployee();
      addemp.enterFirstName("A");
      addemp.enterMiddleName("A");
      addemp.enterLastName("A");
      addemp.clickOncreateLoginDetails();
      boolean flag= addemp.isEnabledEnterConfirmPassword(); 
      //Assert.assertTrue(flag);
      addemp.enterUsername("Abcde");
      addemp.enterPassword("Admin@123");
      addemp.enterConfirmPassword("Admin@123");
      addemp.clickOnSubmit();
      String expected="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
      String actual=driver.getCurrentUrl();
      Assert.assertEquals(actual, expected);

    }
}
