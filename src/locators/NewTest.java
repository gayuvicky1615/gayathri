package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@id,\"password\")]")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("SkillRary Ecommerce"))
		{
		
			System.out.println("home page is displayed");
		}
		else
		{
			System.out.println("home page is not dispalyed");
		}
		
		
	}

}
