package Seleniumpp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws Throwable {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/accounts/login/");
Thread.sleep(3000);
/*driver.findElement( By.xpath("//input[@class='_aa4b _add6 _ac4d']")).sendKeys("lakshmi");
Thread.sleep(3000);
driver.findElement( By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("52634178");
driver.findElement( By.xpath("//input[@type='password']")).sendKeys("123456");
Thread.sleep(3000);
driver.findElement( By.xpath("//input[@value name='password']")).sendKeys("000000");
Thread.sleep(3000);
driver.findElement( By.xpath("//input[@aria-required='true']")).sendKeys("welcome");
driver.findElement( By.xpath("//input[@autocorrect='off']")).sendKeys("hello");*/

//driver.get("");
//driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
//driver.findElement(By.xpath("// span [text()='Sign up']")).click();	
//driver.findElement(By.xpath("//input[text()='textvalue']")).click();

driver.get("www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers");

	
// unique attribute	by x-path tagname[@AN='av']
//("https://www.instagram.com/accounts/login/")
//input[@class='_aa4b _add6 _ac4d']	
//input[@aria-label='Phone number, username, or email']	
//input[@value name='password']
//input[@aria-required='true']
//input[@autocorrect="off"]

//x-path by text() function>>>>>>//tagname[text()='text value']
//span [text()='Sign up']


	}
}


