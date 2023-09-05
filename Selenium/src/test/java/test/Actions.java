package test;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.beust.jcommander.JCommander.Builder;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Actions{
public Actions(WebDriver driver) {
}
public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();	
		WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ilovepdf.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebElement hover=driver.findElement(By.xpath("//span[text()='Convert PDF']"));
   WebElement hover=driver.findElement(By.xpath("//span[text()='All PDF tools']"));
   Actions ac =new Actions(driver);
	//mouse action 
       ac.movetoelement(hover).Build().perform();
	// Thread.sleep(1000);
	    ac.DoubleClick(hover).build().perform();
	  ac.contextClick(hover).build().perform();//right click
	}




}

 











 








	
	
	

	

	

	

	

	
	
	





