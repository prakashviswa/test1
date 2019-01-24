package junit.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HundredBase {
WebDriver driver;
public WebDriver getDriver() {
System.setProperty("webdriver.chrome.driver", "D:\\Users\\teslaram\\seleniumNewWork\\SeleniumStartUp\\Driver\\chromedriver.exe");
driver= new  ChromeDriver();
driver.manage().window().maximize();
	return driver;
}



}
