package za.co.mmagon.jwebswing.plugins.particlejs.options;

import com.fasterxml.jackson.annotation.JsonValue;

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

	@JsonValue
	@Override
	public String toString()
	{
		return super.toString().toLowerCase();
	}
}
