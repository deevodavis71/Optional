package com.sjd.optional.web;

import com.sjd.entity.MyEntity;
import com.sjd.optional.dto.CreateDTO;
import com.sjd.optional.dto.UpdateDTO;
import com.sjd.optional.mappers.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class MapController {

    @Autowired
    private MyMapper mapper;

    @RequestMapping("/create")
    public ResponseEntity<String> create(@RequestBody CreateDTO dto) {

        MyEntity entity = mapper.createEntityFromDto(dto);

        return new ResponseEntity<>("ACK Create", HttpStatus.CREATED);

    }

    @RequestMapping("/update")
    public ResponseEntity<String> update(@RequestBody UpdateDTO dto) {

        MyEntity entity = new MyEntity();
        entity.setName("NAME");
        entity.setNumber(999L);

        mapper.updateEntityFromDto(dto, entity);

        return new ResponseEntity<>("ACK Update", HttpStatus.OK);

    }

}
