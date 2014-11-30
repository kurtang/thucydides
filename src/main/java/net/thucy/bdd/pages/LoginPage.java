package net.thucy.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://sport-tv.com.ua/tst/administrator")
public class LoginPage extends PageObject{
	@FindBy(name = "username")
	private WebElementFacade usernameInput;
	
	@FindBy(name = "passwd")
	private WebElementFacade passwordInput;
	
	@FindBy(id="login-error-message")
    private WebElement errorMessage;
	
	public void enter_login(String login) {
		usernameInput.type(login);
	}
	
	public void enter_password(String password) {
		passwordInput.type(password);
	}
	
	public void click_login() {
		passwordInput.submit();
	}
	
	public String getErrorMessage() {
		return errorMessage.getText();
	}
	
	public boolean atLoginPage() {
		return usernameInput.isCurrentlyVisible();
	}
}
