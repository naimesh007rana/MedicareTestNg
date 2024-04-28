package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckoutPage;
import pages.CheckoutPageTwoItem;
import pages.LoginPage;
import pages.SignUpPage;

public class SignupLoginTest extends BaseClass{
	
	@Test
	public void SignUpTest() {
		
		
		SignUpPage signup = new SignUpPage(driver);
		
		signup.signupfunction("Unnati", "Rana", "unk@xyz.com", "9214567890", "psd123", "psd123", "12,abc appt", "xyz street", "Mumbai", "562538", "Maharastra", "India");
		
		WebElement msgwelcome = driver.findElement(By.xpath("//h1"));
		String actmsg = msgwelcome.getText();
		String expmsg = "Welcome!";
		AssertJUnit.assertEquals(actmsg, expmsg);
		
		
	}
	
	@Test
	public void LoginSuccessTest() {
		LoginPage Loginpg = new LoginPage(driver);
		Loginpg.loginfunction("jkd@xyz.com", "psd123");
		
		WebElement msg = driver.findElement(By.xpath("//p[text()='Categories']"));
		
		String actmsg = msg.getText();
		String expmsg = "Categories";
		AssertJUnit.assertEquals(actmsg, expmsg);
	}
	
	@Test
	public void LoginFailureTest() {
		LoginPage Loginpg = new LoginPage(driver);
		Loginpg.loginfunction("jkv@xyz.com", "psi123");
		
		WebElement msg = driver.findElement(By.className("alert"));
		
		String actmsg = msg.getText();
		String expmsg = "Username and Password is invalid!";
		AssertJUnit.assertEquals(actmsg, expmsg);
	}
	
	@Test
	public void OneItemCheckoutTest() {
		LoginPage Loginpg = new LoginPage(driver);
		Loginpg.loginfunction("jkd@xyz.com", "psd123");
		
		CheckoutPage checkoutpg = new CheckoutPage(driver);
		checkoutpg.checkoutfunction(1234567812, 12, 2026, 543);
		
		WebElement msg = driver.findElement(By.xpath("//h3[text()='Your Order is Confirmed!!']"));
		
		String actmsg = msg.getText();
		String expmsg = "Your Order is Confirmed!!";
		AssertJUnit.assertEquals(actmsg, expmsg);
	}
	
	@Test
	public void TwoItemCheckoutTest() {
		LoginPage Loginpg = new LoginPage(driver);
		Loginpg.loginfunction("jkd@xyz.com", "psd123");
		
		CheckoutPageTwoItem checkoutpg = new CheckoutPageTwoItem(driver);
		checkoutpg.checkouttwoitemfunction(1234567812, 12, 2026, 543);
		
		WebElement msg = driver.findElement(By.xpath("//h3[text()='Your Order is Confirmed!!']"));
		
		String actmsg = msg.getText();
		String expmsg = "Your Order is Confirmed!!";
		AssertJUnit.assertEquals(actmsg, expmsg);
	}

}
