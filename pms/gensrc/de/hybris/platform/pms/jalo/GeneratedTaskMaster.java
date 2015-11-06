/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 6 Nov, 2015 1:47:34 PM                      ---
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
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.description</code> attribute.
	 * @return the description - TaskDescription
	 */
	public Integer getDescription(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.description</code> attribute.
	 * @return the description - TaskDescription
	 */
	public Integer getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.description</code> attribute. 
	 * @return the description - TaskDescription
	 */
	public int getDescriptionAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDescription( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaskMaster.description</code> attribute. 
	 * @return the description - TaskDescription
	 */
	public int getDescriptionAsPrimitive()
	{
		return getDescriptionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.description</code> attribute. 
	 * @param value the description - TaskDescription
	 */
	public void setDescription(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.description</code> attribute. 
	 * @param value the description - TaskDescription
	 */
	public void setDescription(final Integer value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.description</code> attribute. 
	 * @param value the description - TaskDescription
	 */
	public void setDescription(final SessionContext ctx, final int value)
	{
		setDescription( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaskMaster.description</code> attribute. 
	 * @param value the description - TaskDescription
	 */
	public void setDescription(final int value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
}
