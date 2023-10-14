package Com.QA.LoginTest;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.QA.BaseTest.BaseTest;
import Com.QA.Utilities.ExcelDataReader;

public class SwagLabsPagesTest extends BaseTest{

	
	@Test(priority = 1)
	public void LoginpageTitleTest() {
		String Expectedtitle=login.getTitle();
		log.info("Login Page Title Matching ....");
		if(Expectedtitle.equals(ActualLoginTitle)) {
			Assert.assertTrue(true);
			log.info("Login Page Title Matched ....");
		}
		else {
			Assert.assertTrue(false);
			log.warn("Login Page Title not Matched ....");
		}
	}
	
	@Test(priority = 2)
	public void LoginpageUrlTest() {
		String Expectedurl=login.geturl();
		log.info("Login Page url Matching ....");
		if(Expectedurl.equals(ActualLoginurl)) {
			Assert.assertTrue(true);
			log.info("Login Page url Matched ....");
		}
		else {
			Assert.assertTrue(false);
			log.warn("Login Page url not Matched....");
		}
	}
	
	@Test(priority = 3)
	public void verifyLoginLogoTest() {
		boolean logo= login.VerifyLoginLogo();
		log.info("Login Page logo Matching ....");
		if(logo==true) {
			Assert.assertTrue(true);
			log.info("Login Page logo Matched ....");
		}
		else {
			Assert.assertTrue(false);
			log.warn("Login Page Title not Matched....");
		}
	}
	
	@Test(priority = 4)
	public void verifyAcceptedUsernamePasswordTest() {
		List<String> usernamepasswordList=login.validateUserNamePassword();
		log.info("Verifying all Accepted Username Password");
		for(String list :usernamepasswordList) {
			System.out.println(list);
			
		}
	}
	
	@Test(priority = 5)
	public void performLoginAction() {
		login.PerformLoginAction(pro.getProperty("username"), pro.getProperty("password"));
		log.info("Login Action Performed Succesfully");
	}
	
	@Test(priority = 6)
	public void verifyProductPageTitleTest() {
		String title= productPage.getTitleProductPage();
		log.info("Product Page Title Matching ....");
		if(title.equals(ActualLoginTitle)) {
			Assert.assertTrue(true);
			log.info("Product Page Title Matched ....");
		}
		else {
			Assert.assertTrue(false);
			log.warn("Product Page Title not Matched....");
		}
	}
	
	@Test(priority = 7)
	public void verifyProductPageUrlTest() {
	 	String url=productPage.geturlProductPage();
	 	
	 	log.info("Product Page url Matching ....");
	 	if(url.equals(ProductPageUrl)) {
	 		Assert.assertTrue(true);
	 		log.info("Product Page url Matched....");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.warn("Product Page url not Matching ....");
	 		
	 	}
	}
	
	@Test(priority = 8)
	public void verifyProductPageLogoTest() {
	 	boolean found=productPage.VerifyProductPageLogo();
	 	log.info("Product Page logo Matching ....");
	 	if(found==true) {
	 		Assert.assertTrue(true);
	 		log.info("Product Page logo Matching ....");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.warn("Product Page logo not Matching ....");
	 	}
	}
	
	@Test(priority = 9)
	public void verifyProductFilterTest() {
	 	List<String> list=productPage.getProductFiterTexts();
	 	for(String s:list) {
	 		System.out.println(s);
	 	}
	 	log.info("verified all product Filter text");
	}
	
	@Test(priority = 10)
	public void verifyProductFooterLinkTest() {
	 	List<String> linklist=productPage.VerifyFooterLinks();
	 	for(String s:linklist) {
	 		System.out.println(s);
	 	}
	 	log.info("verified all footer links text");
	}
	
	@Test(priority = 11)
	public void verifyProductLinkTest() {
	 	boolean found=productPage.VerifyProductLink();
	 	
	 	if(found==true) {
	 		Assert.assertTrue(true);
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 	}
	 	log.info("verified all product links");
	}
	
	@Test(priority = 12)
	public void verifyClickonProductLinkTest() {
	 	productPage.clickonProductLink();
	 	log.info("Click on Product Link");
	}
	
	@Test(priority = 13)
	public void verifysecondProductPageTitleTest() {
		String title= productPage.getTitleProductPage();
		log.info("Second Product Page title Matching ....");
		if(title.equals(ActualLoginTitle)) {
			Assert.assertTrue(true);
			log.info("Second Product Page title Matched ....");
		}
		else {
			Assert.assertTrue(false);
			log.warn("Second Product Page title not Matching ....");
		}
	}
	
	@Test(priority = 14)
	public void verifysecondProductPageUrlTest() {
		String url= productPage.geturlProductPage();
		log.info("Second Product Page url Matching ....");
		if(url.equals(ActualProductPageUrl)) {
		   Assert.assertTrue(true);
		   log.info("Second Product Page url Matched ....");
		}
		else {
			Assert.assertTrue(false);
			log.info("Second Product Page title Matching ....");
		}
	}
	
	@Test(priority = 15)
	public void verifyProductPriceTest() {
	 	String Expectedprice=productPage.VerifyProductPrice();
	 	log.info("Product price Matching ....");
        if(ActualPrice.equals(Expectedprice)) {
        	Assert.assertTrue(true);
        	log.info("Product price Matched....");
        }
        else {
        	Assert.assertTrue(false);
        	log.warn("Product price not Matching ....");
        }
	}
	
	@Test(priority = 16)
	public void ClickOncontinueShoppingButtonTest() {
	 	productPage.clickOnContinueShoppingButton();
	 	log.info("Click on AddToCart Button");
	}
	
	@Test(priority = 17)
	public void VerifyProductinCartButton() {
	 	boolean found= productPage.VerifyProductInCart();
	 	log.info("Product in cart Matching ....");
	 	if(found==true) {
	 		Assert.assertTrue(true);
	 		log.info("Product in cart Matched ....");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.warn("Product in cart not Matching ....");
	 	}
	}
	
	@Test(priority = 18)
	public void clickOnCheckoutButton() {
	 	productPage.clickOnCheckoutButton();
		log.info("click on checkout Button");
	 	
	}
	
	@Test(priority = 19)
	public void AddressPageTitleTest() {
	 	String title= address.getTitleAddressPage();
		log.info("Address Page Title Matching");
	 	if(title.equals(ActualLoginTitle)) {
	 		Assert.assertTrue(true);
	 		log.info("Address Page Title Matched");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.info("Address Page not Title Matching");
	 	}
	}
	
	@Test(priority = 20)
	public void AddressPageUrlTest() {
	 	String url= address.geturlAddressPage();
	 	log.info("Address Page url Matching");
	 	if(url.equals(ActualAddressPageUrl)) {
	 		Assert.assertTrue(true);
	 		log.info("Address Page url Matched");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.info("Address Page Title not Matching");
	 	}
	}
	
	@Test(priority = 21)
	public void AddressPageLogoTest() {
	 	boolean logo= address.verifyAddressPageLogo();
	 	log.info("Address Page logo Matching");
	 	if(logo==true) {
	 		Assert.assertTrue(true);
	 		log.info("Address Page logo Matched");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.info("Address Page logo not Matching");
	 	}
	}
	
	@Test(priority = 22)
	public void AddressPageHeaderTest() {
	 	boolean header= address.verifyAddressPageHeader();
	 	log.info("Address Page Header Matching");
	 	if(header==true) {
	 		Assert.assertTrue(true);
	 		log.info("Address Page Header Matched");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.warn("Address Page Header not Matching");
	 	}
	}
	
	@Test(priority = 23)
	public void AddressPageFooterLinkTest() {
	 	List<String> footerLink= address.getfooterlinks();
	 	
	 	for(String link :footerLink) {
	 		System.out.println(link);
	 	}
	 	log.info("verified All Footer Links");
	}
	
	@Test(priority = 24,dataProvider = "getdata")
	public void AddressPageDataTest(String fn,String ln,String zip) {
	 	address.EnterAddressData(fn, ln, zip);
	 	log.info("Successfullt Sent Address Values");
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] obj=ExcelDataReader.getExcelData();
		return obj;
	}
	
	@Test(priority = 25)
	public void PaymentPageLogoTest() {
	 	 boolean logo= payment.verifyPaymentPageLogo();
	 	log.info("Payement Page logo Matching");
	 	 if(logo==true) {
	 		 Assert.assertTrue(true);
	 		log.info("Payement Page logo Matched");
	 	 }
	 	 else {
	 		 Assert.assertTrue(false);
	 		log.info("Payement Page logo not Matching");
	 	 }
	}
	
	@Test(priority = 26)
	public void PaymentPageHeaderTest() {
	 	 boolean header= payment.verifyPaymentPageHeader();
	 	log.info("Payement Page Header Matching");
	 	 if(header==true) {
	 		 Assert.assertTrue(true);
	 		log.info("Payement Page Header Matched");
	 	 }
	 	 else {
	 		 Assert.assertTrue(false);
	 		log.info("Payement Page Header not Matching");
	 	 }
	}
	
	@Test(priority = 27)
	public void PaymentPageFooterLinkTest() {
	 	 List<String> footerlinks= payment.getPaymentfooterlinks();
	 	 
	 	 for(String links:footerlinks) {
	 		 System.out.println(links);
	 	 }
	 	log.info("Verified all Footer Links");
	}
	
	@Test(priority = 28)
	public void PaymentInformationTextTest() {
	 	 boolean info= payment.VerifyPaymentInformationText();
	 	log.info("Payement Information Matching");
	 	if(info==true) {
	 		Assert.assertTrue(true);
	 		log.info("Payement Information Matched");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.info("Payement Information not Matching");
	 	}
	}
	
	@Test(priority = 29)
	public void ShippingInformationTextTest() {
	 	 boolean info= payment.VerifyshippingInformationText();
	 	log.info("Shipping Information Matching");
	 	if(info==true) {
	 		Assert.assertTrue(true);
	 		log.info("Shipping Information Matched");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.info("Shipping Information not Matching");
	 	}
	}
	
	@Test(priority = 30)
	public void VerifyFInalOrderPriceTest() {
	 	String price= payment.VerifyPaymentPrice();
	 	log.info("Final product price Matching");
	 	if(price.equals(FinalTOtalPrice)) {
	 		Assert.assertTrue(true);
	 		log.info("Final product price Matched");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.info("Final product price not sMatching");
	 	}
	}
	
	@Test(priority = 31)
	public void ConfirmOrderPageTitleTest() {
	 	String title= confirm.getTitle();
		log.info("ConfirmOrder Page Title Matching");
	 	if(title.equals(ActualLoginTitle)) {
	 		Assert.assertTrue(true);
	 		log.info("ConfirmOrder Page Title Matched");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.info("ConfirmOrder Page not Title Matching");
	 	}
	}
	
	@Test(priority = 32)
	public void ConfirmOrderPageUrlTest() {
	 	String url= confirm.geturl();
	 	
	 	log.info("ConfirmOrder Page url Matching");
	 	if(url.equals(ConfirmOrderPageUrl)) {
	 		Assert.assertTrue(true);
	 		log.info("ConfirmOrder Page url Matched");
	 	}
	 	else {
	 		Assert.assertTrue(false);
	 		log.info("ConfirmOrder Page url not Matching");
	 	}
	}
	
	@Test(priority = 33)
	public void ConfirmOrderPageLogoTest() {
	 	 boolean logo= confirm.VerifyconfirmOrderPageLogo();
	 	log.info("ConfirmOrder Page logo Matching");
	 	 if(logo==true) {
	 		 Assert.assertTrue(true);
	 		log.info("ConfirmOrder Page logo Matched");
	 	 }
	 	 else {
	 		 Assert.assertTrue(false);
	 		log.info("ConfirmOrder Page logo not Matching");
	 	 }
	}
	
	@Test(priority = 34)
	public void ConfirmOrderPageHeaderTest() {
	 	 boolean header= confirm.VerifyconfirmOrderPageHeader();
	 	log.info("ConfirmOrder Page Header Matching");
	 	 if(header==true) {
	 		 Assert.assertTrue(true);
	 		log.info("ConfirmOrder Page Headers Matched");
	 	 }
	 	 else {
	 		 Assert.assertTrue(false);
	 		log.info("ConfirmOrder Page Header not Matching");
	 	 }
	}
	
	@Test(priority = 35)
	public void ConfirmOrderPageFooterLinkTest() {
	 	 List<String> footerlinks= confirm.VerifyFooterLinks();
	 	 
	 	 for(String links:footerlinks) {
	 		 System.out.println(links);
	 	 }
	 	log.info("Verified all Footer Links");
	}
	
	@Test(priority = 36)
	public void ConfirmOrderMessageTest() {
	 	 boolean msg= confirm.VerifyconfirmOrderMessage();
	 	log.info("ConfirmOrder Page message Matching");
	 	 if(msg==true) {
	 		 Assert.assertTrue(true);
	 		log.info("ConfirmOrder Page message Matched");
	 	 }
	 	 else {
	 		 Assert.assertTrue(false);
	 		log.info("ConfirmOrder Page message not Matching");
	 	 }
	}
	
	@Test(priority = 37)
	public void ConfirmOrderDeliveryMessageTest() {
	 	 boolean msg= confirm.VerifyconfirmDeleiveryMessage();
	 	log.info("ConfirmOrder Page Deliverymessage Matching");
	 	 if(msg==true) {
	 		 Assert.assertTrue(true);
	 		log.info("ConfirmOrder Page Deliverymessage Matched");
	 	 }
	 	 else {
	 		 Assert.assertTrue(false);
	 		log.info("ConfirmOrder Page Deliverymessage not Matching");
	 	 }
	}
}
