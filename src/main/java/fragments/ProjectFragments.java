package fragments;

import io.swagger.client.model.NewProjectDescription;

public class ProjectFragments {

	public NewProjectDescription getNewProjectDescription(String projectId, String projectName) {
		NewProjectDescription newProjectDescription = new NewProjectDescription();
		newProjectDescription.setId(projectId); // добавить рандом UUID.randomUUID().toString()
		newProjectDescription.setName(projectName);
		return newProjectDescription;
	}
}
