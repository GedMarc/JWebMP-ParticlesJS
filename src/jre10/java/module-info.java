import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.particlejs.ParticleJSPageConfigurator;

module com.jwebmp.plugins.particlejs {

	exports com.jwebmp.plugins.particlejs;
	exports com.jwebmp.plugins.particlejs.options;
	exports com.jwebmp.plugins.particlejs.themes;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;
	requires com.fasterxml.jackson.databind;

	provides IPageConfigurator with ParticleJSPageConfigurator;

	opens com.jwebmp.plugins.particlejs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.particlejs.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.particlejs.themes to com.fasterxml.jackson.databind, com.jwebmp.core;


}