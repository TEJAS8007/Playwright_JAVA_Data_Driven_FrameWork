package Com.QA.Pages;

import java.util.List;

import com.microsoft.playwright.Page;

import Com.QA.Endpoints.Routes;

public class AddressPage extends Routes{

	Page page;
	
	
	public AddressPage(Page page) {
		this.page=page;
	}
	

	public String getTitleAddressPage() {
		String title=page.title();
		return title;
	}

	public String geturlAddressPage() {
		String url=page.url();
		return url;
	}
	
	
	public boolean verifyAddressPageLogo() {
		boolean found;
		
		if(page.locator(AddressPageappLogo).isVisible()) {
			 found=true;
			 
			 if(found==true) {
				 String text=page.locator(AddressPageappLogo).textContent();
				 System.out.println("Address Page Logo :"+text);
			 }
		}
		else {
			found=false;
		}
		return found;
	}
	
	public boolean verifyAddressPageHeader() {
		boolean found;
		
		if(page.locator(AddressPageHeader).isVisible()) {
			 found=true;
			 
			 if(found==true) {
				 String text=page.locator(AddressPageHeader).textContent();
				 System.out.println("Address Page Header :"+text);
			 }
		}
		else {
			found=false;
		}
		return found;
	}
	
	public List<String> getfooterlinks() {
		List<String> linksList=page.locator(footerLinks).allInnerTexts();
		return linksList;
	}
	
	public void EnterAddressData(String firstname,String lastName,String zipCode) {
		page.fill(FirstNamefield, firstname);
		page.fill(LastNamefield, lastName);
		page.fill(zipcodefield, zipCode);
		page.click(continueButton);
	}
	
	
}
