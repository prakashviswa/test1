package junit.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	WebDriver driver;

	public WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\SeleniumStartUp\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public WebDriver getFirefoxDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\SeleniumStartUp\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public WebDriver getInternetExplorerDriver() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\teslaram\\seleniumNewWork\\SeleniumStartUp\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void loadUrl(String Url) {
		driver.get(Url);
	}

	public void type(WebElement element, String name) {
		element.sendKeys(name);
	}

	public void btnclick(WebElement element) {
		element.click();
	}

	public void quitbrowser() {
		driver.quit();
	}

	public void mouseOver(WebElement wele) {
		Actions actionRef = new Actions(driver);
		actionRef.moveToElement(wele).perform();
	}

	public void dragDrop(WebElement src, WebElement des) {
		Actions actionRef = new Actions(driver);
		actionRef.dragAndDrop(src, des);
	}

	public void contextClick(WebElement btnLogin) {
		Actions actionRef = new Actions(driver);
		actionRef.contextClick(btnLogin).perform();
	}

	public void doubleClick(WebElement btnLogin) {
		Actions actionRef = new Actions(driver);
		actionRef.doubleClick(btnLogin).perform();
	}

	public void keyDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public void keyUp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public void keyEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void keyShift() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);
	}

	public void simpleAlert() {
		Alert alertRef = driver.switchTo().alert();
		alertRef.accept();
	}

	public void confirmAlertOk() {
		Alert alertRef = driver.switchTo().alert();
		alertRef.accept();
	}

	public void confirmAlertCancel() {
		Alert alertRef = driver.switchTo().alert();
		alertRef.dismiss();
	}

	public void promptAlertYes() {
		Alert alertRef = driver.switchTo().alert();
		alertRef.sendKeys("yes");
		alertRef.accept();
	}

	public void promptAlertNo() {
		Alert alertRef = driver.switchTo().alert();
		alertRef.sendKeys("no");
		alertRef.accept();
	}

	public void promptAlertCancel() {
		Alert alertRef = driver.switchTo().alert();
		alertRef.dismiss();
	}

}
