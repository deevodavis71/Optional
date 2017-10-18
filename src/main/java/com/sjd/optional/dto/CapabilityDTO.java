package com.sjd.optional.dto;

import lombok.Data;

import java.util.List;

@Data
public class CapabilityDTO {

    private String name;

    private String description;

    private List<CapabilityParamDTO> params;

}
