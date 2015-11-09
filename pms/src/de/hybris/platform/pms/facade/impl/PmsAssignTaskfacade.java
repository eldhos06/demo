/**
 *
 */
package de.hybris.platform.pms.facade.impl;

import de.hybris.platform.pms.data.AssignedTaskData;
import de.hybris.platform.pms.data.ProjectData;
import de.hybris.platform.pms.facade.AssignTaskfacade;
import de.hybris.platform.pms.model.ProjectModel;
import de.hybris.platform.pms.model.TaskMasterModel;
import de.hybris.platform.pms.service.AssignTaskService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author eldhos.kurian
 *
 */
public class PmsAssignTaskfacade implements AssignTaskfacade
{
	@Autowired
	private AssignTaskService assignTaskService;

	public List<AssignedTaskData> getTaskbyProjectId(final String projectId)
	{
		final List<TaskMasterModel> TaskMasterModelresult = assignTaskService.getTaskbyProjectId(projectId);

		final List<AssignedTaskData> dataCollloction = new ArrayList<AssignedTaskData>();
		if (!TaskMasterModelresult.isEmpty())
		{
			for (final TaskMasterModel taskMasterModel : TaskMasterModelresult)
			{
				final AssignedTaskData data = new AssignedTaskData();
				data.setTaskPK(taskMasterModel.getPk().toString());
				data.setName(taskMasterModel.getCode().toString());
				data.setAssignedPK("0");
				data.setAssignedTo("0");
				data.setStatus("");
				dataCollloction.add(data);
			}
		}
		return dataCollloction;
	}

	public List<ProjectData> GetProjects()
	{
		final List<ProjectModel> RESULTs = assignTaskService.GetProjects();
		final List<ProjectData> projectDatas = new ArrayList<ProjectData>();
		for (final ProjectModel sm : RESULTs)
		{
			final ProjectData sfd = new ProjectData();
			sfd.setProjectPK(sm.getPk().toString());
			sfd.setName(sm.getName());
			projectDatas.add(sfd);
		}
		return projectDatas;

	}
}
