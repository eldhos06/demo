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
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.pms.constants.PmsConstants;
import de.hybris.platform.pms.jalo.Employeemaster;
import de.hybris.platform.pms.jalo.Project;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem TaskMaster}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTaskMaster extends GenericItem
{
	/** Qualifier of the <code>TaskMaster.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>TaskMaster.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>TaskMaster.project</code> attribute **/
	public static final String PROJECT = "project";
	/** Qualifier of the <code>TaskMaster.employeemaster</code> attribute **/
	public static final String EMPLOYEEMASTER = "employeemaster";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n EMPLOYEEMASTER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTaskMaster> EMPLOYEEMASTERHANDLER = new BidirectionalOneToManyHandler<GeneratedTaskMaster>(
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
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(PROJECT, AttributeMode.INITIAL);
		tmp.put(EMPLOYEEMASTER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		EMPLOYEEMASTERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.description</code> attribute.
	 * @return the description - TaskDescription
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.description</code> attribute.
	 * @return the description - TaskDescription
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.description</code> attribute. 
	 * @param value the description - TaskDescription
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.description</code> attribute. 
	 * @param value the description - TaskDescription
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.employeemaster</code> attribute.
	 * @return the employeemaster
	 */
	public Employeemaster getEmployeemaster(final SessionContext ctx)
	{
		return (Employeemaster)getProperty( ctx, EMPLOYEEMASTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.employeemaster</code> attribute.
	 * @return the employeemaster
	 */
	public Employeemaster getEmployeemaster()
	{
		return getEmployeemaster( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.employeemaster</code> attribute. 
	 * @param value the employeemaster
	 */
	public void setEmployeemaster(final SessionContext ctx, final Employeemaster value)
	{
		EMPLOYEEMASTERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.employeemaster</code> attribute. 
	 * @param value the employeemaster
	 */
	public void setEmployeemaster(final Employeemaster value)
	{
		setEmployeemaster( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.project</code> attribute.
	 * @return the project - Project
	 */
	public Project getProject(final SessionContext ctx)
	{
		return (Project)getProperty( ctx, PROJECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.project</code> attribute.
	 * @return the project - Project
	 */
	public Project getProject()
	{
		return getProject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.project</code> attribute. 
	 * @param value the project - Project
	 */
	public void setProject(final SessionContext ctx, final Project value)
	{
		setProperty(ctx, PROJECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.project</code> attribute. 
	 * @param value the project - Project
	 */
	public void setProject(final Project value)
	{
		setProject( getSession().getSessionContext(), value );
	}
	
}
