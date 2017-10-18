package com.sjd.optional.mappers;

import com.sjd.entity.Capability;
import com.sjd.entity.MyEntity;
import com.sjd.optional.dto.CapabilityDTO;
import com.sjd.optional.dto.CreateDTO;
import com.sjd.optional.dto.UpdateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", uses = {OptionalMapper.class}, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MyMapper {

    MyEntity createEntityFromDto(CreateDTO dto);

    void updateEntityFromDto(UpdateDTO dto, @MappingTarget MyEntity entity);

    Capability createCapabilityFromDto(CapabilityDTO dto);

}
