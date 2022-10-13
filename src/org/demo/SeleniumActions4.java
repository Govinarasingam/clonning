package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions4 {
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumDay5\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions a = new Actions(driver);
		a.moveToElement(sports).perform();
		Thread.sleep(5000);
		WebElement wtgainer = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		wtgainer.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
