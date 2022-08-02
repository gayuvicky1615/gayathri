package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement abc = driver.findElement(By.name("username"));
		Dimension a = abc.getSize();
		int h = a.getHeight();
		System.out.println("height of user name is "+h);
		int w = a.getWidth();
		System.out.println("width of user name is "+w);
		
		
		

	}

}
