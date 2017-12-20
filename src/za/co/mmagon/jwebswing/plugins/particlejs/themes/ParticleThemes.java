package za.co.mmagon.jwebswing.plugins.particlejs.themes;

import com.fasterxml.jackson.databind.ObjectMapper;
import za.co.mmagon.FileTemplates;
import za.co.mmagon.guiceinjection.GuiceContext;
import za.co.mmagon.jwebswing.plugins.particlejs.ParticlesJSOptions;

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
		ParticlesJSOptions options = GuiceContext.getInstance(ObjectMapper.class).readValue(file.toString(), ParticlesJSOptions.class);
		return options;
	}
}

