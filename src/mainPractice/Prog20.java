package mainPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Prog20 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tamildhool.net/vijay-tv/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot ts = (TakesScreenshot)driver;    //Type casting
		
		File ramloc = ts.getScreenshotAs(OutputType.FILE);  //access mtd take photo store RAm
		
		
		File desloc = new File("./photo/tamildhool.png");  //required or desktoplocation
		
		 FileUtils.copyFile(ramloc, desloc);   //from ram to desktop
		
		
		driver.close();
		
		
        
	}

	
}
