package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ScopeController {
//使用servletAPI向request域对象中共享数据
     @RequestMapping("/testRequestByServlet")
    public  String testRequestByServlet(HttpServletRequest request){
          request.setAttribute("testRequestScope","hello,servletAPI");

         return  "success";
     }
@RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
         ModelAndView mav=new ModelAndView();
         //处理模型数据，即向请求域request共享数据
    mav.addObject("testRequestScope","hell,MOdelAndView");
    //设置试图名称
    mav.setViewName("success");
    return mav;
}


}
