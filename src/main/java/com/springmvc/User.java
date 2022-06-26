package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class User {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有的用户");
        return  "success";
    }
  @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String getUSerById(){
      System.out.prn("更是的骄傲");
      return  "success";
  }


}
