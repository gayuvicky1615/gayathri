package mainPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog18 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		
		s.selectByIndex(8);
		Thread.sleep(3000);
		s.selectByValue("search-alias=luggage-intl-ship");
		Thread.sleep(3000);

		s.selectByVisibleText("Music, CDs & Vinyl");
		Thread.sleep(3000);


		
		
		List<WebElement> abc =s.getOptions();
		System.out.println(abc.size());
		for(WebElement g:abc)
		{
			System.out.println(g.getText());
		}
		
		
		
		

	}

}
