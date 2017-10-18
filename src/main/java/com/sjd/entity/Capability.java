package com.sjd.entity;

import lombok.Data;

import java.util.List;

@Data
public class Capability {

    private String name;

    private String description;

    private List<CapabilityParam> params;

}
