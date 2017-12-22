package za.co.mmagon.jwebswing.plugins.particlejs.themes;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.plugins.particlejs.ParticlesJS;
import za.co.mmagon.jwebswing.plugins.particlejs.ParticlesJSOptions;

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
			particles.getFeature().setOptions(opts);

			//System.out.println(opts);

			System.out.println(particles.renderJavascript());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}


}
