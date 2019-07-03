package BDDCucumber.eCommerce.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Login {
	WebDriver driver;
	
	public PO_Login (WebDriver d)
	{
		this.driver=d;
	}

	
	@FindBy(how=How.XPATH,using="//span[text()='My Account']")
	private WebElement click_myaccount;
	
	@FindBy(how=How.XPATH,using="//a[text()='Sign in']")
	private WebElement click_signin;

	@FindBy(how=How.XPATH,using="//input[@value='customer@example.com']")
	private WebElement textbx_username;
	
	
	
	@FindBy(how=How.XPATH,using="//input[@value='customer']")
	private WebElement textbx_password;
	
	@FindBy(how=How.XPATH,using="//button[text()='Sign in']")
	private WebElement click_SignInbutton;
	
	

public void ClickOnMyAccount()
{
	click_myaccount.click();
}

public void ClickOnSignIn()
{
	click_signin.click();
	
}

public void  EnterUsername (String u)
{textbx_username.clear();
	textbx_username.sendKeys(u);
}

public void  EnterPassword (String p)
{textbx_password.clear();
	textbx_password.sendKeys(p);
}
public void ClickOnSignInButton()
{
	click_SignInbutton.click();
	
}

}
