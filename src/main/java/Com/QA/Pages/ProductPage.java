package Com.QA.Pages;

import java.util.List;

import com.microsoft.playwright.Page;

import Com.QA.Endpoints.Routes;

public class ProductPage extends Routes{

	Page page;
	
	
	
	public ProductPage(Page page) {
		this.page=page;
	}
	
	public String getTitleProductPage() {
		String title=page.title();
		return title;
	}

	public String geturlProductPage() {
		String url=page.url();
		return url;
	}
	
	public boolean VerifyProductPageLogo() {
		boolean found;
		if(page.locator(ProductPageLogo).isVisible()) {
			found=true;
			
			if(found==true) {
				String textLogo=page.locator(ProductPageLogo).textContent();
				System.out.println(textLogo);
			}
		}
		else {
			found=false;
		}
		return found;
	}
	
	public List<String> getProductFiterTexts(){
		List<String> productfilter=page.locator(ProductFilter).allInnerTexts();
		return productfilter;
	}
	
	public List<String> VerifyFooterLinks() {
		List<String> footerLinkList =page.locator(footerLink).allInnerTexts();
		return footerLinkList;
	}
	
	public boolean VerifyProductLink() {
		boolean found;
		
		if(page.locator(product).first().isVisible()) {
			found=true;
			
			if(found==true) {
				String text= page.locator(product).textContent();
				System.out.println(text);
			}
		}
		
		else {
			found=false;
		}
		return found;
	}
	
	public void clickonProductLink() {
		page.click(productLink);
	}
	
	public String VerifyProductPrice() {
		String price=page.locator(productPrice).textContent();
		System.out.println("Price of Product : " +price);
		return price;
	}
	
	public void clickOnContinueShoppingButton() {
		page.click(AddtocartButton);
		page.click(cartbutton);
	}
	
	public boolean VerifyProductInCart() {
		boolean found;
		if(page.locator(ProductinCart).isVisible()) {
			found=true;
		}
		else {
			found=false;
		}
		return found;
	}
	
	public void clickOnCheckoutButton() {
		page.click(checkoutbutton);
	}
}
