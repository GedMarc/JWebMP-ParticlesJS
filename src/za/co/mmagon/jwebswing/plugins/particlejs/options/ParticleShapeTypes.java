package za.co.mmagon.jwebswing.plugins.particlejs.options;

/**
 * The shapes available for particles
 */
public enum ParticleShapeTypes
{
	Circle,
	Edge,
	Triangle,
	Polygon,
	Star,
	Image;

	@Override
	public String toString()
	{
		return super.toString().toLowerCase();
	}
}
