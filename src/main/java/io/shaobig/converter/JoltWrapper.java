package io.shaobig.converter;

import com.fasterxml.jackson.databind.JsonNode;
import io.shaobig.json.builder.object.JsonObject;

public class JoltWrapper implements ValueConverter<JsonObject> {

    private ValueConverter<JsonNode> jsonNodeValueConverter;

    public JoltWrapper(ValueConverter<JsonNode> jsonNodeValueConverter) {
        this.jsonNodeValueConverter = jsonNodeValueConverter;
    }

    @Override
    public JsonObject convertValue(JsonObject jsonObject) {
        return getJsonNodeValueConverter().convertValue(jsonObject.getJsonObjectManager().getJsonNode());
    }

    public ValueConverter<JsonNode> getJsonNodeValueConverter() {
        return jsonNodeValueConverter;
    }

    public void setJsonNodeValueConverter(ValueConverter<JsonNode> jsonNodeValueConverter) {
        this.jsonNodeValueConverter = jsonNodeValueConverter;
    }
}
