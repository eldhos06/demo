/**
 *
 */
package de.hybris.platform.pmsfrontend.controller;

/**
 * @author eldhos.kurian
 *
 */
import de.hybris.platform.pms.data.AssignedTaskData;
import de.hybris.platform.pms.data.ProjectData;
import de.hybris.platform.pms.enums.Status;
import de.hybris.platform.pms.facade.AssignTaskfacade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class pmsController
{

	@Autowired
	private AssignTaskfacade assignTaskfacade;

	@RequestMapping(value = "/pmsTask/{ProjectId}", method = RequestMethod.POST)
	public String showPmsTask(@PathVariable final String ProjectId, final Model model)
	{
		final List<AssignedTaskData> tasks = assignTaskfacade.getTaskbyProjectId(ProjectId);
		final List<ProjectData> projects = assignTaskfacade.GetProjects();
		model.addAttribute("tasks", tasks);
		model.addAttribute("projects", projects);
		model.addAttribute("Status", Status.values());
		return "AssignTask";
	}

	@RequestMapping(value = "/pmsTask", method = RequestMethod.GET)
	public String showPmsTask(final Model model)
	{
		final List<ProjectData> projects = assignTaskfacade.GetProjects();
		model.addAttribute("projects", projects);
		return "AssignTask";
	}

	@RequestMapping(value = "/pmsTask/{taskid}/{assignedid}/{status}", method = RequestMethod.POST)
	public String AddUpdate(@PathVariable final String taskid, @PathVariable final String assignedid,
			@PathVariable final String status, final Model model)
	{
		return "Saved Successfully";
	}
}