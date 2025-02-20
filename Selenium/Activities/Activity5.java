package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new FirefoxDriver();
		 
		 // Open the page
	        driver.get("https://training-support.net/webelements/dynamic-controls");
	        
	        System.out.println("Page title:"+ driver.getTitle());
	        
	        WebElement checkbox = driver.findElement(By.id("checkbox"));
	        
	        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
	        
	        //remove
	        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
	        
	        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
	        
	        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
	        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
	        
	        driver.close();
	        

	}

}
