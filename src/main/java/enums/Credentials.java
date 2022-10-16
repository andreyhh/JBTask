package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Credentials {
	TESTUSER("testuser", "testuser");
	
	private final String login;
	private final String password;
}
