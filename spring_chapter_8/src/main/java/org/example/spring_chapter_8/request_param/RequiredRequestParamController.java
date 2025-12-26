package org.example.spring_chapter_8.request_param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequiredRequestParamController {
    @RequestMapping("/program")
    public String program(Model page, // required is true by default in request param
                          @RequestParam(required = false)String name,
                          @RequestParam(required = false)String color) {
       page.addAttribute("username",name); //username is used by thymeleaf and name is in parameter of URI
       page.addAttribute("color",color);
        return "home.html";
    }
}
