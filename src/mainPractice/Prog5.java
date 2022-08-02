package mainPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
	     Thread.sleep(3000);
	     
	     driver.findElement(By.partialLinkText("Forgot")).click();
	     driver.findElement(By.id("identify_email")).sendKeys("984526352");
	     
		
		
		

	}

}
