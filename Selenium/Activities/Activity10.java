package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  WebDriver driver = new FirefoxDriver();
		 // Open the page
      driver.get("https://training-support.net/webelements/drag-drop");
      
      System.out.println("Page title:"+ driver.getTitle());
      
      Actions builder = new Actions(driver);
      
   // Find the football
      WebElement football = driver.findElement(By.id("ball"));
      // Find the dropzone1
      WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
      // Find the dropzone2
      WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
      
      builder.clickAndHold(football).moveToElement(dropzone1).pause(2000)
      	.release().build().perform();
      
      if(dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
      	System.out.println("Ball was dropped in Dropzone 1");
      }
      
      builder.dragAndDrop(football, dropzone2).pause(2000).build().perform();
      
      if(dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
      	System.out.println("Ball was dropped in Dropzone 2");
      }
      
      driver.quit();

	}

}