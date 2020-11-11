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
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

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
public class InteractivityModesOptions<J extends InteractivityModesOptions<J>>
		extends JavaScriptPart<J>
{


	private InteractivityModesGrabOptions grab;
	private InteractivityModesBubbleOptions bubble;
	private InteractivityModesRepulseOptions repulse;
	private InteractivityModesPushOptions push;
	private InteractivityModesRemoveOptions remove;

	/**
	 * Constructs a new options container for particles js
	 */
	public InteractivityModesOptions()
	{
		//Nothing needed
	}

	/**
	 * Gets the grab options
	 *
	 * @return
	 */
	@NotNull
	public InteractivityModesGrabOptions getGrab()
	{
		if (grab == null)
		{
			grab = new InteractivityModesGrabOptions();
		}
		return grab;
	}

	/**
	 * Sets the grab options
	 *
	 * @param grab
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setGrab(InteractivityModesGrabOptions grab)
	{
		this.grab = grab;
		return (J) this;
	}

	/**
	 * Gets the bubble options
	 *
	 * @return
	 */
	@NotNull
	public InteractivityModesBubbleOptions getBubble()
	{
		if (bubble == null)
		{
			bubble = new InteractivityModesBubbleOptions();
		}
		return bubble;
	}

	/**
	 * Sets the bubble options
	 *
	 * @param bubble
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBubble(InteractivityModesBubbleOptions bubble)
	{
		this.bubble = bubble;
		return (J) this;
	}

	/**
	 * Gets the repulse options
	 *
	 * @return
	 */
	@NotNull
	public InteractivityModesRepulseOptions getRepulse()
	{
		if (repulse == null)
		{
			repulse = new InteractivityModesRepulseOptions();
		}
		return repulse;
	}

	/**
	 * Gets the repulse options
	 *
	 * @param repulse
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setRepulse(InteractivityModesRepulseOptions repulse)
	{
		this.repulse = repulse;
		return (J) this;
	}

	/**
	 * Gets the push options
	 *
	 * @return
	 */
	@NotNull
	public InteractivityModesPushOptions getPush()
	{
		if (push == null)
		{
			push = new InteractivityModesPushOptions();
		}
		return push;
	}

	/**
	 * Sets the push options
	 *
	 * @param push
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPush(InteractivityModesPushOptions push)
	{
		this.push = push;
		return (J) this;
	}

	/**
	 * Gets the remove options
	 *
	 * @return
	 */
	@NotNull
	public InteractivityModesRemoveOptions getRemove()
	{
		if (remove == null)
		{
			remove = new InteractivityModesRemoveOptions();
		}
		return remove;
	}

	/**
	 * Sets the remove options
	 *
	 * @param remove
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setRemove(InteractivityModesRemoveOptions remove)
	{
		this.remove = remove;
		return (J) this;
	}
}
