package Com.QA.Endpoints;

public class Routes {

	/* 
	 *  Locators Of LoginPage
	 */
	protected String usernameBox="input#user-name";
	protected String passwordBox="input#password";
	protected String loginButton="input#login-button";
	protected String AcceptedUsernamePassword="//div[@class='login_credentials_wrap-inner']";
	protected String VerifyLoginLogo="div[class='login_logo']";
	
	/* 
	 *  Locators Of ProductPage
	 */
	protected String ProductPageLogo="div[class='app_logo']";
	protected String ProductFilter="select[class='product_sort_container'] option";
	protected String footerLink="footer[class='footer'] ul li";
	protected String product="//*[@id=\"inventory_container\"]/div/div[1]/div[2]";
	protected String productLink="text=Sauce Labs Backpack";
	protected String productPrice="div[class='inventory_details_price']";
	
	protected String AddtocartButton="//button[@class='btn btn_primary btn_small btn_inventory']";
	protected String cartbutton="a[class='shopping_cart_link']";
	protected String ProductinCart="//div[@class='inventory_item_name']";
	protected String checkoutbutton="button#checkout";
	
	/* 
	 *  Locators Of AddressPage
	 */
	protected String AddressPageappLogo="div[class='app_logo']";
	protected String AddressPageHeader="span[class='title']";
	protected String footerLinks="footer[class='footer'] ul";
	protected String FirstNamefield="input#first-name";
	protected String LastNamefield="input#last-name";
	protected String zipcodefield="input#postal-code";
	protected String continueButton="input#continue";
	
	
	/* 
	 *  Locators Of PaymentPage
	 */
	protected String PaymentPageappLogo="div[class='app_logo']";
	protected String PayementPageHeader="span[class='title']";
	protected String footerLinkss="footer[class='footer'] ul";
	protected String PaymentInformation="div[class='summary_info'] :nth-child(2)";
	protected String ShippingInformation="div[class='summary_info'] :nth-child(4)";
	protected String TotalPriceInformation="div[class='summary_info'] :nth-child(8)";
	protected String finishButton="button#finish";
	
	/* 
	 *  Locators Of ConfirmOrderPage
	 */
	
	protected String ConfirmedOrderPagePageappLogo="div[class='app_logo']";
	protected String ConfirmedOrderPagePageHeader="span[class='title']";
	protected String ConfirmedOrderPagefooterLinkss="footer[class='footer'] ul";
	
	protected String ConfirmOrderMessage="h2[class='complete-header']";
	protected String ConfirmOrderDelieveryMessage="div[class='complete-text']";
}
