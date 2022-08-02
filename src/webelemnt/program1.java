package webelemnt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		
		
	}
	
}
