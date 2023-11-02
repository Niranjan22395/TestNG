package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPage {
	WebDriver driver;
	
	@Before
	public void StartBrowser() {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\05457U744\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		
	}
	
	
	@Given("User in home Page")
	public void UserinhomePage() {
		
		System.out.println("Given");
	}
	
	@When("User enter {string} in search field")
	public void Userenterinsearchfield(String product) {
		driver.findElement(By.name("search")).sendKeys(product);
		System.out.println("When");
	}
	
	@And("User click on search button")
	public void Userclickonsearchbutton() {
		driver.findElement(By.xpath("//div[@id='search']//bu")).click();
		System.out.println("Then");
	}
	
	@Then("Product {string} should display")
	public void Productshoulddisplay(String Product) {
		assertTrue(driver.findElement(By.xpath("//a[text()='iPhone']")).isDisplayed());
		System.out.println("Then");
		
	}
	@After
	public void closebrowser() {
		System.out.println("close");
		driver.quit();
	}
}
