package Com.QA.Pages;

import java.util.List;

import com.microsoft.playwright.Page;

import Com.QA.Endpoints.Routes;

public class ConfirmedOrderPage extends Routes{

	Page page;
	

	
	public ConfirmedOrderPage(Page page) {
		this.page=page;
	}
	
	public String getTitle() {
		String title=page.title();
		return title;
	}

	public String geturl() {
		String url=page.url();
		return url;
	}

	public boolean VerifyconfirmOrderPageLogo() {
		boolean found;
		if(page.locator(ConfirmedOrderPagePageappLogo).isVisible()) {
			found=true;
		}else {
			found=false;
		}
		return found;
	}
	
	public boolean VerifyconfirmOrderPageHeader() {
		boolean found;
		if(page.locator(ConfirmedOrderPagePageHeader).isVisible()) {
			found=true;
		}else {
			found=false;
		}
		return found;
	}
	
	public List<String> VerifyFooterLinks() {
		List<String> footerLinkList =page.locator(ConfirmedOrderPagefooterLinkss).allInnerTexts();
		return footerLinkList;
	}

	public boolean VerifyconfirmOrderMessage() {
		boolean found;
		if(page.locator(ConfirmOrderMessage).isVisible()) {
			found=true;
			
			if(found==true) {
				String text= page.locator(ConfirmOrderMessage).textContent();
				System.out.println(text);
			}
		}else {
			found=false;
		}
		return found;
	}
	
	public boolean VerifyconfirmDeleiveryMessage() {
		boolean found;
		if(page.locator(ConfirmOrderDelieveryMessage).isVisible()) {
			found=true;
			
			if(found==true) {
				String text= page.locator(ConfirmOrderDelieveryMessage).textContent();
				System.out.println(text);
			}
		}else {
			found=false;
		}
		return found;
	}
}
