package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new FirefoxDriver();
		 // Open the page
        driver.get("https://training-support.net/webelements/dynamic-controls");
        
        System.out.println("Page title:"+ driver.getTitle());
        
        WebElement textbox = driver.findElement(By.id("textInput"));
        
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        driver.findElement(By.id("textInputButton")).click();
        
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        
        textbox.sendKeys("Soumya");
        System.out.println(textbox.getDomProperty("value"));
        
        driver.quit();
        

	}

}
