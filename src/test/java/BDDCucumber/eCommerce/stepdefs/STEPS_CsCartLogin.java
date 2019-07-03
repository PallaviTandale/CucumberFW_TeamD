package BDDCucumber.eCommerce.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BDDCucumber.eCommerce.PO.PO_Login;
import BDDCucumber.managers.WebDriverManagerSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class STEPS_CsCartLogin {
	WebDriverManagerSingleton browserManager = WebDriverManagerSingleton.getInstanceOfWebDriverManager();
	WebDriver driver = browserManager.getDriver();
	PO_Login po_login=PageFactory.initElements(driver, PO_Login.class);
	Scenario scn ;
	
	@Before
	public void SetUp(Scenario s) {
		this.scn = s;
	}

	@When("I click on My account link at the top right")
	public void i_click_on_My_account_link_at_the_top_right() {
	    po_login.ClickOnMyAccount();
	    scn.write("Clicked On My Account");
	}

	@When("and click on Sign in button")
	public void and_click_on_Sign_in_button() {
	    po_login.ClickOnSignIn();
	    scn.write("Clicked on Sign In");
	}

	@Then("sign in pop up is displayed")
	public void sign_in_pop_up_is_displayed() {
		scn.write("Displayed Sign In Pop Up");
	}

	@Then("username and password already entered")
	public void username_and_password_already_entered() {
	    
		po_login.EnterUsername("customer@example.com");
		po_login.EnterPassword("customer");
		scn.write("Enter username and Password");
	}

	@When("I click on sign in button")
	public void i_click_on_sign_in_button() {
	    po_login.ClickOnSignInButton();
	    scn.write("Clicked on Sign In");
	    
	}

	@Then("I am logged in to the application")
	public void i_am_logged_in_to_the_application() {
		scn.write("Logged in to the application");
	}



	
	
}
