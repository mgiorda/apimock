package com.apimock.manager.adapter.impl;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import com.apimock.core.model.ServiceParameters;

public class CompositeServiceMatcher implements CustomServiceMatcher {

	private final CustomServiceMatcher matcher1;

	private final CustomServiceMatcher matcher2;

	public CompositeServiceMatcher(CustomServiceMatcher customMatcher1, CustomServiceMatcher customMatcher2) {
		this.matcher1 = customMatcher1;
		this.matcher2 = customMatcher2;
	}

	@Override
	public boolean evaluate(ServiceParameters serviceParameters) {

		return matcher1.evaluate(serviceParameters) && matcher2.evaluate(serviceParameters);
	}

	@Override
	public int hashCode() {
		HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(17, 31);
		hashCodeBuilder.append(matcher1);
		hashCodeBuilder.append(matcher2);

		int hashCode = hashCodeBuilder.toHashCode();

		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (!(obj instanceof CompositeServiceMatcher))
			return false;

		CompositeServiceMatcher serviceMatcher = (CompositeServiceMatcher) obj;
		EqualsBuilder equalsBuilder = new EqualsBuilder();
		equalsBuilder.append(matcher1, serviceMatcher.matcher1);
		equalsBuilder.append(matcher2, serviceMatcher.matcher2);

		return equalsBuilder.isEquals();
	}
}
