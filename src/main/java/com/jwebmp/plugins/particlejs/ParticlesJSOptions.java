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
package com.jwebmp.plugins.particlejs;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.particlejs.options.InteractivityOptions;
import com.jwebmp.plugins.particlejs.options.ParticleOptions;

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
public class ParticlesJSOptions<J extends ParticlesJSOptions<J>>
		extends JavaScriptPart<J>
{


	private ParticleOptions particles;
	private InteractivityOptions interactivity;
	@JsonProperty("retina_detect")
	private Boolean retinaDetect;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticlesJSOptions()
	{
		//Nothing needed
	}

	/**
	 * Returns the Partcles
	 *
	 * @return
	 */
	@NotNull
	public ParticleOptions getParticles()
	{
		if (particles == null)
		{
			particles = new ParticleOptions();
		}
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
	public J setParticles(ParticleOptions particles)
	{
		this.particles = particles;
		return (J) this;
	}

	/**
	 * Returns the interactivity
	 *
	 * @return
	 */
	@NotNull
	public InteractivityOptions getInteractivity()
	{
		if (interactivity == null)
		{
			interactivity = new InteractivityOptions();
		}
		return interactivity;
	}

	/**
	 * Sets the interactivity
	 *
	 * @param interactivity
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setInteractivity(InteractivityOptions interactivity)
	{
		this.interactivity = interactivity;
		return (J) this;
	}

	/**
	 * If retina is detected
	 *
	 * @return
	 */
	public Boolean isRetinaDetect()
	{
		return retinaDetect;
	}

	/**
	 * Sets if retina detection must be on
	 *
	 * @param retinaDetect
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setRetinaDetect(Boolean retinaDetect)
	{
		this.retinaDetect = retinaDetect;
		return (J) this;
	}
}
