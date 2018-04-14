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
public class ParticleMoveOptions<J extends ParticleMoveOptions<J>>
		extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;

	private Boolean enable;
	private Integer speed;
	private ParticleMoveDirection direction;
	private Boolean random;
	private Boolean straight;
	@JsonProperty("out_mode")
	private ParticleMoveOutMode outMode;
	private Boolean bounce;
	@JsonProperty("attract")
	private ParticleMoveAttractionOptions attraction;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleMoveOptions()
	{
		//Nothing needed
	}

	/**
	 * If enabled
	 *
	 * @return
	 */
	public Boolean getEnable()
	{
		return enable;
	}

	/**
	 * If enabled
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
	 * returns the speed
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
	public J setSpeed(Integer speed)
	{
		this.speed = speed;
		return (J) this;
	}

	/**
	 * Returns the assigned direction
	 *
	 * @return
	 */
	public ParticleMoveDirection getDirection()
	{
		return direction;
	}

	/**
	 * Sets the assigned direction
	 *
	 * @param direction
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setDirection(ParticleMoveDirection direction)
	{
		this.direction = direction;
		return (J) this;
	}

	/**
	 * If is random
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
	 * If it moves straight
	 *
	 * @return
	 */
	public Boolean getStraight()
	{
		return straight;
	}

	/**
	 * If it moves straight
	 *
	 * @param straight
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setStraight(Boolean straight)
	{
		this.straight = straight;
		return (J) this;
	}

	/**
	 * Returns the out mode
	 *
	 * @return
	 */
	public ParticleMoveOutMode getOutMode()
	{
		return outMode;
	}

	/**
	 * Sets the out mode
	 *
	 * @param outMode
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOutMode(ParticleMoveOutMode outMode)
	{
		this.outMode = outMode;
		return (J) this;
	}

	/**
	 * Gets if bounce
	 *
	 * @return
	 */
	public Boolean getBounce()
	{
		return bounce;
	}

	/**
	 * Sets if bounce
	 *
	 * @param bounce
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBounce(Boolean bounce)
	{
		this.bounce = bounce;
		return (J) this;
	}

	@NotNull
	public ParticleMoveAttractionOptions getAttraction()
	{
		if (attraction == null)
		{
			attraction = new ParticleMoveAttractionOptions();
		}
		return attraction;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setAttraction(ParticleMoveAttractionOptions attraction)
	{
		this.attraction = attraction;
		return (J) this;
	}
}
