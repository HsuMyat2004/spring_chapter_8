package org.example.spring_chapter_8.request_param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleRequestParamController {
    @RequestMapping("/hello-world")
    public String helloWorld(Model page, @RequestParam String color) {
        page.addAttribute("username","Hsu Myat Htike");
        page.addAttribute("color",color);
        return "home.html";
    }
}
