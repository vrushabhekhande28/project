package com.orangehrm.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orabgehrm.action.Action;
import com.orabgehrm.baseclass.Baseclass;

public class AddEmployee extends Baseclass
{
	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement firstName;

	@FindBy(name="middleName")
	WebElement middleName;
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(xpath="//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]")
	WebElement createLoginDetails;
	
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[3]")
	WebElement username;
	
	@FindBy(xpath="(//input[@type=\"password\"])[1]")
	WebElement password;
	
	@FindBy(xpath="(//input[@type=\"password\"])[2]")
	WebElement confirmPassword;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement submit;
	
	@FindBy(xpath="//label[text()='Enabled']")
	WebElement enabled;
	
	@FindBy(xpath="//label[text()='Disabled']")
	WebElement Disabled;
	
	@FindBy(xpath="//button[text()=\" Cancel \"]")
	WebElement Cancel;
	
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"])[2]")
	WebElement employeeId;

	public void AddEmployee()
	 {
	   PageFactory.initElements(driver, this);
	 }
	
	public void enterFirstName(String name) throws Throwable
	{
		Action.sendKeys(firstName, name);
	}
	
	public void enterMiddleName(String name) throws Throwable
	{
		Action.sendKeys(middleName, name);
	}
	
	public void enterLastName(String name) throws Throwable
	{
		Action.sendKeys(lastName, name );
	}
	
	public void clickOncreateLoginDetails() throws Throwable
	{
		Action.Jsclick(driver, createLoginDetails);
		}
	
	public void  enterUsername(String name) throws Throwable
	{
		Action.sendKeys(username,name);
	}
	
	public void  enterPassword(String passwor) throws Throwable
	{
		Action.sendKeys(password,passwor);
	}
	
	public void  enterConfirmPassword(String password) throws Throwable
	{
		Action.sendKeys(confirmPassword,password);
	}
	
	public boolean isEnabledEnterConfirmPassword() throws Throwable
	{
		boolean flag=false;
		Action.isEnabled(createLoginDetails);
		flag=true;
		return flag;
	}
	
	public boolean EnabledIsSelected() throws Throwable
	{
		boolean flag=false;
		flag=Action.isSelected(enabled);
		return flag;
	}
	
	public void  clickOnEnabled() throws Throwable
	{
		Action.click(driver, enabled);
	}
	
	public void  clickOnDisabbled()throws Throwable
	{
		Action.click(driver, Disabled);
	}
	
	public ViewEmployeeList clickOnSubmit() throws Throwable
	{
		Action.click(driver, Cancel);
		return new ViewEmployeeList();
	}
	
	public ViewEmployeeList clickOnCancel() throws Throwable
	{
		Action.click(driver, Cancel);
		return new ViewEmployeeList();
	}
	
	public void getEmployeeId()
	{
		String s=employeeId.getText();
		System.out.println(s);
	}
	
}
