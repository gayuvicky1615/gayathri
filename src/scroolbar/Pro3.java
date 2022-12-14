package scroolbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement a = driver.findElement(By.xpath("(//img[@alt='Shop activity trackers and smartwatches'])"));
	    Point loc = a.getLocation();
	    int x = loc.getX();
	    int y = loc.getY();
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy"+x+","+y+"");
	    a.click();

	}

}
