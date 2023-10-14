package Com.QA.Pages;

import java.util.List;

import com.microsoft.playwright.Page;

import Com.QA.Endpoints.Routes;

public class PaymentPage extends Routes {

	Page page;
	
	
	
	public PaymentPage(Page page) {
		this.page=page;
	}
	
	
	public boolean verifyPaymentPageLogo() {
		boolean found;
		
		if(page.locator(PaymentPageappLogo).isVisible()) {
			 found=true;
			 
			 if(found==true) {
				 String text=page.locator(PaymentPageappLogo).textContent();
				 System.out.println("Address Page Logo :"+text);
			 }
		}
		else {
			found=false;
		}
		return found;
	}
	
	public boolean verifyPaymentPageHeader() {
		boolean found;
		
		if(page.locator(PayementPageHeader).isVisible()) {
			 found=true;
			 
			 if(found==true) {
				 String text=page.locator(PayementPageHeader).textContent();
				 System.out.println("Address Page Header :"+text);
			 }
		}
		else {
			found=false;
		}
		return found;
	}
	
	public List<String> getPaymentfooterlinks() {
		List<String> linksList=page.locator(footerLinkss).allInnerTexts();
		return linksList;
	}
	
	public boolean VerifyPaymentInformationText() {
		boolean found;
		
		if(page.locator(PaymentInformation).first().isVisible()) {
			found=true;
			
			if(found==true) {
				String paymentinfo= page.locator(PaymentInformation).first().textContent();
				System.out.println(paymentinfo);
			}
		}
		else {
			found=false;
		}
		return found;
	}
	
	public boolean VerifyshippingInformationText() {
		boolean found;
		
		if(page.locator(ShippingInformation).isVisible()) {
			found=true;
			
			if(found==true) {
				String Shippinginfo= page.locator(ShippingInformation).textContent();
				System.out.println(Shippinginfo);
			}
		}
		else {
			found=false;
		}
		return found;
	}
	
	public String VerifyPaymentPrice() {
		String price= page.locator(TotalPriceInformation).textContent();
		page.click(finishButton);
		return price;
	}
}
