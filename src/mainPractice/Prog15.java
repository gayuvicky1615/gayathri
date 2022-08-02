package mainPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog15 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        WebElement a = driver.findElement(By.id("course"));
        Thread.sleep(3000);
        
        Actions a1 =new Actions(driver);
        a1.moveToElement(a).perform();
        
        driver.findElement(By.xpath("//a[text()='munit testing ']")).click();
        
        WebElement a3 = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
        a1.doubleClick(a3).perform();
	}

}
