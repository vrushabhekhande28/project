package com.orangehrm.pageobject;

import org.openqa.selenium.support.PageFactory;

import com.orabgehrm.baseclass.Baseclass;

public class SystemUserPage  extends Baseclass
{
   public SystemUserPage()
   {
	   PageFactory.initElements(driver, this);
   }
}
