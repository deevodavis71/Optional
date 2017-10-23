package com.sjd.optional.utility;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class WrappedIdDeserializer extends JsonDeserializer<WrappedId> {

    @Override
    public WrappedId deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {

        long l = 0L;

        // Get the wrapped value
        WrappedId w = new WrappedId();

        ObjectCodec oc = p.getCodec();
        JsonNode node = oc.readTree(p);

        int size = node.size();
        if (size == 0) {

            // Convert it as a number
            if (node.canConvertToLong()) {

                // Set the value
                l = node.asLong();
                w.setValue(l);

            }

            // Return it
            return w;
        }

        // Get the contained value
        JsonNode nodeValue = node.get("href");
        if (nodeValue != null) {

            // If hRef is actually a number
            if (nodeValue.canConvertToLong() || nodeValue.isLong()) {

                // Set the value
                w.setValue(nodeValue.asLong());
                return w;
            }

            // See if it is textual
            if (nodeValue.isTextual()) {

                // Convert the hRef into an ID
                w.setValue(87654L);
                return w;
            }
        }

        return w;

    }

}
