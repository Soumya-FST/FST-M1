package activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	
private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void loginTest() {
		
		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		userName.sendKeys("admin");
		password.sendKeys("password");
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
		
		assertEquals("Welcome Back, Admin!", message);
		
		
	}
	
	

}
