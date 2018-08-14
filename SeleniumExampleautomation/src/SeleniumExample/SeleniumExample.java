package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumExample {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\khushdeep\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
		driver.close();
		
		
}}