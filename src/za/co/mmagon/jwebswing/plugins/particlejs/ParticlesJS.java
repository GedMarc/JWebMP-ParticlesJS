package za.co.mmagon.jwebswing.plugins.particlejs;

import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

import javax.annotation.Nullable;
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
	public ParticlesJS(String id)
	{
		super();
		setID(id);
		feature = new ParticlesJSFeature(this);
		addFeature(feature);
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

	/**
	 * Gets the options for particles
	 *
	 * @return
	 */
	@Nullable
	@Override
	public ParticlesJSOptions getOptions()
	{
		return getFeature().getOptions();
	}

	/**
	 * Sets the options for particles
	 *
	 * @param options
	 *
	 * @return
	 */

	public ParticlesJS setOptions(ParticlesJSOptions options)
	{
		getFeature().setOptions(options);
		return this;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof ParticlesJS))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		ParticlesJS<?> that = (ParticlesJS<?>) o;

		return getFeature().equals(that.getFeature());
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + getFeature().hashCode();
		return result;
	}
}
