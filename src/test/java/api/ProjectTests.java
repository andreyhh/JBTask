package api;

import base.BaseApiTest;
import fragments.ProjectFragments;
import io.swagger.client.ApiClient;
import io.swagger.client.api.ProjectApi;
import io.swagger.client.model.*;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectTests extends BaseApiTest {
    
    private final ApiClient tSApiClient = initTSApiClient();
    
    @Test
    public void createNewProjectTest() throws Exception {
        var projectId = getRandomUUID();
        var projectDescription = getNewProjectDescription(projectId, getRandomUUID());
        Project expectedProject = new ProjectApi(tSApiClient).addProject(projectDescription);
        Project actualProject = new ProjectApi(tSApiClient).getProject(projectId, null);
        assertThat(actualProject).isEqualTo(expectedProject);
    }
    
    private NewProjectDescription getNewProjectDescription(String projectId, String projectName) {
        return new ProjectFragments().getNewProjectDescription(projectId, projectName);
    }
    
    private String getRandomUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }
}
