package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.findElement(By.id("name")).sendKeys("siva");
	driver.findElement(By.className("form-control"));
	driver.findElement(By.xpath("//input[@id=\"email\"]"));
	driver.get("https://www.meesho.com/");
    driver.findElement(By.name("class=\"sc-eDvSVe gUjMRV\"")).click();
    driver.findElement(By.name("class=\"NavBarDesktop__Subtitle-sc-xsryom-0 cVsvOs\""));//eletronics in 
}
}
