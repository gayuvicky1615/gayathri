package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Forgot password?")).click();
		
		driver.findElement(By.id("identify_email")).sendKeys("9845689606");
		driver.findElement(By.name("did_submit")).click();
		
		
		

	}

}
