package mainPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.instagram.com/?hl=en");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']")).click();
    Thread.sleep(3000);
    driver.findElement(By.name("username")).sendKeys("vigneshbe15591@gmail.com");
    driver.findElement(By.name("password")).sendKeys("9865289606");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    
	}

}
