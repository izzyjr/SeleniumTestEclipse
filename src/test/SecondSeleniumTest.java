package test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondSeleniumTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://finance.yahoo.com/cryptocurrencies?count=120");
		
		System.out.println(driver.getTitle());
		
		String xpath = "//*[@id=\"scr-res-table\"]/table/tbody/tr[*]";
        List<WebElement> tableRows = driver.findElements(By.xpath(xpath));

        for (int i = 0; i < 112; i++) {
            System.out.println((i + 1) + ": " + tableRows.get(i).getText());
        }

        driver.quit();
		
	}

}
