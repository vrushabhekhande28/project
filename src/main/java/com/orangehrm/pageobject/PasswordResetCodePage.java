package com.orangehrm.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orabgehrm.action.Action;
import com.orabgehrm.baseclass.Baseclass;

public class PasswordResetCodePage  extends Baseclass
{
    @FindBy (name="username")
    WebElement username;
    
    @FindBy(xpath="//h6[text()='Reset Password']")
    WebElement resetpasswordText;
    
    public PasswordResetCodePage()
    {
      PageFactory.initElements(driver, this);	
    }
    
    public String getTitle() throws Throwable
    {
    	String title=driver.getTitle();
    	return title;
    }
    
    public boolean resetpasswordText() throws Throwable
    {
    	boolean flag=false;
    	flag=Action.isDisplayed(resetpasswordText);
    	return flag;
    }
   
}
