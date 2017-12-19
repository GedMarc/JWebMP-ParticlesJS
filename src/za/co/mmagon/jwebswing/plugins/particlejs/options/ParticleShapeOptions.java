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

import javax.validation.constraints.NotNull;
import java.util.LinkedHashSet;
import java.util.Set;

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
public class ParticleShapeOptions<J extends ParticleShapeOptions<J>> extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;

	private Set<ParticleShapeTypes> type;


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
	@NotNull
	public Set<ParticleShapeTypes> getType()
	{
		if (type == null)
		{
			type = new LinkedHashSet<>();
		}
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
	public J setType(Set<ParticleShapeTypes> type)
	{
		this.type = type;
		return (J) this;
	}
}
