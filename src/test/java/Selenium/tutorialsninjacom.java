package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.*;
public class tutorialsninjacom {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\05457U744\\Downloads\\Training\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://tutorialsninja.com/demo/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("iPhone");
		 driver.findElement(By.cssSelector(".fa-search")).click();
		 String IphoneName = driver.findElement(By.linkText("iPhone")).getText();
		 System.out.println(IphoneName);
		 if(IphoneName.equalsIgnoreCase("iPhone")   ) {
			 System.out.println("it's true");
		 }
		 else {
			 System.out.println("Value is not true");
		 }
		 String Price =	 driver.findElement(By.xpath("(//div[@class='caption']//p)[2]")).getText();
		 System.out.println(Price);
		 if(Price.equalsIgnoreCase("$123.20")   ) {
			 System.out.println("it's true");
		 }
		 else {
			 System.out.println("Value is not true");
		 }
		 driver.findElement(By.linkText("iPhone")).click();
		 driver.findElement(By.name("quantity")).clear();
		 driver.findElement(By.name("quantity")).sendKeys("2");
		 driver.findElement(By.id("button-cart")).click();
		 driver.findElement(By.id("cart-total")).click();
		 driver.switchTo().frame(1);
		 driver.findElement(By.linkText("View Cart")).click();
	}
	
}
