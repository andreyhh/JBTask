package pages;

import base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage extends BasePage {
	
	public ProjectsPage checkUserTitle(String userTitle) {
		$("button[title='" + userTitle + "']").shouldBe(visible);
		return this;
	}
}
