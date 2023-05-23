package com.orangehrm.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orabgehrm.action.Action;
import com.orabgehrm.baseclass.Baseclass;

public class ViewEmployeeList extends Baseclass
{
   @FindBy(xpath="//a[text()='Add Employee']")
   WebElement addemployee;
   
   @FindBy(xpath="//a[text()='Employee List']")
   WebElement emplyeeList;
   
   @FindBy (xpath="(//input[@placeholder=\"Type for hints...\"])[1]")
   WebElement emplyeename;
   
   
 public ViewEmployeeList()
 {
	 PageFactory.initElements(driver, this);
 }
 
 public AddEmployee clickOnAddEmployee() throws Throwable
 {
	 Action.click(driver, addemployee);
	 return new AddEmployee();
 }
 
 public void clickOnEmployeeList()
 {
	 emplyeeList.click();
 }
 
}
