package Seleniumpp;

import java.nio.channels.Channels;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	private static List<WebElement> ele;

	public static void main(String[] args) {
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.abhibus.com/");
   driver.manage().window().maximize();
   driver.findElement(By.id("source")).sendKeys("hyderabad");
   List<WebElement>list=driver.findElements(By.xpath("//ul[@class=\"ui-autocomplete ui-front ui-menu ui-widget ui-widget-content\"]//li"));
   System.out.println(ele.size());
for(WebElement ele:list) {
	System.out.println(ele.getText());
}
for(WebElement ele:list) {
	if(ele.getText().equals("Hyderabad ,HyderabadAirport RGIA"));
	ele.click();
}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}


