package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15) );
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.id("populate-text\"")).click();
WebElement element=driver.findElement(By.id("\"display-other-button\""));
wait.until(ExpectedConditions.visibilityOf(element));
System.out.println(element.isDisplayed());
driver.findElement(By.id("//button[@id='checkbox']"));
System.out.println(element.isSelected());

//implicitwait methods
//System.out.println(element.isDisplayed());
//System.out.println(element.isEnabled());
//System.out.println(element.isSelected());
//driver.quit();



}
}
