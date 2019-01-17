/*
 * Copyright (C) 2017 GedMarc
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
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class ParticleLineLinkedOptions<J extends ParticleLineLinkedOptions<J>>
		extends JavaScriptPart<J>
{

	/**
	 * Enabled
	 */
	private Boolean enable;
	/**
	 * The distance
	 */
	private Integer distance;
	/**
	 * The colour of the line
	 */
	@JsonProperty("color")
	private ColourCSSImpl colour;
	/**
	 * The opacity of the line
	 */
	private Double opacity;
	/**
	 * The width of the line
	 */
	private Integer width;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleLineLinkedOptions()
	{
		//Nothing needed
	}

	/**
	 * Gets enabled
	 *
	 * @return
	 */
	public Boolean getEnable()
	{
		return enable;
	}

	/**
	 * Sets enabled
	 *
	 * @param enable
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setEnable(Boolean enable)
	{
		this.enable = enable;
		return (J) this;
	}

	/**
	 * Gets the distance
	 *
	 * @return
	 */
	public Integer getDistance()
	{
		return distance;
	}

	/**
	 * Sets the distance
	 *
	 * @param distance
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setDistance(Integer distance)
	{
		this.distance = distance;
		return (J) this;
	}

	/**
	 * Gets the colour
	 *
	 * @return
	 */
	public ColourCSSImpl getColour()
	{
		return colour;
	}

	/**
	 * Sets the colour
	 *
	 * @param colour
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setColour(ColourCSSImpl colour)
	{
		this.colour = colour;
		return (J) this;
	}

	/**
	 * Gets the opacity
	 *
	 * @return
	 */
	public Double getOpacity()
	{
		return opacity;
	}

	/**
	 * Sets the opacity
	 *
	 * @param opacity
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setOpacity(Double opacity)
	{
		this.opacity = opacity;
		return (J) this;
	}

	/**
	 * Gets the width
	 *
	 * @return
	 */
	public Integer getWidth()
	{
		return width;
	}

	/**
	 * Gets the width
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
}
