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
public class InteractivityEventsOptions<J extends InteractivityEventsOptions<J>> extends JavaScriptPart<J>
{
	private static final long serialVersionUID = 1L;

	private InteractivityEventOnHoverOptions onhover;
	private InteractivityEventOnClickOptions onclick;
	private Boolean resize;

	/**
	 * Constructs a new options container for particles js
	 */
	public InteractivityEventsOptions()
	{
		//Nothing needed
	}

	@NotNull
	public InteractivityEventOnHoverOptions getOnhover()
	{
		if (onhover == null)
		{
			onhover = new InteractivityEventOnHoverOptions();
		}
		return onhover;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setOnhover(InteractivityEventOnHoverOptions onhover)
	{
		this.onhover = onhover;
		return (J) this;
	}

	@NotNull
	public InteractivityEventOnClickOptions getOnclick()
	{
		if (onclick == null)
		{
			onclick = new InteractivityEventOnClickOptions();
		}
		return onclick;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setOnclick(InteractivityEventOnClickOptions onclick)
	{
		this.onclick = onclick;
		return (J) this;
	}

	public Boolean getResize()
	{
		return resize;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J setResize(Boolean resize)
	{
		this.resize = resize;
		return (J) this;
	}
}
