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
package za.co.mmagon.jwebswing.plugins.particlejs.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

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
@JsonAutoDetect(fieldVisibility = ANY, getterVisibility = NONE, setterVisibility = NONE)
@JsonInclude(NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ParticleShapeImageOptions<J extends ParticleShapeImageOptions<J>> extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;
	/**
	 * The source
	 */
	@JsonProperty("src")
	private String source;
	/**
	 * The width
	 */
	private Integer width;
	/**
	 * The height
	 */
	private Integer height;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleShapeImageOptions()
	{
		//Nothing needed
	}

	/**
	 * Returns the given source
	 *
	 * @return
	 */
	public String getSource()
	{
		return source;
	}

	/**
	 * Sets the source
	 *
	 * @param source
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setSource(String source)
	{
		this.source = source;
		return (J) this;
	}

	/**
	 * Gets the width
	 *
	 * @return
	 */
	public Integer getWidth()
	{
		return width;
	}

	/**
	 * Sets the width
	 *
	 * @param width
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setWidth(Integer width)
	{
		this.width = width;
		return (J) this;
	}

	/**
	 * Returns the height
	 *
	 * @return
	 */
	public Integer getHeight()
	{
		return height;
	}

	/**
	 * Sets the height of the image
	 *
	 * @param height
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setHeight(Integer height)
	{
		this.height = height;
		return (J) this;
	}
}
