package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumDay5\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.get(" http://www.amazon.in");
	    driver.manage().window().maximize();
	    WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(prime).perform();;
	    
	    Thread.sleep(5000);
	    
	   driver.findElement(By.id("multiasins-img-link")).click();
		
		
	}
	

}
