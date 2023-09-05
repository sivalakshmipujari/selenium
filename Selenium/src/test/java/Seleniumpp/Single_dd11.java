package Seleniumpp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Single_dd11 {
	public static void main (String[]args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         WebElement web=driver.findElement(By.id("course"));
		Select sel=new Select(web);
		List<WebElement> w=sel.getOptions();
		for(WebElement ww:w)
		{
			System.out.println(ww.getText());
		}
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByVisibleText("Dot Net");
		Thread.sleep(2000);
        sel.selectByValue("Java");
	  }
}
