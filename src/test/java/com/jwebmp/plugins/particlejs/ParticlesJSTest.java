package com.jwebmp.plugins.particlejs;

import com.jwebmp.core.Page;
import org.junit.jupiter.api.Test;

class ParticlesJSTest
{

	@Test
	public void testMe()
	{
		ParticlesJS<?> particlesJS = new ParticlesJS("particleView");
		System.out.println(particlesJS.renderJavascript());

		Page<?> p = new Page();
		p.getBody()
		 .add(particlesJS);
		p.getOptions()
		 .setDynamicRender(false);
		System.out.println(p.toString(0));

	}
}
