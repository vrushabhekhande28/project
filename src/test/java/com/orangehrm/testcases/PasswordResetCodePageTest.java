package com.orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.orabgehrm.baseclass.Baseclass;
import com.orangehrm.pageobject.PasswordResetCodePage;

public class PasswordResetCodePageTest  extends Baseclass
{
	PasswordResetCodePage forgotPassword;
     
	  @Test(priority=1)
	  public void validateForgotPassword() throws Throwable
	  {
		forgotPassword = login.clickOnForgotPassword();
		boolean flag=forgotPassword.resetpasswordText();
		Assert.assertTrue(flag);
	  }
}
