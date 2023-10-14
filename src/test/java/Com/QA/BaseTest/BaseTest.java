package Com.QA.BaseTest;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import Com.QA.Factory.PlawrightFactory;
import Com.QA.Pages.AddressPage;
import Com.QA.Pages.ConfirmedOrderPage;
import Com.QA.Pages.LoginPage;
import Com.QA.Pages.PaymentPage;
import Com.QA.Pages.ProductPage;

public class BaseTest {

	PlawrightFactory pfFactory;
	protected Page page;
	protected Properties pro;
	protected LoginPage login;
	protected ProductPage productPage;
	protected AddressPage address;
	protected PaymentPage payment;
	protected Logger log;
	BrowserContext context;
	protected ConfirmedOrderPage confirm;
	
	protected String ActualLoginurl="https://www.saucedemo.com/";
	protected String ActualLoginTitle="Swag Labs";
	protected String accepteduserpaswordLogin="Accepted usernames are:\r\n"
			+ "standard_user\r\n"
			+ "locked_out_user\r\n"
			+ "problem_user\r\n"
			+ "performance_glitch_user\r\n"
			+ "error_user\r\n"
			+ "\r\n"
			+ "Password for all users:\r\n"
			+ "secret_sauce";
	
	protected String ProductPageUrl="https://www.saucedemo.com/inventory.html";
    protected String ActualPrice="$29.99";
	protected String ActualProductPageUrl="https://www.saucedemo.com/inventory-item.html?id=4";
    protected String ActualAddressPageUrl="https://www.saucedemo.com/checkout-step-one.html";
    protected String FinalTOtalPrice="Total: $32.39";
    protected String ConfirmOrderPageUrl="https://www.saucedemo.com/checkout-complete.html";
	
	@BeforeTest
	public void setup() {
		pfFactory=new PlawrightFactory();
		page=pfFactory.init_browser();
	    pro=pfFactory.initialize_properties();
	    login=new LoginPage(page);
	    
	    productPage=new ProductPage(page);
	    
	    address=new AddressPage(page);
	    
	    payment=new PaymentPage(page);
	    
	    confirm=new ConfirmedOrderPage(page);
	    
	    log=LogManager.getLogger(this.getClass());
	    log.debug("Debugging.....");
	    
	}
	
	@AfterTest
	public void closedown() {
		page.context().browser().close();
		log.warn("Close Down Executed");
	}
}
