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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.pms.constants.PmsConstants;
import de.hybris.platform.pms.jalo.State;
import de.hybris.platform.pms.jalo.TaskMaster;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Employeemaster}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEmployeemaster extends GenericItem
{
	/** Qualifier of the <code>Employeemaster.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>Employeemaster.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Employeemaster.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>Employeemaster.imagepath</code> attribute **/
	public static final String IMAGEPATH = "imagepath";
	/** Qualifier of the <code>Employeemaster.state</code> attribute **/
	public static final String STATE = "state";
	/** Qualifier of the <code>Employeemaster.taskMasters</code> attribute **/
	public static final String TASKMASTERS = "taskMasters";
	/**
	* {@link OneToManyHandler} for handling 1:n TASKMASTERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TaskMaster> TASKMASTERSHANDLER = new OneToManyHandler<TaskMaster>(
	PmsConstants.TC.TASKMASTER,
	false,
	"employeemaster",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(IMAGEPATH, AttributeMode.INITIAL);
		tmp.put(STATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.address</code> attribute.
	 * @return the address - Address
	 */
	public String getAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.address</code> attribute.
	 * @return the address - Address
	 */
	public String getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.address</code> attribute. 
	 * @param value the address - Address
	 */
	public void setAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.address</code> attribute. 
	 * @param value the address - Address
	 */
	public void setAddress(final String value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.imagepath</code> attribute.
	 * @return the imagepath - ImagePath
	 */
	public String getImagepath(final SessionContext ctx)
	{
		return (String)getProperty( ctx, IMAGEPATH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.imagepath</code> attribute.
	 * @return the imagepath - ImagePath
	 */
	public String getImagepath()
	{
		return getImagepath( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.imagepath</code> attribute. 
	 * @param value the imagepath - ImagePath
	 */
	public void setImagepath(final SessionContext ctx, final String value)
	{
		setProperty(ctx, IMAGEPATH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.imagepath</code> attribute. 
	 * @param value the imagepath - ImagePath
	 */
	public void setImagepath(final String value)
	{
		setImagepath( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.name</code> attribute.
	 * @return the name - EmployeeName
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.name</code> attribute.
	 * @return the name - EmployeeName
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.name</code> attribute. 
	 * @param value the name - EmployeeName
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.name</code> attribute. 
	 * @param value the name - EmployeeName
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.state</code> attribute.
	 * @return the state - State
	 */
	public State getState(final SessionContext ctx)
	{
		return (State)getProperty( ctx, STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.state</code> attribute.
	 * @return the state - State
	 */
	public State getState()
	{
		return getState( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.state</code> attribute. 
	 * @param value the state - State
	 */
	public void setState(final SessionContext ctx, final State value)
	{
		setProperty(ctx, STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.state</code> attribute. 
	 * @param value the state - State
	 */
	public void setState(final State value)
	{
		setState( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.taskMasters</code> attribute.
	 * @return the taskMasters
	 */
	public Collection<TaskMaster> getTaskMasters(final SessionContext ctx)
	{
		return TASKMASTERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employeemaster.taskMasters</code> attribute.
	 * @return the taskMasters
	 */
	public Collection<TaskMaster> getTaskMasters()
	{
		return getTaskMasters( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.taskMasters</code> attribute. 
	 * @param value the taskMasters
	 */
	public void setTaskMasters(final SessionContext ctx, final Collection<TaskMaster> value)
	{
		TASKMASTERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employeemaster.taskMasters</code> attribute. 
	 * @param value the taskMasters
	 */
	public void setTaskMasters(final Collection<TaskMaster> value)
	{
		setTaskMasters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taskMasters. 
	 * @param value the item to add to taskMasters
	 */
	public void addToTaskMasters(final SessionContext ctx, final TaskMaster value)
	{
		TASKMASTERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taskMasters. 
	 * @param value the item to add to taskMasters
	 */
	public void addToTaskMasters(final TaskMaster value)
	{
		addToTaskMasters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taskMasters. 
	 * @param value the item to remove from taskMasters
	 */
	public void removeFromTaskMasters(final SessionContext ctx, final TaskMaster value)
	{
		TASKMASTERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taskMasters. 
	 * @param value the item to remove from taskMasters
	 */
	public void removeFromTaskMasters(final TaskMaster value)
	{
		removeFromTaskMasters( getSession().getSessionContext(), value );
	}
	
}
