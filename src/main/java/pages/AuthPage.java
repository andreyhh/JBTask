package pages;

import base.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AuthPage extends BasePage {
	
	private static final String LOGIN = "username";
	private static final String PASSWORD = "password";
	
	public AuthPage clickSwitchToBasicAuth() {
		$(By.id("loginPasswordSwitch")).click();
		return this;
	}
	public AuthPage inputLogin(String login) {
		clearAndType($(By.id(LOGIN)), login);
		return this;
	}
	
	public AuthPage inputPassword(String password) {
		clearAndType($(By.id(PASSWORD)), password);
		return this;
	}
	
	public AuthPage clickToLoginButton() {
		$(By.name("submitLogin")).click();
		return this;
	}
}
