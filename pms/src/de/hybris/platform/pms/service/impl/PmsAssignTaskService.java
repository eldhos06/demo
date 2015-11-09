/**
 *
 */
package de.hybris.platform.pms.service.impl;

import de.hybris.platform.pms.dao.AssignTaskdao;
import de.hybris.platform.pms.model.ProjectModel;
import de.hybris.platform.pms.model.TaskMasterModel;
import de.hybris.platform.pms.service.AssignTaskService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author eldhos.kurian
 *
 */
public class PmsAssignTaskService implements AssignTaskService
{
	@Autowired
	private AssignTaskdao assignTaskdao;

	public List<TaskMasterModel> getTaskbyProjectId(final String projectId)
	{
		final List<TaskMasterModel> RESULT = assignTaskdao.GetTask(projectId);
		return RESULT;
	}

	public List<ProjectModel> GetProjects()
	{
		final List<ProjectModel> RESULT = assignTaskdao.GetProjects();
		return RESULT;
	}


}
