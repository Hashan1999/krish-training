package com.example.hello_world.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
@RequestMapping(value = "/helloUrl",method = RequestMethod.GET)
    public String print(){
    return "Hello Project";
}

}
