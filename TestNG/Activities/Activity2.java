package activities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test
    public void test1() {
		
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        assertEquals(title, "Selenium: Target Practice");
    }
	
	@Test
    public void test2() {
		
        WebElement blackButton = driver.findElement(By.id("blackButton"));
        assertTrue(blackButton.isDisplayed());
        assertEquals(blackButton.getText(), "Black");
    }
	
	
	@Test(enabled=false)
    public void test3() {
		
		System.out.println("This method is not enabled");
	}
	
	@Test
    public void test4() {
		
		throw new SkipException("Skipping test case");
	}
	
	

}
