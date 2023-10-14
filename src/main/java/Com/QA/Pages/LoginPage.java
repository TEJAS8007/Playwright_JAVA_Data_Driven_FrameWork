package Com.QA.Pages;

import java.util.List;

import com.microsoft.playwright.Page;

import Com.QA.Endpoints.Routes;

public class LoginPage extends Routes{

	Page page;

	
	public LoginPage(Page page) {
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

	public boolean VerifyLoginLogo() {
		boolean found;
		if(page.locator(VerifyLoginLogo).isVisible()) {
			found=true;
		}else {
			found=false;
		}
		return found;
	}

	public List<String> validateUserNamePassword() {
		List<String> usernamePasswordList=page.locator(AcceptedUsernamePassword).allInnerTexts();
		System.out.println("Accepted UserName And Password : "+usernamePasswordList.size());
		return usernamePasswordList;
	}

	public void PerformLoginAction(String username,String password) {
        page.locator(usernameBox).fill(username);
        page.locator(passwordBox).fill(password);
        page.click(loginButton);
	}

}
