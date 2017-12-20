package za.co.mmagon.jwebswing.plugins.particlejs.options;

import com.fasterxml.jackson.annotation.JsonValue;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

/**
 * The movement direction
 */
public enum ParticleMoveDirection
{
	none,
	top,
	top_right,
	right,
	bottom_right,
	bottom,
	bottom_left,
	left,
	top_left;

	@JsonValue
	@Override
	public String toString()
	{
		return super.toString().replace(StaticStrings.CHAR_UNDERSCORE, StaticStrings.CHAR_DASH);
	}
}
