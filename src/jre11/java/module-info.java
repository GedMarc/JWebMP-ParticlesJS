import com.jwebmp.plugins.particlejs.implementations.ParticlesJSModuleInclusions;

module com.jwebmp.plugins.particlejs {

	exports com.jwebmp.plugins.particlejs;
	exports com.jwebmp.plugins.particlejs.options;
	exports com.jwebmp.plugins.particlejs.themes;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;

	requires com.guicedee.guicedinjection;
	requires com.fasterxml.jackson.databind;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.particlejs.ParticleJSPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.particlejs.implementations.ParticlesExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with ParticlesJSModuleInclusions;

	opens com.jwebmp.plugins.particlejs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.particlejs.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.particlejs.themes to com.fasterxml.jackson.databind, com.jwebmp.core;

}
