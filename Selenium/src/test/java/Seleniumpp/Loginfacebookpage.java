package Seleniumpp;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfacebookpage {

	public static void main(String[] args) throws Throwable {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com/");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("lakshmi");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("pujari");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9347637108");
    			Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("123456");
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("26");
    				Thread.sleep(2000);
    driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("june");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1999");
    		Thread.sleep(2000);		
    		 driver.findElement(By.xpath("//label[@Female]")).click();
    		 Thread.sleep(2000);
    		 driver.findElement(By.xpath("//label[@'Male']")).sendKeys("click");
    				 Thread.sleep(2000);
    				 driver.findElement(By.xpath("//label[@'Custom']")).sendKeys("click");	 
    				 Thread.sleep(2000);
    				 driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).sendKeys("click");
    				Thread.sleep(2000);
	}
}