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
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

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
public class ParticleShapeOptions<J extends ParticleShapeOptions<J>>
		extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;

	private ParticleShapeTypes type;

	private ParticleShapeStrokeOptions stroke;
	private ParticleShapePolygonOptions polygon;
	private ParticleShapeImageOptions image;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleShapeOptions()
	{
		//Nothing needed
	}

	/**
	 * Gets the particle shape type (ordered)
	 *
	 * @return
	 */

	public ParticleShapeTypes getType()
	{
		return type;
	}

	/**
	 * Gets the type of particle shapre
	 *
	 * @param type
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setType(ParticleShapeTypes type)
	{
		this.type = type;
		return (J) this;
	}

	/**
	 * Gets the stroke
	 *
	 * @return
	 */
	@NotNull
	public ParticleShapeStrokeOptions getStroke()
	{
		if (stroke == null)
		{
			stroke = new ParticleShapeStrokeOptions();
		}
		return stroke;
	}

	/**
	 * Sets the stroke
	 *
	 * @param stroke
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setStroke(ParticleShapeStrokeOptions stroke)
	{
		this.stroke = stroke;
		return (J) this;
	}

	/**
	 * Gets the polygon settings
	 *
	 * @return
	 */
	@NotNull
	public ParticleShapePolygonOptions getPolygon()
	{
		if (polygon == null)
		{
			polygon = new ParticleShapePolygonOptions();
		}
		return polygon;
	}

	/**
	 * Sets the polygon
	 *
	 * @param polygon
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setPolygon(ParticleShapePolygonOptions polygon)
	{
		this.polygon = polygon;
		return (J) this;
	}

	/**
	 * Returns the image
	 *
	 * @return
	 */
	@NotNull
	public ParticleShapeImageOptions getImage()
	{
		if (image == null)
		{
			image = new ParticleShapeImageOptions();
		}
		return image;
	}

	/**
	 * Sets the iamge for the particle shape options
	 *
	 * @param image
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setImage(ParticleShapeImageOptions image)
	{
		this.image = image;
		return (J) this;
	}
}
