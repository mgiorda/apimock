package com.apimock.manager;

import com.apimock.core.model.HttpMethod;

public class MockRequest {

	private HttpMethod method;

	private String path;

	private int filterPriority;

	private CustomServiceFilter filter;

	public HttpMethod getMethod() {
		return method;
	}

	public void setMethod(HttpMethod method) {
		this.method = method;
	}

	public int getFilterPriority() {
		return filterPriority;
	}

	public void setFilterPriority(int filterPriority) {
		this.filterPriority = filterPriority;
	}

	public CustomServiceFilter getFilter() {
		return filter;
	}

	public void setFilter(CustomServiceFilter filter) {
		this.filter = filter;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public CustomServiceFilter getMatcher() {
		return filter;
	}

	public void setMatcher(CustomServiceFilter matcher) {
		this.filter = matcher;
	}

	public int getMatcherPriority() {
		return filterPriority;
	}

	public void setMatcherPriority(int matcherPriority) {
		this.filterPriority = matcherPriority;
	}
}
