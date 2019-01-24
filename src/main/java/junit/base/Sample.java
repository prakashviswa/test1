package junit.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {

	public static void main(String[] args) {
		Base b = new Base();
		WebDriver driver = b.getDriver();
		b.loadUrl("https://www.facebook.com/");
		WebElement txtUserName = driver.findElement(By.id("email"));
		b.type(txtUserName, "Prakash");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		b.type(txtPassword, "Viswa");
		WebElement btnLogin = driver.findElement(By.id("loginbutton"));
		b.btnclick(btnLogin);
		b.quitbrowser();
	}
}
