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
public class ParticleSizeOptions<J extends ParticleSizeOptions<J>>
		extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;

	private Integer value;
	private Boolean random;
	@JsonProperty("anim")
	private ParticleSizeAnimationOptions animations;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleSizeOptions()
	{
		//Nothing needed
	}

	/**
	 * Gets the given value
	 *
	 * @return
	 */
	public Integer getValue()
	{
		return value;
	}

	/**
	 * Sets the given value
	 *
	 * @param value
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setValue(Integer value)
	{
		this.value = value;
		return (J) this;
	}

	/**
	 * Gets if random
	 *
	 * @return
	 */
	public Boolean getRandom()
	{
		return random;
	}

	/**
	 * Sets if random
	 *
	 * @param random
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setRandom(Boolean random)
	{
		this.random = random;
		return (J) this;
	}

	/**
	 * Gets the animarions
	 *
	 * @return
	 */
	@NotNull
	public ParticleSizeAnimationOptions getAnimations()
	{
		if (animations == null)
		{
			animations = new ParticleSizeAnimationOptions();
		}
		return animations;
	}

	/**
	 * Sets the eanimations for size changes
	 *
	 * @param animations
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setAnimations(ParticleSizeAnimationOptions animations)
	{
		this.animations = animations;
		return (J) this;
	}
}
