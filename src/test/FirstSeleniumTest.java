package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumhq.org/");
		
	}

}
