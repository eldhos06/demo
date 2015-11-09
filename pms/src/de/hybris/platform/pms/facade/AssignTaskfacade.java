/**
 *
 */
package de.hybris.platform.pms.facade;

import de.hybris.platform.pms.data.AssignedTaskData;
import de.hybris.platform.pms.data.ProjectData;

import java.util.List;


/**
 * @author eldhos.kurian
 *
 */
public interface AssignTaskfacade
{
	List<AssignedTaskData> getTaskbyProjectId(final String projectId);

	List<ProjectData> GetProjects();
}
