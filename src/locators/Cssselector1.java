package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.findElement(By.xpath("//body[contains(@class,'hasCookieBanner')]")).click();
        driver.findElement(By.id("email")).sendKeys("vigneshbe15591@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("muthiah");
		driver.findElement(By.cssSelector("button[name=login]")).click();
	    driver.close();
	}
}