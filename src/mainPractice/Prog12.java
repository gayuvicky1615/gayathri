package mainPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
	     Thread.sleep(3000);
	     
	     WebElement login = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
        
	     if(login.isEnabled())
	     {
	    	 System.out.println("login is enabled");
	     }
	     else
	     {
	    	 System.out.println("login is not  enabled");

	     }
	     driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	     
	     WebElement button = driver.findElement(By.xpath("//input[@class='_8esa']"));
	     
	     if(button.isSelected())
	     {
	    	 System.out.println("raio button is selected");
	     }
	     else
	     {
	    	 System.out.println("radio button is not selected");
	     }
	}

}
