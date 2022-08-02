package mainPractice;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prog26 {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		Properties p = new Properties();
		FileInputStream a = new FileInputStream("./id.properties");
		p.load(a);
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
		
		driver.findElement(By.id("email")).sendKeys(p.getProperty("un"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("pwd"));
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		

	}

}
