package Jenk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
@org.testng.annotations.Test
public void Test() throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/");
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("username")).sendKeys("test124@yahoo.com");
	Thread.sleep(1000);
	driver.findElement(By.id("login-signin")).click();
	driver.quit();
	
}
}
