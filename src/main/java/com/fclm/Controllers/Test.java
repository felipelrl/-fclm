package com.fclm.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping(value = "/test")
    protected String test(){

        return "Holaaaa";

    }
}
