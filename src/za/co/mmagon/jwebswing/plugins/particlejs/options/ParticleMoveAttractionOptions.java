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
public class ParticleMoveAttractionOptions<J extends ParticleMoveAttractionOptions<J>> extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;

	private Boolean enable;
	private Integer rotateX;
	private Integer rotateY;

	/**
	 * Constructs a new options container for particles js
	 */
	public ParticleMoveAttractionOptions()
	{
		//Nothing needed
	}

	/**
	 * Sets enabled
	 *
	 * @return
	 */
	public Boolean getEnable()
	{
		return enable;
	}

	/**
	 * Sets enabled
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
	 * Gets the rotation of x
	 *
	 * @return
	 */
	public Integer getRotateX()
	{
		return rotateX;
	}

	/**
	 * Gets the rotation of x
	 *
	 * @param rotateX
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setRotateX(Integer rotateX)
	{
		this.rotateX = rotateX;
		return (J) this;
	}

	/**
	 * Gets the rotation of y
	 *
	 * @return
	 */
	public Integer getRotateY()
	{
		return rotateY;
	}

	/**
	 * Gets the rotation of x
	 *
	 * @param rotateY
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setRotateY(Integer rotateY)
	{
		this.rotateY = rotateY;
		return (J) this;
	}
}
