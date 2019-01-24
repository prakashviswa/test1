package junit.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBase {
	public static void main(String[] args) {
		Base b = new Base();
		WebDriver driver=b.getChromeDriver();
		b.loadUrl("https://www.lvbank.com/search.aspx?zoom_query=");
		WebElement sub = driver.findElement(By.className("zoom_button"));
		b.btnclick(sub);
		// Alert al = drive.switchTo().alert();
		// al.accept();
		b.simpleAlert();
		b.quitbrowser();
	}
}
