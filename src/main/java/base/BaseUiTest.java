package base;


import static com.codeborne.selenide.Selenide.open;

public class BaseUiTest {
	
	private final String BASE_PATH = "https://andreytask.teamcity.com";
	
	public void openMainPage() {
		open(BASE_PATH);
	}
}
