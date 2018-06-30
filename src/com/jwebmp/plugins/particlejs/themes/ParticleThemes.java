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

package com.jwebmp.plugins.particlejs.themes;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jwebmp.FileTemplates;
import com.jwebmp.guicedinjection.GuiceContext;
import com.jwebmp.plugins.particlejs.ParticlesJSOptions;

import javax.validation.constraints.NotNull;
import java.io.IOException;

public enum ParticleThemes
{
	SlowFadingTheme("slowfadingparticles.json"),
	SlowMovingConstellations("slowmovingconstellations.json");

	private String jsonFile;

	ParticleThemes()
	{
	}

	ParticleThemes(String jsonFile)
	{
		this.jsonFile = jsonFile;
	}

	@NotNull
	public String getJsonFile()
	{
		return jsonFile;
	}

	/**
	 * Returns a valid particle configuraton
	 *
	 * @return
	 *
	 * @throws IOException
	 */
	public ParticlesJSOptions getParticleConfiguration() throws IOException
	{
		StringBuilder file = FileTemplates.getFileTemplate(ParticleThemes.class, name(), jsonFile);
		return GuiceContext.getInstance(ObjectMapper.class)
		                   .readValue(file.toString(), ParticlesJSOptions.class);
	}
}

