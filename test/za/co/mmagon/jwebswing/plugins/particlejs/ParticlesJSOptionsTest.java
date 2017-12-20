package za.co.mmagon.jwebswing.plugins.particlejs;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.htmlbuilder.css.colours.ColourCSSImpl;
import za.co.mmagon.jwebswing.plugins.particlejs.options.InteractivityEventOnClickActionModes;

class ParticlesJSOptionsTest
{

	@Test
	public void testBasic()
	{
		ParticlesJSOptions opts = new ParticlesJSOptions();
		opts.setRetinaDetect(true);
		opts.getParticles().getColour().setValue(new ColourCSSImpl("#ffffff"));
		opts.getParticles().getLineLinks().setDistance(100);
		opts.getParticles().getMove().getAttraction().setRotateY(500);
		opts.getParticles().getNumber().getDensity().setEnable(true);
		opts.getParticles().getOpacity().getAnimations().setOpacityMin(0.1);
		opts.getParticles().getOpacity().setRandom(true);
		opts.getInteractivity().getEvents().getOnclick().setEnable(true);
		opts.getInteractivity().getEvents().getOnclick().setMode(InteractivityEventOnClickActionModes.remove);
		opts.getInteractivity().getModes().getBubble().setDistance(100);

		System.out.println(opts.toString());
	}
}
