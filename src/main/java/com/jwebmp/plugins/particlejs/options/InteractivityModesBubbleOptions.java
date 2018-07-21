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
public class InteractivityModesBubbleOptions<J extends InteractivityModesBubbleOptions<J>>
		extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;

	private Integer distance;
	/**
	 * The size of the movement
	 */
	private Integer size;
	/**
	 * The duration
	 */
	private Integer duration;
	/**
	 * Opacity of the movement
	 */
	private Double opacity;
	/**
	 * The speed
	 */
	private Integer speed;

	/**
	 * Constructs a new options container for particles js
	 */
	public InteractivityModesBubbleOptions()
	{
		//Nothing needed
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
	@NotNull
	public J setDistance(Integer distance)
	{
		this.distance = distance;
		return (J) this;
	}

	/**
	 * Sets the size
	 *
	 * @return
	 */
	public Integer getSize()
	{
		return size;
	}

	/**
	 * Gets the size
	 *
	 * @param size
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSize(Integer size)
	{
		this.size = size;
		return (J) this;
	}

	/**
	 * Gets the duration
	 *
	 * @return
	 */
	public Integer getDuration()
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
	public J setDuration(Integer duration)
	{
		this.duration = duration;
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
	@NotNull
	public J setOpacity(Double opacity)
	{
		this.opacity = opacity;
		return (J) this;
	}

	/**
	 * Gets the speed
	 *
	 * @return
	 */
	public Integer getSpeed()
	{
		return speed;
	}

	/**
	 * Sets the speed
	 *
	 * @param speed
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSpeed(Integer speed)
	{
		this.speed = speed;
		return (J) this;
	}
}
