package pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
WebDriver driver;
	
	//==============Locators==================
	
	@FindBy(xpath="//a[text()=\'Sign Up\']")
	WebElement signup;
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(id="email")
	WebElement email;
		
	@FindBy(id="contactNumber")
	WebElement contactnumber;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(id="role1")
	WebElement role;
	
	@FindBy(name="_eventId_billing")
	WebElement nextbtn;
	
	@FindBy(id="addressLineOne")
	WebElement addlineone;
	
	@FindBy(id="addressLineTwo")
	WebElement addlinetwo;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="postalCode")
	WebElement postalcode;
	
	@FindBy(id="state")
	WebElement state;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(name="_eventId_confirm")
	WebElement confirm;
	
	@FindBy(xpath="//a[text()='Confirm']")
	WebElement lastconfirm;
	
	
	//==============Constructor=========
	
	public SignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//==============functions=================
	
	public void signupfunction(String firstName, String lastName, String Email, String contactNumber, String Password, String confirmPassword, String addlineOne, String addlineTwo, String City, String postalCode, String State, String Country) {
		
		signup.click();
		firstname.sendKeys(firstName);
		lastname.sendKeys(lastName);
		email.sendKeys(Email);
		contactnumber.sendKeys(contactNumber);
		password.sendKeys(Password);
		confirmpassword.sendKeys(confirmPassword);
		role.click();
		nextbtn.click();
		addlineone.sendKeys(addlineOne);
		addlinetwo.sendKeys(addlineTwo);
		city.sendKeys(City);
		postalcode.sendKeys(postalCode);
		state.sendKeys(State);
		country.sendKeys(Country);
		confirm.click();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", lastconfirm);
		
	
		
	}

}
