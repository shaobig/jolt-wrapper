package io.shaobig.converter;

import io.shaobig.json.builder.object.JsonObject;

public interface ValueConverter<T> {

    JsonObject convertValue(T object);

}
