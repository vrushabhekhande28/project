package com.orangehrm.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orabgehrm.action.Action;
import com.orabgehrm.baseclass.Baseclass;

public class MyInfoPage extends Baseclass
{
   @FindBy(name="firstName")
   WebElement firstName;
   
   @FindBy(name="middleName")
   WebElement middleName;
   
   @FindBy(name="lastName")
   WebElement lastName;
   
   @FindBy(xpath="(//button[text()=\" Save \"])[2]")
   WebElement saveButton;
   
   @FindBy(xpath="//p[@class=\"oxd-userdropdown-name\"]")
   WebElement Myname;
   
   public MyInfoPage()
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void enterName()
   {
	   firstName.clear();
	   firstName.sendKeys("ddd");
   }
   
  
   public void enterEmployeeFullName(String nam,String middleNam,String lastNam) throws Throwable
   {   
	
	   Thread.sleep(1000);
	   Action.sendKeys(firstName, nam);
	   Thread.sleep(1000);
	   middleName.clear();
	   Thread.sleep(1000);
	   Action.sendKeys(middleName, middleNam);
	   Thread.sleep(1000);	   
	   lastName.clear();
	   Thread.sleep(1000);
	   Action.sendKeys(lastName, lastNam);
	
   }
   
   public void Save() throws Throwable
   {
	   Action.click(driver, saveButton);
   }
   public String getUpdateName()
   {
	  String name= Myname.getText();
	  return name;
   }
   
}
