package com.sjd.optional.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sjd.optional.utility.WrappedId;
import com.sjd.optional.utility.WrappedIdDeserializer;
import lombok.Data;

@Data
public class WrappedDTO {

    @JsonDeserialize(using = WrappedIdDeserializer.class)
    @JsonProperty("terminalId")
    private WrappedId wrapper;

}
