package com.jwebmp.plugins.particlejs;

import com.jwebmp.base.references.CSSReference;
import com.jwebmp.base.references.JavascriptReference;
import com.jwebmp.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.base.servlets.interfaces.ReferencePool;

/**
 * References for angular
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
enum ParticleJSReferencePool
		implements ReferencePool
{
	ParticlesJS(new JavascriptReference("ParticlesJS", 1.6, "bower_components/particles.js/particles.min.js", RequirementsPriority.Top_Shelf), null);
	/**
	 * Any sub data
	 */
	private String data;
	private JavascriptReference javaScriptReference;
	private CSSReference cssReference;

	/**
	 * A new AngularSlimScrollReferencePool
	 */
	ParticleJSReferencePool()
	{

	}

	ParticleJSReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
	{
		this.javaScriptReference = javaScriptReference;
		if (this.javaScriptReference != null)
		{
			this.javaScriptReference.setPriority(RequirementsPriority.DontCare);
		}
		this.cssReference = cssReference;
		if (this.cssReference != null)
		{
			this.cssReference.setPriority(RequirementsPriority.DontCare);
		}
	}

	@Override
	public CSSReference getCssReference()
	{
		return cssReference;
	}

	@Override
	public void setCssReference(CSSReference cssReference)
	{
		this.cssReference = cssReference;
	}

	@Override
	public JavascriptReference getJavaScriptReference()
	{
		return javaScriptReference;
	}

	@Override
	public void setJavaScriptReference(JavascriptReference javaScriptReference)
	{
		this.javaScriptReference = javaScriptReference;
	}

	/**
	 * Returns the name or the data contained within
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		if (data != null && !data.isEmpty())
		{
			return data;
		}
		else
		{
			return name();
		}
	}
}
