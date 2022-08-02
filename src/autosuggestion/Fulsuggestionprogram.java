package autosuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fulsuggestionprogram {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.facebook.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
	      
	      

	}

}
