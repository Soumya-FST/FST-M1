package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		 // Open the page
        driver.get("https://training-support.net/webelements/mouse-events");
        
        System.out.println("Page title:"+ driver.getTitle());
        
     // Create the Actions object
        Actions builder = new Actions(driver);
        
        
        WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
        
        builder.click(cargoLock).pause(1000).moveToElement(cargoToml).pause(2000)
        	.click(cargoToml).build().perform();
        
        String message = driver.findElement(By.id("result")).getText();
        System.out.println(message);
        
        //task 2
        builder.doubleClick(srcButton).pause(2000).pause(2000)
        	.contextClick(targetButton).pause(2000).build().perform();
        
        builder.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]")))
        	.pause(2000).build().perform();
        
        message = driver.findElement(By.id("result")).getText();
        System.out.println(message);
        
        driver.quit();


	}

}
