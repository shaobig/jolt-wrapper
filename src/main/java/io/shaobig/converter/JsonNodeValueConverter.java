package io.shaobig.converter;

import com.fasterxml.jackson.databind.JsonNode;
import io.shaobig.json.builder.object.JsonObject;
import org.shaobig.jolt.mapper.transformer.JoltMapper;

public class JsonNodeValueConverter implements ValueConverter<JsonNode> {

    private JoltMapper<JsonNode> joltMapper;
    private ValueConverter<JsonNode> jsonNodeValueConverter;

    public JsonNodeValueConverter(JoltMapper<JsonNode> joltMapper, ValueConverter<JsonNode> jsonNodeValueConverter) {
        this.joltMapper = joltMapper;
        this.jsonNodeValueConverter = jsonNodeValueConverter;
    }

    @Override
    public JsonObject convertValue(JsonNode jsonNode) {
        return getJsonNodeValueConverter().convertValue(getJoltMapper().transform(jsonNode));
    }

    public JoltMapper<JsonNode> getJoltMapper() {
        return joltMapper;
    }

    public void setJoltMapper(JoltMapper<JsonNode> joltMapper) {
        this.joltMapper = joltMapper;
    }

    public ValueConverter<JsonNode> getJsonNodeValueConverter() {
        return jsonNodeValueConverter;
    }

    public void setJsonNodeValueConverter(ValueConverter<JsonNode> jsonNodeValueConverter) {
        this.jsonNodeValueConverter = jsonNodeValueConverter;
    }

}
