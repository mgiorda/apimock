package com.apimock.utils.json;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class ImplementationJsonDeserializer<T> implements CustomJsonDeserializer<T> {

	private final Class<T> deserializingClass;

	private final Class<?> implementationClass;

	public ImplementationJsonDeserializer(Class<T> deserializingClass, Class<? extends T> implementationClass) {

		this.deserializingClass = deserializingClass;
		this.implementationClass = implementationClass;
	}

	@Override
	public T deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

		T object = context.deserialize(json, implementationClass);

		return object;
	}

	@Override
	public Class<T> getDeserializingClass() {
		return deserializingClass;
	}

}
