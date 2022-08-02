package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement abc = driver.findElement(By.name("username"));
		Point loc = abc.getLocation();
		int x = loc.getX();
		System.out.println("X cocordinate" +x);
		int y = loc.getY();
		System.out.println("y cocordinate" +y);
		

	}

}
