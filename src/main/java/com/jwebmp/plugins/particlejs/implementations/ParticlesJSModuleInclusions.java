package com.jwebmp.plugins.particlejs.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class ParticlesJSModuleInclusions implements IGuiceScanModuleInclusions<ParticlesJSModuleInclusions>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.particlejs");
		return set;
	}
}
