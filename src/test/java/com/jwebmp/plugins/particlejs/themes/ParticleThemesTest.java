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

import com.jwebmp.plugins.particlejs.ParticlesJS;
import com.jwebmp.plugins.particlejs.ParticlesJSOptions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ParticleThemesTest
{

	@Test
	void getParticleConfiguration() throws IOException
	{
		ParticleThemes th = ParticleThemes.SlowFadingTheme;
		ParticlesJSOptions opt = th.getParticleConfiguration();
		System.out.println(opt);

		th = ParticleThemes.SlowMovingConstellations;
		opt = th.getParticleConfiguration();
		System.out.println(opt);
	}

	@Test
	void testactual()
	{
		ParticlesJS particles = new ParticlesJS("particles123");
		try
		{
			ParticlesJSOptions opts = ParticleThemes.SlowFadingTheme.getParticleConfiguration();
			particles.getFeature()
			         .setOptions(opts);

			//System.out.println(opts);

			System.out.println(particles.renderJavascript());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
