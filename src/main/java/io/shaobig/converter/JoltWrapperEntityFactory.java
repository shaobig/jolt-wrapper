package io.shaobig.converter;

import com.fasterxml.jackson.databind.JsonNode;
import io.shaobig.EntityFactory;
import org.shaobig.jolt.mapper.transformer.JoltMapper;

public class JoltWrapperEntityFactory implements EntityFactory<JoltWrapper> {

    private String path;

    public JoltWrapperEntityFactory(String path) {
        this.path = path;
    }

    @Override
    public JoltWrapper createEntity() {
        return new JoltWrapper(new JsonNodeValueConverter(JoltMapper.create(getPath(), JsonNode.class), new JsonNodeToJsonObjectValueConverter()));
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
