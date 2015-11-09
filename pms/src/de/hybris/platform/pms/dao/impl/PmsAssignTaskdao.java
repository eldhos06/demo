/**
 *
 */
package de.hybris.platform.pms.dao.impl;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.pms.dao.AssignTaskdao;
import de.hybris.platform.pms.model.AssignedtaskModel;
import de.hybris.platform.pms.model.EmployeemasterModel;
import de.hybris.platform.pms.model.ProjectModel;
import de.hybris.platform.pms.model.TaskMasterModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author eldhos.kurian
 *
 */
public class PmsAssignTaskdao implements AssignTaskdao
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	@Override
	public List<TaskMasterModel> GetTask(final String projectId)
	{
		// Build a query for the flexible search.
		final String queryString = //
		"SELECT {p:" + TaskMasterModel.PK + "} "//
				+ "FROM {" + TaskMasterModel._TYPECODE + " AS p}  where {project}=" + projectId + "";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		// Note that we could specify paginating logic by providing a start and count variable (commented out below)
		// This can provide a safeguard against returning very large amounts of data, or hogging the database when there are
		// for example millions of items being returned.
		// As we know that there are only a few persisted stadiums in this use case we do not need to provide this.

		//query.setStart(start);
		//query.setCount(count);

		// Return the list of StadiumModels.
		return flexibleSearchService.<TaskMasterModel> search(query).getResult();
	}

	@Override
	public List<ProjectModel> GetProjects()
	{
		// Build a query for the flexible search.
		final String queryString = //
		"SELECT {p:" + ProjectModel.PK + "},{p:" + ProjectModel.NAME + "} "//
				+ "FROM {" + ProjectModel._TYPECODE + " AS p} ";

		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		// Note that we could specify paginating logic by providing a start and count variable (commented out below)
		// This can provide a safeguard against returning very large amounts of data, or hogging the database when there are
		// for example millions of items being returned.
		// As we know that there are only a few persisted stadiums in this use case we do not need to provide this.

		//query.setStart(start);
		//query.setCount(count);

		// Return the list of StadiumModels.
		return flexibleSearchService.<ProjectModel> search(query).getResult();
	}


	@Override
	public List<AssignedtaskModel> GetAssignedDetails(final String TaskId)
	{
		// Build a query for the flexible search.
		final String queryString = //
		"SELECT {p:" + AssignedtaskModel.EMPLOYEEMASTER + "},{p:" + AssignedtaskModel.TASKMASTER + "},{p:" + AssignedtaskModel.PK
				+ "} "//
				+ " FROM {" + AssignedtaskModel._TYPECODE + " AS p}  where {" + AssignedtaskModel.TASKMASTER + "}=" + TaskId + "";




		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		// Note that we could specify paginating logic by providing a start and count variable (commented out below)
		// This can provide a safeguard against returning very large amounts of data, or hogging the database when there are
		// for example millions of items being returned.
		// As we know that there are only a few persisted stadiums in this use case we do not need to provide this.

		//query.setStart(start);
		//query.setCount(count);

		// Return the list of StadiumModels.
		return flexibleSearchService.<AssignedtaskModel> search(query).getResult();
	}

	@Override
	public List<EmployeemasterModel> GetEmployeedetails(final String EmployeeId)
	{
		// Build a query for the flexible search.
		final String queryString = //
		"SELECT * FROM {" + EmployeeModel._TYPECODE + " AS p} ";
		if (Integer.parseInt(EmployeeId) > 0)
		{
			queryString += " where {PK}=" + EmployeeId + "";
		}




		final FlexibleSearchQuery query = new FlexibleSearchQuery(queryString);

		// Note that we could specify paginating logic by providing a start and count variable (commented out below)
		// This can provide a safeguard against returning very large amounts of data, or hogging the database when there are
		// for example millions of items being returned.
		// As we know that there are only a few persisted stadiums in this use case we do not need to provide this.

		//query.setStart(start);
		//query.setCount(count);

		// Return the list of StadiumModels.
		return flexibleSearchService.<EmployeemasterModel> search(query).getResult();
	}
}