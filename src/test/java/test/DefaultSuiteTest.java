package test;
//Generated by Selenium IDE

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
public class DefaultSuiteTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;

public void setUp() {
 driver = new FirefoxDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}

public void tearDown() {
 driver.quit();
}

public void firstIDE() {
 driver.get("https://petstore.octoperf.com/");
 driver.manage().window().setSize(new Dimension(1295, 687));
 driver.findElement(By.linkText("Enter the Store")).click();
 try {
   Thread.sleep(5000);
 } catch (InterruptedException e) {
   e.printStackTrace();
 }
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
}
}
