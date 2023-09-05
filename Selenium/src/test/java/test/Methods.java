package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Methods{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	driver.get("https://www.meesho.com/");
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getPageSource());
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getWindowHandle());
	 System.out.println(driver.getWindowHandles());
	 System.out.println(driver.manage());
	 System.out.println(driver.navigate());
	 CharSequence siva;
	 System.out.println();
	 System.out.println(driver.findElement(null));
	 System.out.println(driver.findElements(null));
	 System.out.println(driver.switchTo());
	 driver.quit();
	  driver.close();
	}
}


