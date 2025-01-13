package activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	
private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void test() {
		
		assertEquals(driver.getTitle(), "Training Support");
		driver.findElement(By.linkText("About Us")).click();
		assertEquals(driver.getTitle(), "About Training Support");
		
	}

}
