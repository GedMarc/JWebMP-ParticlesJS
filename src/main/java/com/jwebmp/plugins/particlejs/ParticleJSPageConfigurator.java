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

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Particle JS",
		pluginDescription = "The ParticleJS library ",
		pluginUniqueName = "jwebswing-particlejs",
		pluginVersion = "1.6.4",
		pluginCategories = "graphics,particlejs,ui,web ui, framework",
		pluginSubtitle = "A lightweight JavaScript library for creating particles.",
		pluginSourceUrl = "http://vincentgarreau.com/particles.js/",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-ParticlesJS/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-ParticlesJS",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "http://vincentgarreau.com/particles.js/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/ParticleJS.jar/download")
@ComponentInformation(name = "Particle JS",
		description = "A lightweight JavaScript library for creating particles.",
		url = "http://vincentgarreau.com/particles.js/")
public class ParticleJSPageConfigurator
		implements IPageConfigurator<ParticleJSPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new ParticleJSPageConfigurator
	 */
	public ParticleJSPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return ParticleJSPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		ParticleJSPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(ParticleJSReferencePool.ParticlesJS.getJavaScriptReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return ParticleJSPageConfigurator.enabled;
	}
}
