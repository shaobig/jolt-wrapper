package io.shaobig.converter;

import com.fasterxml.jackson.databind.JsonNode;
import io.shaobig.json.builder.object.JsonObject;

public class JsonNodeToJsonObjectValueConverter implements ValueConverter<JsonNode> {

    @Override
    public JsonObject convertValue(JsonNode jsonNode) {
        JsonObject jsonObject = new JsonObject.Builder().build();
        jsonObject.getJsonObjectManager().setJsonNode(jsonNode);
        return jsonObject;
    }

}
