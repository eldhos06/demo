/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 9 Nov, 2015 6:18:35 PM                      ---
 * ----------------------------------------------------------------
 *  
 * [y] hybris Platform
 *  
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 *  
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *  
 */
package de.hybris.platform.pms.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.pms.constants.PmsConstants;
import de.hybris.platform.pms.jalo.Assignedtask;
import de.hybris.platform.pms.jalo.Employeemaster;
import de.hybris.platform.pms.jalo.Project;
import de.hybris.platform.pms.jalo.Stadium;
import de.hybris.platform.pms.jalo.State;
import de.hybris.platform.pms.jalo.TaskMaster;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>PmsManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPmsManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Assignedtask createAssignedtask(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PmsConstants.TC.ASSIGNEDTASK );
			return (Assignedtask)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Assignedtask : "+e.getMessage(), 0 );
		}
	}
	
	public Assignedtask createAssignedtask(final Map attributeValues)
	{
		return createAssignedtask( getSession().getSessionContext(), attributeValues );
	}
	
	public Employeemaster createEmployeemaster(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PmsConstants.TC.EMPLOYEEMASTER );
			return (Employeemaster)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Employeemaster : "+e.getMessage(), 0 );
		}
	}
	
	public Employeemaster createEmployeemaster(final Map attributeValues)
	{
		return createEmployeemaster( getSession().getSessionContext(), attributeValues );
	}
	
	public Project createProject(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PmsConstants.TC.PROJECT );
			return (Project)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Project : "+e.getMessage(), 0 );
		}
	}
	
	public Project createProject(final Map attributeValues)
	{
		return createProject( getSession().getSessionContext(), attributeValues );
	}
	
	public Stadium createStadium(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PmsConstants.TC.STADIUM );
			return (Stadium)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Stadium : "+e.getMessage(), 0 );
		}
	}
	
	public Stadium createStadium(final Map attributeValues)
	{
		return createStadium( getSession().getSessionContext(), attributeValues );
	}
	
	public State createState(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PmsConstants.TC.STATE );
			return (State)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating State : "+e.getMessage(), 0 );
		}
	}
	
	public State createState(final Map attributeValues)
	{
		return createState( getSession().getSessionContext(), attributeValues );
	}
	
	public TaskMaster createTaskMaster(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( PmsConstants.TC.TASKMASTER );
			return (TaskMaster)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TaskMaster : "+e.getMessage(), 0 );
		}
	}
	
	public TaskMaster createTaskMaster(final Map attributeValues)
	{
		return createTaskMaster( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return PmsConstants.EXTENSIONNAME;
	}
	
}
