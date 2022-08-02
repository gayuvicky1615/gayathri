package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
	@FindBy(xpath="button[@title='Allow essential and optional cookies']")
	private WebElement acceptcookies;
	
	@FindBy(id="email")
	private WebElement emailaddress;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	



public Facebook(WebDriver driver){
	PageFactory.initElements(driver,this);
}


public void acceptcookiesbtn() {
	
	acceptcookies.click();
}

public void emailaddresstb(String us)
{
	emailaddress.sendKeys(us);
	}
public void passwordtb(String pwd) {
	
	password.sendKeys(pwd);
}
public void loginbtn()
{
	login.click();
	}
}
