package net.thucy.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.WebElementFacade;

@DefaultUrl("http://sport-tv.com.ua/tst/administrator/index.php")

public class MainHomePage extends PageObject {
	@FindBy(id="module-menu")
    private WebElementFacade mainMenu;
	
	public boolean hasMenu() {
		return mainMenu.isPresent();
	}
	
	public void openCalendar() {
		
	}
}
