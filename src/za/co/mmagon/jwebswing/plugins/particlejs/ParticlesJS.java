package za.co.mmagon.jwebswing.plugins.particlejs;

import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

import javax.validation.constraints.NotNull;

@ComponentInformation(name = "ParticlesJS"
		, description = "A lightweight JavaScript library for creating particles http://vincentgarreau.com/particles.js/"
		, url = "https://github.com/GedMarc/JWebSwing-ParticlesJS")
public class ParticlesJS<J extends ParticlesJS<J>> extends DivSimple<J>
{
	/**
	 * My Feature
	 */
	private final ParticlesJSFeature feature;
	
	
	/**
	 * Configures the page for this component
	 */
	public ParticlesJS()
	{
		addFeature(feature = new ParticlesJSFeature(this));
	}
	
	@Override
	public void init()
	{
		if (!isInitialized())
		{
		
		}
		super.init();
	}
	
	/**
	 * Returns this feature
	 *
	 * @return
	 */
	@NotNull
	public ParticlesJSFeature getFeature()
	{
		return feature;
	}
}
