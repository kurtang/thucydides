package net.thucy.bdd.steps;

import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.annotations.Step;
import net.thucy.bdd.pages.LoginPage;
import net.thucy.bdd.pages.MainHomePage;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AdminSteps  extends ScenarioSteps {
	
	LoginPage loginPage;
	MainHomePage homePage;

	@Step
	public void enter_login(String login) {
		loginPage.enter_login(login);
	}
	
	@Step
	public void enter_password(String password) {
		loginPage.enter_password(password);
	}
	
	@Step
	public void click_login_button(String s) {
		loginPage.click_login();		
	}
	
	@Step
	public void should_see_error_message(String message) {
		assertThat(loginPage.getErrorMessage(), is(message));
	}
	
	@Step
	public void at_login_page(String s) {
		loginPage.open();
	}
	
	@Step
	public void at_home_page(String s) {
		assertThat(homePage.hasMenu(), is(true));
	}
}
