package junit.base;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.win32.OaIdl.DATE;

public class ExecutionTimeJunit {
static WebDriver driver;
@BeforeClass
public static void beforeClass() {
System.setProperty("webdriver.chrome.driver", "D:\\Users\\teslaram\\seleniumNewWork\\SeleniumStartUp\\Driver\\chromedriver.exe");
driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
}
@AfterClass
public static void afterClass() {
driver.quit();
}
@Test
public void test1() {
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys("prakash");
	WebElement txtPassword = driver.findElement(By.id("pass"));
txtPassword.sendKeys("Viswa");
	WebElement btnLogin = driver.findElement(By.id("loginbutton"));
	btnLogin.click();
}
@Before
public void befroeMethod() {
	System.out.println("Start " +new SimpleDateFormat("HH-mm-ss").format(new Date()));
}
@After
public void afterMethod() {
	System.out.println("End " +new SimpleDateFormat("HH-mm-ss").format(new Date()));
}


}
