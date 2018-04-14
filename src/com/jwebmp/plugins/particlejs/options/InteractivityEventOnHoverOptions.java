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
public class InteractivityEventOnHoverOptions<J extends InteractivityEventOnHoverOptions<J>>
		extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;

	/**
	 * The mode to be applied
	 */
	private Boolean enable;
	/**
	 * The mode to be applied
	 */
	private InteractivityEventOnHoverActionModes mode;

	/**
	 * Constructs a new options container for particles js
	 */
	public InteractivityEventOnHoverOptions()
	{
		//Nothing needed
	}

	/**
	 * Returns if enabled
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
	@NotNull
	public J setEnable(Boolean enable)
	{
		this.enable = enable;
		return (J) this;
	}

	/**
	 * Returns the given mode
	 *
	 * @return
	 */
	public InteractivityEventOnHoverActionModes getMode()
	{
		return mode;
	}

	/**
	 * Sets the given mode
	 *
	 * @param mode
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setMode(InteractivityEventOnHoverActionModes mode)
	{
		this.mode = mode;
		return (J) this;
	}
}
