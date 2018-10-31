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
public class ParticleOptions<J extends ParticleOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * The number of particles
	 */
	private ParticleNumberOptions number;
	/**
	 * The colour of the particles
	 */
	@JsonProperty("color")
	private ParticleColourOptions colour;
	/**
	 * The shape of the particles
	 */
	private ParticleShapeOptions shape;
	/**
	 * The opacity of the particles
	 */
	private ParticleOpacityOptions opacity;
	/**
	 * The size of the particles
	 */
	private ParticleSizeOptions size;
	/**
	 * The line for the particles
	 */
	@JsonProperty("line_linked")
	private ParticleLineLinkedOptions lineLinks;
	/**
	 * Movement options for the particles
	 */
	private ParticleMoveOptions move;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleOptions()
	{
		//Nothing needed
	}

	/**
	 * Returns the number of particle options
	 *
	 * @return
	 */
	@NotNull
	public ParticleNumberOptions getNumber()
	{
		if (number == null)
		{
			number = new ParticleNumberOptions();
		}
		return number;
	}

	/**
	 * Sets the number of particles options
	 *
	 * @param number
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNumber(ParticleNumberOptions number)
	{
		this.number = number;
		return (J) this;
	}

	/**
	 * Gets the colour options
	 *
	 * @return
	 */
	@NotNull
	public ParticleColourOptions getColour()
	{
		if (colour == null)
		{
			colour = new ParticleColourOptions();
		}
		return colour;
	}

	/**
	 * Sets the colour options
	 *
	 * @param colour
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setColour(ParticleColourOptions colour)
	{
		this.colour = colour;
		return (J) this;
	}

	/**
	 * Gets the shape options
	 *
	 * @return
	 */
	@NotNull
	public ParticleShapeOptions getShape()
	{
		if (shape == null)
		{
			shape = new ParticleShapeOptions();
		}
		return shape;
	}

	/**
	 * Sets the shape options
	 *
	 * @param shape
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setShape(ParticleShapeOptions shape)
	{
		this.shape = shape;
		return (J) this;
	}

	/**
	 * Gets the opacity options
	 *
	 * @return
	 */
	@NotNull
	public ParticleOpacityOptions getOpacity()
	{
		if (opacity == null)
		{
			opacity = new ParticleOpacityOptions();
		}
		return opacity;
	}

	/**
	 * Sets the opacity options
	 *
	 * @param opacity
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setOpacity(ParticleOpacityOptions opacity)
	{
		this.opacity = opacity;
		return (J) this;
	}

	/**
	 * Gets the size options
	 *
	 * @return
	 */
	@NotNull
	public ParticleSizeOptions getSize()
	{
		if (size == null)
		{
			size = new ParticleSizeOptions();
		}
		return size;
	}

	/**
	 * Sets the size options
	 *
	 * @param size
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSize(ParticleSizeOptions size)
	{
		this.size = size;
		return (J) this;
	}

	/**
	 * Gets the Line link options
	 *
	 * @return
	 */
	@NotNull
	public ParticleLineLinkedOptions getLineLinks()
	{
		if (lineLinks == null)
		{
			lineLinks = new ParticleLineLinkedOptions();
		}
		return lineLinks;
	}

	/**
	 * Sets the line link options
	 *
	 * @param lineLinks
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLineLinks(ParticleLineLinkedOptions lineLinks)
	{
		this.lineLinks = lineLinks;
		return (J) this;
	}

	/**
	 * Gets the movement options
	 *
	 * @return
	 */
	@NotNull
	public ParticleMoveOptions getMove()
	{
		if (move == null)
		{
			move = new ParticleMoveOptions();
		}
		return move;
	}

	/**
	 * Sets the movement options
	 *
	 * @param move
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMove(ParticleMoveOptions move)
	{
		this.move = move;
		return (J) this;
	}
}
