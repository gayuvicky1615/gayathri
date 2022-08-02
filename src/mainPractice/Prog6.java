package mainPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']")).click();
	  
		driver.findElement(By.cssSelector("input[name=\"username\"]")).sendKeys("vigneshbe15591@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("9677659218");
		
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	    
	    
		

	}

}
