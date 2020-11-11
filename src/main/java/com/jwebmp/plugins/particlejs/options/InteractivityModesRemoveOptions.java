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
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

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
public class InteractivityModesRemoveOptions<J extends InteractivityModesRemoveOptions<J>>
		extends JavaScriptPart<J>
{

	@JsonProperty("particles_nb")
	private Integer particles;

	/**
	 * Constructs a new options container for particles js
	 */
	public InteractivityModesRemoveOptions()
	{
		//Nothing needed
	}

	/**
	 * Returns the particles setting
	 *
	 * @return
	 */
	public Integer getParticles()
	{
		return particles;
	}

	/**
	 * Sets the particles
	 *
	 * @param particles
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setParticles(Integer particles)
	{
		this.particles = particles;
		return (J) this;
	}
}
