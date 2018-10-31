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
import com.jwebmp.core.htmlbuilder.css.colours.*;
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
public class ParticleColourOptions<J extends ParticleColourOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * The colour value
	 */
	private ColourCSSImpl value;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleColourOptions()
	{
		//Nothing needed
	}

	/**
	 * Returns the colour value associated
	 *
	 * @return
	 */
	public ColourCSSImpl getValue()
	{
		return value;
	}

	/**
	 * Sets the colour
	 *
	 * @param value
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setValue(ColourRGBA value)
	{
		this.value = new ColourCSSImpl(new ColourRGBAImpl().setBlue(value.Blue())
		                                                   .setGreen(value.Green())
		                                                   .setRed(value.Red())
		                                                   .setAlpha(value.Alpha())
		                                                   .toString());
		return (J) this;
	}

	/**
	 * Sets the colour value associated
	 *
	 * @param value
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setValue(ColourCSSImpl value)
	{
		this.value = value;
		return (J) this;
	}

	/**
	 * Sets the colour
	 *
	 * @param value
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setValue(ColourNames value)
	{
		this.value = new ColourCSSImpl(value.toString());
		return (J) this;
	}

	/**
	 * Sets the colour
	 *
	 * @param value
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setValue(ColourHexImpl value)
	{
		this.value = new ColourCSSImpl(value.toString());
		return (J) this;
	}

	/**
	 * Sets the colour
	 *
	 * @param value
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setValue(ColourRGBImpl value)
	{
		this.value = new ColourCSSImpl(new ColourRGBImpl().setBlue(value.Blue())
		                                                  .setGreen(value.Green())
		                                                  .setRed(value.Red())
		                                                  .toString());
		return (J) this;
	}
}
