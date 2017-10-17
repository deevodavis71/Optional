package com.sjd.optional.web;

import com.sjd.optional.dto.MyDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.sjd.optional.utils.OptionalUtils.hasValue;

@RequestMapping("/api")
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(@RequestBody MyDTO dto) {

        System.out.println(dto);

        System.out.println("Name present: " + hasValue(dto.getName()));
        System.out.println("Number present: " + hasValue(dto.getNumber()));

        return "Tested it!";

    }

}
