package Seleniumpp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dd11 {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");	
WebElement ele=driver.findElement(By.id("ide"));
Select sel=new Select(ele);
List<WebElement> web=sel.getOptions();
for(WebElement ww:web)
{
	System.out.println("all options"+ww.getText());
}
sel.selectByIndex(2);
Thread.sleep(2000);
sel.selectByVisibleText("Visual Studio");
Thread.sleep(2000);
sel.selectByValue("ec");
List<WebElement> web1=sel.getAllSelectedOptions();
for(WebElement aa:web)
{
	System.out.println("all selected options"+aa.getText());
}
WebElement wb=sel.getFirstSelectedOption();
System.out.println("first selected options"+wb.getText());
if(sel.isMultiple()) 
{
	System.out.println("is selected dd");

}
else
{
	System.out.println("is not selcted dd");
}












}
}
