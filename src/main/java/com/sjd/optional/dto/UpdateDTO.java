package com.sjd.optional.dto;

import lombok.Data;

import java.util.Optional;

@Data
public class UpdateDTO {

    private Optional<Long> number;

    private Optional<String> name;

    private Optional<CapabilityDTO> capability;

}
