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
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import javax.validation.constraints.NotNull;

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
public class InteractivityModesRepulseOptions<J extends InteractivityModesRepulseOptions<J>>
		extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;
	/**
	 * The distance
	 */
	private Integer distance;
	/**
	 * The duration
	 */
	private Double duration;

	/**
	 * Constructs a new options container for particles js
	 */
	public InteractivityModesRepulseOptions()
	{
		//Nothing needed
	}

	/**
	 * Returns the distance
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
	@NotNull
	public J setDistance(Integer distance)
	{
		this.distance = distance;
		return (J) this;
	}

	/**
	 * Gets the duration
	 *
	 * @return
	 */
	public Double getDuration()
	{
		return duration;
	}

	/**
	 * Sets the duration
	 *
	 * @param duration
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDuration(Double duration)
	{
		this.duration = duration;
		return (J) this;
	}
}
