package Seleniumpp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EMPimageuplod {
	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://empirehome.myprojectsonline.co.in/");
	driver.manage().window().maximize();
	driver.findElement(By.name("emailid")).sendKeys("sureshbabuemp@gmail.com");
	driver.findElement(By.name("pword")).sendKeys("ZPMHQHIA");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='fa fa-houzz']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body[@class='sidebar-mini sidebar-collapse  pace-done']")).click();
	Thread.sleep(2000);
	//WebElement ele=driver.findElement(By.xpath("//input[@type='date']")).ele.sendkeys("18.08.2023");
	
	
	}

	}


