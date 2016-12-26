package com.example;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/user")
@EnableSwagger2
public class SwaggerController {
    @RequestMapping(value = "/demo2.do")
    String getDemo() {
        return "Hello World \n" + "Spring boot3";
    }


}