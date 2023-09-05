package Seleniumpp;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.time.temporal.TemporalUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class screenshot1 {

	public static void main(String[] args) throws Throwable {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://www.redbus.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	//screenshot for web page
	//syntax:parentclass p=new (childclass);
	//childclass c=(childclass)parent reference variable;
	TakesScreenshot ts = (TakesScreenshot)driver;
	File from =ts.getScreenshotAs(OutputType.FILE);
	File to=new File("\"C:\\Users\\Sivalakshmi\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-08-17 164942.png\"");//sivalakshmi.png
	Files.copy(from, to);
	//particular element
	WebElement ele=driver.findElement(By.xpath("//button[text()='SEARCH BUSES']"));
	File from1 =ts.getScreenshotAs(OutputType.FILE);
	File to1=new File("\"C:\\Users\\Sivalakshmi\\OneDrive\\Pictures\\Screenshots\\search button.png\"");
	Files.copy(from1, to1);
	
	
	
	}

}
