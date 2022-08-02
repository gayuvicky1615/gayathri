package locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Test0 {

    public static void main(String[] args) {
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("vigneshbe15591@gmail.com");
        driver.findElement(By.xpath(".//input[@name='pass']")).sendKeys("muthiah");  
        driver.findElement(By.xpath(".//input[@data-testid='royal_login_button']")).click();
        

    }
}