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
import de.hybris.platform.pms.facade.AssignTaskfacade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class pmsController
{

	@Autowired
	private AssignTaskfacade assignTaskfacade;

	@RequestMapping(value = "/pmsTask")
	public String showPmsTask(final Model model)
	{
		final List<AssignedTaskData> tasks = assignTaskfacade.getTaskbyProjectId("8796093097871");
		final List<ProjectData> projects = assignTaskfacade.GetProjects();
		model.addAttribute("tasks", tasks);
		model.addAttribute("projects", projects);
		return "AssignTask";
	}

}