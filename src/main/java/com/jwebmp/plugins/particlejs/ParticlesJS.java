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

package com.jwebmp.plugins.particlejs;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.plugins.ComponentInformation;

import jakarta.validation.constraints.NotNull;

@ComponentInformation(name = "ParticlesJS",
		description = "A lightweight JavaScript library for creating particles http://vincentgarreau.com/particles.js/",
		url = "https://github.com/GedMarc/JWebMP-ParticlesJS")
public class ParticlesJS<J extends ParticlesJS<J>>
		extends DivSimple<J>
{
	/**
	 * My Feature
	 */
	private final ParticlesJSFeature feature;

	/**
	 * Configures the page for this component
	 */
	public ParticlesJS(String id)
	{
		super();
		setID(id);
		feature = new ParticlesJSFeature(this);
		addFeature(feature);
	}

	@Override
	public ParticlesJSOptions<?> getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Returns this feature
	 *
	 * @return
	 */
	@NotNull
	public ParticlesJSFeature getFeature()
	{
		return feature;
	}

}
