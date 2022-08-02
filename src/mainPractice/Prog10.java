package mainPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
	     Thread.sleep(3000);
	     
	  WebElement a = driver.findElement(By.name("email"));
	  
	  System.out.println(a.getAttribute("name"));
	  Point loc = a.getLocation();
	  int x = loc.getX();
	  System.out.println("x coordinate of email box is"+x);
	  
	  int y = loc.getY();
	  System.out.println("y cordinate is"+y);
	  
	  Dimension  d = a.getSize();
	  int h = d.getHeight();
	  System.out.println(h);
	  
	  int w = d.getWidth();
	  System.out.println(w);
	  
	  driver.close();

	}

}
