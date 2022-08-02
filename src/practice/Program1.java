package practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
	    driver.findElement(By.name("login")).click();
	    
		
		
		

	}

}
