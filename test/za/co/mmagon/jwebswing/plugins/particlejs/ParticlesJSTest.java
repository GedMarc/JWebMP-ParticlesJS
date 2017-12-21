package za.co.mmagon.jwebswing.plugins.particlejs;

import org.junit.jupiter.api.Test;

class ParticlesJSTest
{

	@Test
	public void testMe()
	{
		ParticlesJS particlesJS = new ParticlesJS("particleView");
		System.out.println(particlesJS.renderJavascript());
	}
}
