package za.co.mmagon.jwebswing.plugins.particlejs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.Page;

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
