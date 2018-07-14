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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

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
public class ParticleSizeAnimationOptions<J extends ParticleSizeAnimationOptions<J>>
		extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;
	private Boolean enable;
	private Integer speed;
	@JsonProperty("size_min")
	private Double sizeMin;
	private Boolean sync;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleSizeAnimationOptions()
	{
		//Nothing needed
	}

	/**
	 * Returns if enabled
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
	 * Returns the speed
	 *
	 * @return
	 */
	public Integer getSpeed()
	{
		return speed;
	}

	/**
	 * Sets this speed
	 *
	 * @param speed
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setSpeed(Integer speed)
	{
		this.speed = speed;
		return (J) this;
	}

	/**
	 * Returns the opactiy minimum
	 *
	 * @return
	 */
	public Double getSizeMin()
	{
		return sizeMin;
	}

	/**
	 * Sets the opactiy minimum
	 *
	 * @param sizeMin
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setSizeMin(Double sizeMin)
	{
		this.sizeMin = sizeMin;
		return (J) this;
	}

	/**
	 * Gets the sync
	 *
	 * @return
	 */
	public Boolean getSync()
	{
		return sync;
	}

	/**
	 * Sets the sync
	 *
	 * @param sync
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setSync(Boolean sync)
	{
		this.sync = sync;
		return (J) this;
	}
}
