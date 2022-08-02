package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Facebook fb = new Facebook(driver);
		fb.acceptcookiesbtn();
		fb.emailaddresstb("vigneshbe15591@gmail.com");
		fb.passwordtb("muthiah");
		fb.loginbtn();

	}

}
