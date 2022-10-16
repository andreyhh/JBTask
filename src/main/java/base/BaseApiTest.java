package base;

import io.swagger.client.ApiClient;

import static enums.Credentials.TESTUSER;

public class BaseApiTest {
	
	protected static ApiClient initTSApiClient() {
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(apiClient.getBasePath() + "/httpAuth");
		apiClient.setUsername(TESTUSER.getLogin());
		apiClient.setPassword(TESTUSER.getPassword());
		return apiClient;
	}
}
