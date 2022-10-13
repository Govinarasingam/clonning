package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions3 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumDay5\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement Home = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[6]"));
		Thread.sleep(5000);
	    Actions a = new Actions(driver);
	    a.moveToElement(Home).perform();
	    Thread.sleep(5000);
        WebElement bath = driver.findElement(By.xpath("//a[text()='Bath linen']"));
        bath.click();
        Thread.sleep(5000);
        WebElement tovel = driver.findElement(By.xpath("(//a[contains(text(),'SOFT')])[1]"));
        String text = tovel.getText();
        System.out.println(text);
        
	}

}
