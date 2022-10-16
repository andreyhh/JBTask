package base;

import com.codeborne.selenide.SelenideElement;

import java.util.Objects;

import static org.openqa.selenium.Keys.BACK_SPACE;

public class BasePage {
	
	protected void clearAndType(SelenideElement element, String inputString) {
		int length = Objects.requireNonNull(element.getValue()).length();
		for (int i = 0; i < length; i++) element.sendKeys(BACK_SPACE);
		element.append(inputString);
	}
}
