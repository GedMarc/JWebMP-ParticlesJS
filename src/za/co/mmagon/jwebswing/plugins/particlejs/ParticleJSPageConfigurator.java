package za.co.mmagon.jwebswing.plugins.particlejs;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Particle JS",
		pluginDescription = "The ParticleJS library ",
		pluginUniqueName = "jwebswing-particlejs",
		pluginVersion = "1.6.4",
		pluginCategories = "graphics,particlejs,ui,web ui, framework",
		pluginSubtitle = "A lightweight JavaScript library for creating particles.",
		pluginSourceUrl = "http://vincentgarreau.com/particles.js/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-ParticlesJS/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-ParticlesJS",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://vincentgarreau.com/particles.js/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/ParticleJS.jar/download"
)
@ComponentInformation(name = "Particle JS",
		description = "A lightweight JavaScript library for creating particles.",
		url = "http://vincentgarreau.com/particles.js/")
public class ParticleJSPageConfigurator extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new ParticleJSPageConfigurator
	 */
	public ParticleJSPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody().addJavaScriptReference(ParticleJSReferencePool.ParticlesJS.getJavaScriptReference());
		}
		return page;
	}
}
