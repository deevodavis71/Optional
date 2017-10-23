package com.sjd.optional.utility;

import lombok.Data;

@Data
public class WrappedId {

    private Long value;

    public WrappedId() {

    }

    public WrappedId(Long l) {
        value = l;
    }

}
