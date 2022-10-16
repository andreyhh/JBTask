package ui;

import base.BaseUiTest;
import org.junit.jupiter.api.Test;
import pages.AuthPage;
import pages.ProjectsPage;

import static com.codeborne.selenide.Selenide.page;
import static enums.Credentials.TESTUSER;

public class LoginTest extends BaseUiTest {
	
	@Test
	public void testLogin() {
		var testUserLogin = TESTUSER.getLogin();
		openMainPage();
		page(AuthPage.class)
				.clickSwitchToBasicAuth()
				.inputLogin(testUserLogin)
				.inputPassword(TESTUSER.getPassword())
				.clickToLoginButton();
		page(ProjectsPage.class)
				.checkUserTitle(testUserLogin);
	}
}
