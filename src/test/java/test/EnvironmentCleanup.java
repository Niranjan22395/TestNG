package test;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class EnvironmentCleanup {
	
	public static void main(String[] args) {
		
	
	

  JavascriptExecutor js;
 
 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\05457U744\\Downloads\\Training\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
    driver.get("http://142.182.0.19:7819/RTCP/");
    driver.manage().window().maximize();
    driver.findElement(By.className("gwt-TextBox")).sendKeys("niranjan.kumar");
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("niranjan");
    driver.findElement(By.cssSelector(".GLJLMW5BFM")).click();
    driver.findElement(By.cssSelector(".GLJLMW5BM0:nth-child(1) .gwt-Image")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".environment-picker-button"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".ng-tns-c8-12:nth-child(2) > .ng-star-inserted"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".cdk-focused")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".cdk-focused"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".mat-dialog-actions > .mat-button:nth-child(1) > .mat-button-wrapper"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".cdk-focused > .mat-button-wrapper")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".mat-button:nth-child(2) > .mat-button-wrapper"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".ng-tns-c8-12 > .ng-trigger"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".ng-tns-c8-12 > .ng-trigger"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".ng-tns-c8-12:nth-child(2) > .ng-tns-c8-12"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".icon-stop-all")).click();
    driver.findElement(By.cssSelector(".cdk-focused")).click();
    driver.findElement(By.linkText("Administration")).click();
    driver.findElement(By.cssSelector(".gwt-TabLayoutPanelTab:nth-child(5)")).click();
    driver.findElement(By.cssSelector(".GLJLMW5BM1 .GLJLMW5BKB:nth-child(3)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".GLJLMW5BMQ .GLJLMW5BMI"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".GLJLMW5BMQ .GLJLMW5BMI"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".GLJLMW5BMQ .GLJLMW5BMI"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".GLJLMW5BMQ .GLJLMW5BMI"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".GLJLMW5BMQ .GLJLMW5BMI"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".GLJLMW5BMQ .GLJLMW5BMI"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector("div:nth-child(4) > .GLJLMW5BM1")).click();
    driver.findElement(By.cssSelector("div:nth-child(4) > .GLJLMW5BM1")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(4) > .GLJLMW5BM1"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".GLJLMW5BMP:nth-child(2)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".GLJLMW5BMQ .GLJLMW5BMI"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".GLJLMW5BMQ .GLJLMW5BMI"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".GLJLMW5BMQ .GLJLMW5BMI"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.cssSelector(".GLJLMW5BMP .gwt-Image")).click();
    driver.findElement(By.cssSelector(".GLJLMW5BFJ > .gwt-Button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".GLJLMW5BM1 .GLJLMW5BMB")).click();
    driver.findElement(By.cssSelector(".GLJLMW5BMP .gwt-Image")).click();
    driver.findElement(By.cssSelector(".GLJLMW5BFJ > .gwt-Button:nth-child(2)")).click();
  }
}
