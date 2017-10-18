package com.sjd.optional.mappers;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OptionalMapper {

    public <T> T map(Optional<T> value) {
        if (value != null && value.isPresent())
            return value.get();

        return null;
    }
}
