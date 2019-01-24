package junit.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base1 {

	public WebDriver launch(String url) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\SeleniumStartUp\\Driver\\chromedriver.exe");
		WebDriver driv = new ChromeDriver();
		
		driv.get(url);
		return driv;
	}

	public void type(WebElement elem, String txt) {
		elem.sendKeys(txt);
	}

	public void click(WebElement cl) {
		cl.click();
	}

	public void quit(WebDriver q) {
		q.quit();
	}

	public void simpleAlert(WebDriver webDr) {
		Alert al = webDr.switchTo().alert();
		al.accept();
	}

	public void confirmAlertOk(WebDriver webDr) {
		Alert al = webDr.switchTo().alert();
		al.accept();
	}

	public void confirmAlertCancel(WebDriver webDr) {
		Alert al = webDr.switchTo().alert();
		al.dismiss();
	}

	public void PromptAlertYes(WebDriver webDr) {
		Alert al = webDr.switchTo().alert();
		al.sendKeys("yes");
		al.accept();
	}

	public void PromptAlertNo(WebDriver webDr) {
		Alert al = webDr.switchTo().alert();
		al.sendKeys("no");
		al.accept();
	}

	public void PromptAlertCancel(WebDriver webDr) {
		Alert al = webDr.switchTo().alert();
		al.dismiss();
		
	}

	public void mouseOver(WebDriver wdr, WebElement wele) {
		Actions ac = new Actions(wdr);
		ac.moveToElement(wele).perform();

	}

	public void dragDrop(WebDriver wdr, WebElement src, WebElement des) {
		Actions ac = new Actions(wdr);
		ac.dragAndDrop(src, des);
	}
}
