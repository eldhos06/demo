/**
 *
 */
package de.hybris.platform.pms.service;

import de.hybris.platform.pms.model.ProjectModel;
import de.hybris.platform.pms.model.TaskMasterModel;

import java.util.List;


/**
 * @author eldhos.kurian
 *
 */
public interface AssignTaskService
{
	List<TaskMasterModel> getTaskbyProjectId(final String projectId);

	List<ProjectModel> GetProjects();
}
