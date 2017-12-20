package za.co.mmagon.jwebswing.plugins.particlejs.themes;

import org.junit.jupiter.api.Test;
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
}
