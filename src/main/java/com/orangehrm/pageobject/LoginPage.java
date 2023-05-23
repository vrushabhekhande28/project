package com.orangehrm.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orabgehrm.action.Action;
import com.orabgehrm.baseclass.Baseclass;

public class LoginPage extends Baseclass
{
	//webElements 
    @FindBy (css="img[alt=\"company-branding\"]")
    WebElement  orangehrmLogo; 
    
    @FindBy (name="username")
    WebElement username;
    
    @FindBy(name="password")
    WebElement password;
    
    @FindBy(css="button[type=\"submit\"]")
    WebElement submit;
    
    @FindBy(xpath="//p[text()=\"Forgot your password? \"]")
    WebElement forgotPassword;
    
   //constructor
   public LoginPage()
   {
	PageFactory.initElements(driver, this);  
   }
    
  //methods for this page 
    public boolean validateLogo() throws Throwable
    {
    	boolean flag=Action.isDisplayed(orangehrmLogo);
    	return flag;
    }
      
    public HomePage login(String user,String pass) throws Throwable
    {
    	Action.sendKeys(username,user);
    	Action.sendKeys(password, pass);
    	Action.click(driver, submit);
    	return new HomePage();
    }
    
    public String getTiltle() throws Throwable
    {
    	String title=driver.getTitle();
    	return title;
    }
    
    public PasswordResetCodePage clickOnForgotPassword() throws Throwable
    {
    	Action.click(driver, forgotPassword);
    	return new PasswordResetCodePage();
    }
    
   
    
}
