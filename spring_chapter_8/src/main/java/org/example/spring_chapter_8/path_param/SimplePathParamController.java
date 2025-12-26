package org.example.spring_chapter_8.path_param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimplePathParamController {
    @RequestMapping("/path_home/{username}/{color}")
    public String home(Model model, @PathVariable (required = false) String username,
                       @PathVariable String color) {
        model.addAttribute("username", username);
        model.addAttribute("color", color);
        return "home.html";
    }
}
