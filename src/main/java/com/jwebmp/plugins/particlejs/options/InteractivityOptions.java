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
public class InteractivityOptions<J extends InteractivityOptions<J>>
		extends JavaScriptPart<J>
{

	@JsonProperty("detect_on")
	private InteractivityDetectOn detectOn;
	/**
	 * The events listing
	 */
	private InteractivityEventsOptions events;
	/**
	 * The modes listing
	 */
	private InteractivityModesOptions modes;

	/**
	 * Constructs a new options container for particles js
	 */
	public InteractivityOptions()
	{
		//Nothing needed
	}

	/**
	 * Gets the detect on
	 *
	 * @return
	 */
	public InteractivityDetectOn getDetectOn()
	{
		return detectOn;
	}

	/**
	 * Sets the detect on
	 *
	 * @param detectOn
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDetectOn(InteractivityDetectOn detectOn)
	{
		this.detectOn = detectOn;
		return (J) this;
	}

	/**
	 * Gets the events
	 *
	 * @return
	 */
	@NotNull
	public InteractivityEventsOptions getEvents()
	{
		if (events == null)
		{
			events = new InteractivityEventsOptions();
		}
		return events;
	}

	/**
	 * Sets the events
	 *
	 * @param events
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setEvents(InteractivityEventsOptions events)
	{
		this.events = events;
		return (J) this;
	}

	/**
	 * Gets the modes
	 *
	 * @return
	 */
	@NotNull
	public InteractivityModesOptions getModes()
	{
		if (modes == null)
		{
			modes = new InteractivityModesOptions();
		}
		return modes;
	}

	/**
	 * Sets the modes
	 *
	 * @param modes
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setModes(InteractivityModesOptions modes)
	{
		this.modes = modes;
		return (J) this;
	}
}
