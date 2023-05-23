package com.orabgehrm.action;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.orabgehrm.baseclass.Baseclass;


public class Action extends Baseclass
{
	public static void click(WebDriver driverl , WebElement ele) throws Throwable
	{
		Actions action=new Actions(driverl);
		action.click(ele).perform();
	}
	
	public static void implicitlywait(WebDriver driverl , int seconds)  throws Throwable
	{
		driverl.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public static void ScrollUpToWbElementIsNotVisible(WebDriver driverl , WebElement ele)  throws Throwable
	{
		JavascriptExecutor jse=(JavascriptExecutor)driverl;
		jse.executeAsyncScript("arguments[0].scrollIntoView();",ele);
	}
	
	public static void pageLoadTimeout(WebDriver driverl , int seconds)  throws Throwable
	{
		driverl.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(seconds));
	}
	
	public static boolean isDisplayed( WebElement ele)  throws Throwable
	{
		boolean flag=false;
		  try
		  {
			 ele.isDisplayed();  
			 flag= true;
		  }
		  catch(Exception ae)
		  {
			  flag=false;
		  }
		  finally
		  {
			  if(flag)
			  {
				  System.out.println("WebElement is  displayed");
			  }
			  else
			  {
				  System.out.println("WebElement is not   displayed");
			  }
		  }
		  return flag;
	}
	
	
	public static boolean isEnabled( WebElement ele)  throws Throwable
	{
		boolean flag=false;
		  try
		  {
			 ele.isEnabled();  
			 flag= true;
			 
		  }
		  catch(Exception ae)
		  {
			  flag=false;
		  }
		  finally
		  {
			  if(flag)
			  {
				  System.out.println("WebElement is  displayed");
			  }
			  else
			  {
				  System.out.println("WebElement is not   displayed");
			  }
		  }
		  return flag;
	}
	
	public static boolean isSelected( WebElement ele) throws Throwable
	{
		boolean flag=false;
		  try
		  {
			 ele.isSelected();  
			 flag= true;
			 
		  }
		  catch(Exception ae)
		  {
			  ae.printStackTrace();
			  flag=false;
		  }
		  finally
		  {
			  if(flag)
			  {
				  System.out.println("WebElement is  displayed");
			  }
			  else
			  {
				  System.out.println("WebElement is not   displayed");
			  }
		  }
		  return flag;
	}
	
	public static boolean Jsclick(WebDriver driverl , WebElement ele) throws Throwable
	{
		boolean flag=false;
		try
		{
		JavascriptExecutor jse=(JavascriptExecutor)driverl;
		jse.executeAsyncScript("arguments[0].click();",ele);
		flag=true;
		}
		
		catch(Exception ae)
		{
			flag=false;
		}
		
		finally
		{
			 if(flag)
			  {
				  System.out.println("click is  performed");
			  }
			  else
			  {
				  return false;
			  }
		  }
		  return flag;
		}
	
	public static void sendKeys(WebElement we,String value) throws Throwable
	{
		boolean flag=false;
		try
		{
	     we.clear();
		 we.sendKeys(value);
		 flag=true;
		}
		catch(Exception ae)
		{
			flag=false;
		}
		finally
		{
			if(flag)
			{
				 System.out.println("SendKeys sucessfully");
			}
			else
			{
				 System.out.println("SendKeys unsucessfully");
			}
		}
	}	
	
	
	

	
}
