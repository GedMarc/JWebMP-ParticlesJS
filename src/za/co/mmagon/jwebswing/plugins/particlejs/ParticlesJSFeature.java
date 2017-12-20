/*
 * Copyright (C) 2017 Marc Magon
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
package za.co.mmagon.jwebswing.plugins.particlejs;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.Feature;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;

/**
 * Adds on a ToolTip, String for custom text using header theme, Div for custom contents
 *
 * @author MMagon
 * @version 1.0
 * @since 2013/01/16
 */
public class ParticlesJSFeature extends Feature<ParticlesJSOptions, ParticlesJSFeature> implements ParticlesJSFeatures, GlobalFeatures
{

	private static final long serialVersionUID = 1L;

	private ParticlesJSOptions options;

	/**
	 * Constructs a new Tooltip ComponentFeatureBase for a component. Adds the tooltip text as the Title attribute to the component
	 * <p>
	 *
	 * @param forComponent
	 */
	public ParticlesJSFeature(Component forComponent)
	{
		super("ParticlesJS");
		setComponent(forComponent);
	}

	/**
	 * Returns all the tooltip options
	 * <p>
	 *
	 * @return
	 */
	@Override
	public ParticlesJSOptions getOptions()
	{
		if (options == null)
		{
			options = new ParticlesJSOptions();
		}
		return options;
	}

	@Override
	public void assignFunctionsToComponent()
	{
		String requiredString = "particlesJS.load('" + getComponent().getID() + "'," + getOptions() + ", function() {" + getNewLine() +
				                        "  console.log('callback - particles.js config loaded');" + getNewLine() +
				                        "});" + getNewLine();
		addQuery(requiredString);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode()
	{
		int hash = 7;
		hash = 79 * hash + (this.getID().hashCode());
		return hash;
	}
}
