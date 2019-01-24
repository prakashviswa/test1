package junit.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LakshmiVIlasBankSec {
	public static void main(String[] args) {
		Base b = new Base();
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\SeleniumStartUp\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.lvbank.com/search.aspx?zoom_query=");
		WebElement sub = driver.findElement(By.className("zoom_button"));
		sub.click();
		Alert al = driver.switchTo().alert();
		b.simpleAlert();
		b.quitbrowser();
	}
}
