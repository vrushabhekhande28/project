package com.orabgehrm.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.orabgehrm.action.Action;
import com.orabgehrm.utility.NewExcelLibrary;
import com.orangehrm.dataprovider.DataProvide;
import com.orangehrm.pageobject.LoginPage;

public class Baseclass 
{
	public static WebDriver driver;
	public LoginPage login;
    ChromeOptions options;
	//to read data from properties file
	public Properties prop;
	DataProvide data;
	
   @BeforeMethod
   public void setUp() throws Throwable
   {
		readConfig();
	   
	    options=new ChromeOptions();
	    options= options.addArguments("--remote-allow-origins=*");
	    String browser=prop.getProperty("browser");
	    System.out.println(browser);
	     if(browser.equalsIgnoreCase("Chrome"))
	     {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipse-workspace\\Orage_HRM2\\chromedriver.exe");
	       driver=new ChromeDriver(options);
	     }
	     else if(browser.equalsIgnoreCase("IE"))
	     {
	    	 
	     }
	     else if(browser.equalsIgnoreCase("IE"))
	     {
	    	 
	     }
	     data=new DataProvide();
	     driver.manage().window().maximize();
	     driver.get(prop.getProperty("url"));  
	      Action.implicitlywait(driver, 30);
	      Action.pageLoadTimeout(driver, 30);
	     login=new LoginPage();
   }
   
// @AfterMethod
   public void tearDown()
   {
	   driver.close(); 
   }
   
   //to read data from properties file
   public void readConfig()
   {
	   try {
		   prop=new Properties();
		   FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/configration/config.properties");
		   prop.load(file);
	       } 
	   catch (FileNotFoundException e) 
	      {
		   e.printStackTrace();
	      }
	   catch (IOException e) 
	     {
		  e.printStackTrace();
	     }
   }
   

	
}
