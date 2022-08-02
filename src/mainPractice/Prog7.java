package mainPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']")).click();
		
		driver.findElement(By.id("email")).sendKeys("vigneshbe15591@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("muthiah");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook") )
		{
			System.out.println("homepage is displayed");
		}
		else
		{
			System.out.println("homepage is not displayed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
				

	}

}
