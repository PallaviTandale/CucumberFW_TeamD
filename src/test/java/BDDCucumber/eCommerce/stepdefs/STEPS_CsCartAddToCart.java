package BDDCucumber.eCommerce.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BDDCucumber.eCommerce.PO.PO_AddToCart;
import BDDCucumber.eCommerce.PO.PO_Header;
import BDDCucumber.eCommerce.PO.PO_Login;
import BDDCucumber.eCommerce.PO.PO_Search;
import BDDCucumber.managers.WebDriverManagerSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class STEPS_CsCartAddToCart {
	 
		
	
		WebDriverManagerSingleton browserManager = WebDriverManagerSingleton.getInstanceOfWebDriverManager();
		WebDriver driver = browserManager.getDriver();
//		PO_Header PO_Header = PageFactory.initElements(driver, PO_Header.class);
//		PO_Login po_login=PageFactory.initElements(driver,PO_Login.class);
		PO_AddToCart PO_addtocart=PageFactory.initElements(driver,PO_AddToCart.class);
		Scenario scn ;

		@Before
		public void SetUp(Scenario s) {
			this.scn = s;
		
		
		}
		
		

		@Then("product results are displayed")
		public void product_results_are_displayed() {
			
			scn.write("products are displayed");
		}

		@When("I click on list view button")
		public void i_click_on_list_view_button() {
			
			PO_addtocart.ClickOnListViewButton();
			scn.write("Clicked on List view Button");
		}

		@Then("products are displayed in list view")
		public void products_are_displayed_in_list_view() {
	
		    
		}

		@When("I click add to cart for product code H{int}E{int}OE{int}")
		public void i_click_add_to_cart_for_product_code_H_E_OE(Integer int1, Integer int2, Integer int3) {
			PO_addtocart.ClickOnAddToCartButton();
			scn.write("Clicked on AddToCart Button");
		    
		}

		@Then("my cart is updated with product quantity as {int} and correct total price")
		public void my_cart_is_updated_with_product_quantity_as_and_correct_total_price(Integer int1) {
			scn.write("my cart is updated with single  product ");
		
}
}
