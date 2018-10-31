/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.particlejs.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.css.colours.ColourCSSImpl;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.*;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

/**
 * All the options for ParticleOptions js
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		<p>
 * @since 2017/12/19
 */
@JsonAutoDetect(fieldVisibility = ANY,
		getterVisibility = NONE,
		setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParticleShapeStrokeOptions<J extends ParticleShapeStrokeOptions<J>>
		extends JavaScriptPart<J>
{

	/**
	 * The width to display
	 */
	private Integer width;
	/**
	 * The colour to display
	 */
	private ColourCSSImpl color;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleShapeStrokeOptions()
	{
		//Nothing needed
	}

	/**
	 * Returns the width applied
	 *
	 * @return
	 */
	public Integer getWidth()
	{
		return width;
	}

	/**
	 * The set width of the stroke
	 *
	 * @param width
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setWidth(Integer width)
	{
		this.width = width;
		return (J) this;
	}

	/**
	 * The colour for the
	 *
	 * @return
	 */
	public ColourCSSImpl getColor()
	{
		return color;
	}

	/**
	 * Sets the colour for the
	 *
	 * @param color
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setColor(ColourCSSImpl color)
	{
		this.color = color;
		return (J) this;
	}
}
