package BDDCucumber.eCommerce.PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_AddToCart {

	WebDriver driver;

	public PO_AddToCart(WebDriver d)
	{
		this.driver=d;
	}

	@FindBy(how = How.ID,using = "search_input")
	private WebElement txtbx_search_box;

	@FindBy(how = How.CLASS_NAME,using = "ty-icon-search")
	private WebElement btn_submit;

	@FindBy(how=How.XPATH,using="//a[@data-ca-target-id='pagination_contents'][3]")
	private WebElement click_on_listviewicon;

	@FindBy(how=How.XPATH,using="//button[@id='button_cart_217']")
	private WebElement click_on_addtocart;

	public void SetSearchBox(String arg) {
		txtbx_search_box.sendKeys(arg);
	}

	public void ClickSearchSumitButton() {
		btn_submit.click();
	}


	public void ClickOnListViewButton()
	{
		click_on_listviewicon.click();
	}

	public void ClickOnAddToCartButton()
	{
		click_on_addtocart.click();
	}

	//public void ClickOnAddToCartButton()
	//{
	//	click_on_addtocart.click();
	//}
}
