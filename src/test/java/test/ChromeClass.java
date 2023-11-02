package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeClass {

	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\05457U744\\Downloads\\Training\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	String url = "https://petstore.octoperf.com/";
	driver.get(url);
	//driver.get("https://petstore.octoperf.com/");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Enter the Store")).click();
    driver.findElement(By.linkText("Sign In")).click();
    driver.findElement(By.name("username")).sendKeys("j2ee");
    driver.findElement(By.cssSelector("#Catalog > form")).click();
    driver.findElement(By.name("signon")).click();
    driver.findElement(By.cssSelector("a:nth-child(3) > img")).click();
    driver.findElement(By.linkText("K9-RT-02")).click();
    driver.findElement(By.cssSelector("tr:nth-child(4) .Button")).click();
    driver.findElement(By.linkText("Proceed to Checkout")).click();
    driver.findElement(By.name("newOrder")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("html"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("html"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("html"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("html"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).clickAndHold().perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("html"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("html"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).release().perform();
    }
    driver.findElement(By.linkText("Sign Out")).click();
    driver.close();
  
}
}
