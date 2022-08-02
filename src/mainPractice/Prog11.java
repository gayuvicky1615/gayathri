package mainPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement a = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		if(a.isDisplayed())
		{
			System.out.println("search box is prensent");
			a.sendKeys("dress");
		}
		else
		{
			System.out.println("Search box is not present");
		}
		

	}

}
