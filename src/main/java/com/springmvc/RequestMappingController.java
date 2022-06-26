package com.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMappingController {

    @RequestMapping("/testPath/{id}")
    /*占位符*/
    public String test1(@PathVariable("id") Integer id){

        return "index";
    }



}
