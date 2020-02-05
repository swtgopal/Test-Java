package newpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ISelect;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//String tagName="";
	
	driver.navigate().to("http://www.facebook.com");
	//tagName = driver.findElement(By.id("email")).getTagName();
    //System.out.println(tagName);
    
	driver.findElement(By.id("email")).sendKeys("swt.gopal");
	driver.findElement(By.id("pass")).sendKeys("Gops#1985");
	driver.findElement(By.xpath("//*[@id=\'u_0_b\']")).click();
	//Click on Account Settings
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement AccSettings = driver.findElement(By.id("userNavigationLabel"));
	AccSettings.click();

	//Click on Log out button
	WebDriverWait wait = new WebDriverWait(driver, 8);
	WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
	logout.click();
    driver.close();
    System.exit(0);


	}
}
