import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice
{
	  WebDriver driver;
	  ChromeOptions option=new ChromeOptions();
   @BeforeTest
   public void launch()
   {
	    option.addArguments("---remote-allow-origins=*");
	    driver=new ChromeDriver(option);
	    driver.get("https://letcode.in/test"); 
	    
	    WebElement we=driver.findElement(By.id(""));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(23));
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(we)); 
	    driver.manage().deleteAllCookies();
    
   }
   
   @Test
   public void process() throws IOException
   {
	LocalDateTime currentTime= LocalDateTime.now();
    String d=currentTime.toString();
    d=d.replace(':', '-');
	TakesScreenshot tks=(TakesScreenshot)driver;
	File temp=  tks.getScreenshotAs(OutputType.FILE);
	File file=new File("./errorShot/images+"+d+".pdf");
	FileUtils.copyFile(temp, file);
   }
   
   @Test
   public void test1()
   {
	    Dimension size=driver.manage().window().getSize();
	    int height=size.getHeight();
	    int width=size.getWidth();
	    
	    driver.manage().window().setSize(size);
	   
	    Point p=driver.manage().window().getPosition();
	    int x=p.getX();
	    int y=p.getY();
	    
	    Point p1=new Point(12,23);
	    driver.manage().window().setPosition(p1);
	    
   }
   
   @Test
   public void d()
   {
	   
   }
   
}
