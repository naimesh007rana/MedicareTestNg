package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

WebDriver driver;
	
	//==============Locators==================
	
	@FindBy(xpath="//a[text()='View'][1]")
	WebElement viewbtn;
	
	@FindBy(xpath="//a[text()=' Add to Cart']")
	WebElement addcartbtn;
	
	@FindBy(xpath="//a[text()='Checkout ']")
	WebElement checkoutbtn;
	
	@FindBy(xpath="//a[text()='Select']")
	WebElement Select;
		
	@FindBy(id="cardNumber")
	WebElement cardnumber;
	
	@FindBy(id="expityMonth")
	WebElement month;
	
	@FindBy(id="expityYear")
	WebElement year;
	
	@FindBy(id="cvCode")
	WebElement cvcode;
	
	@FindBy(xpath="//a[text()='Pay']")
	WebElement paybtn;
	
	
	
	
	//==============Constructor=========
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//==============functions=================
	
	public void checkoutfunction(double cardNumber, int Month, double Year, int cvCode) {
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", viewbtn);
		
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", addcartbtn);
		
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", checkoutbtn);
		
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", Select);
		
		cardnumber.sendKeys(""+cardNumber);
		month.sendKeys(""+Month);
		year.sendKeys(""+Year);
		cvcode.sendKeys(""+cvCode);
		paybtn.click();
				
	}
}
