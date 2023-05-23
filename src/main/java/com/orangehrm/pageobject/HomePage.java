package com.orangehrm.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orabgehrm.action.Action;
import com.orabgehrm.baseclass.Baseclass;

public class HomePage extends Baseclass
{
   @FindBy (xpath="//span[text()='Admin']")
   WebElement admin1;
  
   @FindBy (xpath="//span[text()='PIM']")
   WebElement pim;
   
   @FindBy(xpath="//span[text()=\"My Info\"]")
   WebElement myInfo;
 
   //constructor
   public HomePage()
   {
	  PageFactory.initElements(driver, this);
   }
   
   //Methods
   public SystemUserPage clickOnAdminTab()
   {
	   admin1.click();
	   return new SystemUserPage();
   } 
   
   public ViewEmployeeList clickOnPIM() throws Throwable
   {
	   Action.click(driver, pim);
	   return new ViewEmployeeList();
   }
   
   public MyInfoPage clickOnMyInfoPage()
   {
	   myInfo.click();
	   return new MyInfoPage();
   } 
   
  
   
}
