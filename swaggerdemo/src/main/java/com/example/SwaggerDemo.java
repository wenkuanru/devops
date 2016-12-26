package com.example;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/user")
@EnableSwagger2
public class SwaggerDemo {
    @RequestMapping(value = "/demo1.do")
    String getDemo() {
        return "Hello World \n" + "Spring boot4";
    }    
    @RequestMapping(value = "/show.do/{ownerId}/{petId}")
    String getShow(@PathVariable String ownerId, @PathVariable String petId) {
        return "Hello World \n" + ownerId+":"+petId;
    }   
}