package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActions1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumDay5\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/drag_drop.html ");
		driver.manage().window().maximize();
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	    WebElement account = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    Actions a = new Actions(driver);
	    a.dragAndDrop(bank, account).perform();
	    WebElement fiveThousand = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement amount = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    a.dragAndDrop(fiveThousand, amount).perform();
	    WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	    WebElement accounts = driver.findElement(By.xpath("//li[@class='placeholder']"));
	    a.dragAndDrop(sales, accounts).perform();
	    WebElement fiveThousands = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	    WebElement amounts = driver.findElement(By.xpath("//li[@class=\"placeholder\"]"));
	    a.dragAndDrop(fiveThousands, amounts).perform();
	}
	

}
