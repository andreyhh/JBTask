package base;

import io.swagger.client.ApiClient;

public class BaseApiTest {
	
	protected static ApiClient initTSApiClient() {
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(apiClient.getBasePath() + "/httpAuth");
		apiClient.setUsername("testuser");
		apiClient.setPassword("testuser");
		return apiClient;
	}
}
