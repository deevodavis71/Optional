package com.sjd.optional.utils;

import java.util.Optional;

public class OptionalUtils {

    public static <T> boolean hasValue(Optional<T> opt) {

        return opt != null && opt.isPresent();

    }
}
