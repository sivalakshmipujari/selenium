package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskiterapractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("name")).sendKeys("lakshmi");
		driver.findElement(By.id("phone")).sendKeys("9347637108");
		driver.findElement(By.id("email")).sendKeys("lakshmi@123");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.id("address")).sendKeys("yerragunta");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("monday")).click();
		driver.findElement(By.xpath("//option[@value='3']")).click();
		driver.findElement(By.xpath("//label[@class='custom-control-label']")).click();
		driver.findElement(By.xpath("//label[@for='selenium']")).click();
		// driver.findElement(By.xpath("//input[@class='custom-file-input']")).click();

	}

}
