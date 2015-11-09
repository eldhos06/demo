/**
 *
 */
package de.hybris.platform.pms.service;

import de.hybris.platform.pms.model.AssignedtaskModel;
import de.hybris.platform.pms.model.EmployeemasterModel;
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

	List<AssignedtaskModel> GetAssignedDetails(final String TaskId);

	List<EmployeemasterModel> GetEmployeedetails(final String EmployeeId);

	//String AssignUpdateDetails(final AssignedtaskModel assignedtask);
}
