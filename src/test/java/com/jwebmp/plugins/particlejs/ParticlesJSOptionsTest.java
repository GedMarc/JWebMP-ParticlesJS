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

import com.jwebmp.core.htmlbuilder.css.colours.ColourCSSImpl;
import com.jwebmp.plugins.particlejs.options.InteractivityEventOnClickActionModes;
import org.junit.jupiter.api.Test;

class ParticlesJSOptionsTest
{

	@Test
	public void testBasic()
	{
		ParticlesJSOptions opts = new ParticlesJSOptions();
		opts.setRetinaDetect(true);
		opts.getParticles()
		    .getColour()
		    .setValue(new ColourCSSImpl("#ffffff"));
		opts.getParticles()
		    .getLineLinks()
		    .setDistance(100);
		opts.getParticles()
		    .getMove()
		    .getAttraction()
		    .setRotateY(500);
		opts.getParticles()
		    .getNumber()
		    .getDensity()
		    .setEnable(true);
		opts.getParticles()
		    .getOpacity()
		    .getAnimations()
		    .setOpacityMin(0.1);
		opts.getParticles()
		    .getOpacity()
		    .setRandom(true);
		opts.getInteractivity()
		    .getEvents()
		    .getOnclick()
		    .setEnable(true);
		opts.getInteractivity()
		    .getEvents()
		    .getOnclick()
		    .setMode(InteractivityEventOnClickActionModes.remove);
		opts.getInteractivity()
		    .getModes()
		    .getBubble()
		    .setDistance(100);

		System.out.println(opts.toString());
	}
}
