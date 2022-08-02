package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
