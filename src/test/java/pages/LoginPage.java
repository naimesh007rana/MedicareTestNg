package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	//==============Locators==================
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement loginbtn;
	
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login;
		
	
	//==============Constructor=========
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//==============functions=================
	
	public void loginfunction(String UserName, String PassWord) {
		
		loginbtn.click();
		userName.sendKeys(UserName);
		passWord.sendKeys(PassWord);
		login.click();
		
		
	}


}
