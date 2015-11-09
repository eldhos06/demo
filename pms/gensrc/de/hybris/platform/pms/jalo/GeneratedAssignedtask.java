/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 9 Nov, 2015 3:12:14 PM                      ---
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

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.pms.constants.PmsConstants;
import de.hybris.platform.pms.jalo.Employeemaster;
import de.hybris.platform.pms.jalo.TaskMaster;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Assignedtask}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssignedtask extends GenericItem
{
	/** Qualifier of the <code>Assignedtask.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Assignedtask.employeemaster</code> attribute **/
	public static final String EMPLOYEEMASTER = "employeemaster";
	/** Qualifier of the <code>Assignedtask.taskMaster</code> attribute **/
	public static final String TASKMASTER = "taskMaster";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(EMPLOYEEMASTER, AttributeMode.INITIAL);
		tmp.put(TASKMASTER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Assignedtask.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Assignedtask.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Assignedtask.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Assignedtask.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Assignedtask.employeemaster</code> attribute.
	 * @return the employeemaster - State
	 */
	public Employeemaster getEmployeemaster(final SessionContext ctx)
	{
		return (Employeemaster)getProperty( ctx, EMPLOYEEMASTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Assignedtask.employeemaster</code> attribute.
	 * @return the employeemaster - State
	 */
	public Employeemaster getEmployeemaster()
	{
		return getEmployeemaster( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Assignedtask.employeemaster</code> attribute. 
	 * @param value the employeemaster - State
	 */
	public void setEmployeemaster(final SessionContext ctx, final Employeemaster value)
	{
		setProperty(ctx, EMPLOYEEMASTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Assignedtask.employeemaster</code> attribute. 
	 * @param value the employeemaster - State
	 */
	public void setEmployeemaster(final Employeemaster value)
	{
		setEmployeemaster( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Assignedtask.taskMaster</code> attribute.
	 * @return the taskMaster - State
	 */
	public TaskMaster getTaskMaster(final SessionContext ctx)
	{
		return (TaskMaster)getProperty( ctx, TASKMASTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Assignedtask.taskMaster</code> attribute.
	 * @return the taskMaster - State
	 */
	public TaskMaster getTaskMaster()
	{
		return getTaskMaster( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Assignedtask.taskMaster</code> attribute. 
	 * @param value the taskMaster - State
	 */
	public void setTaskMaster(final SessionContext ctx, final TaskMaster value)
	{
		setProperty(ctx, TASKMASTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Assignedtask.taskMaster</code> attribute. 
	 * @param value the taskMaster - State
	 */
	public void setTaskMaster(final TaskMaster value)
	{
		setTaskMaster( getSession().getSessionContext(), value );
	}
	
}
