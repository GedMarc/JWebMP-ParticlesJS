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

import javax.validation.constraints.NotNull;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

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
public class ParticleOpacityOptions<J extends ParticleOpacityOptions<J>>
		extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;
	/**
	 * The given value
	 */
	private Double value;
	/**
	 * If it is random
	 */
	private Boolean random;
	/**
	 * Any applied animations
	 */
	@JsonProperty("anim")
	private ParticleOpacityAnimationOptions animations;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleOpacityOptions()
	{
		//Nothing needed
	}

	/**
	 * Gets the value
	 *
	 * @return
	 */
	public Double getValue()
	{
		return value;
	}

	/**
	 * Sets value
	 *
	 * @param value
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setValue(Double value)
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
	 * Returns the animations
	 *
	 * @return
	 */
	@NotNull
	public ParticleOpacityAnimationOptions getAnimations()
	{
		if (animations == null)
		{
			animations = new ParticleOpacityAnimationOptions();
		}
		return animations;
	}

	/**
	 * Gets the animations
	 *
	 * @param animations
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setAnimations(ParticleOpacityAnimationOptions animations)
	{
		this.animations = animations;
		return (J) this;
	}
}
