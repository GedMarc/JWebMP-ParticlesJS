package com.jwebmp.plugins.particlejs.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class ParticlesExclusionsModule
		implements IGuiceScanModuleExclusions<ParticlesExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.particlejs");
		return strings;
	}
}
