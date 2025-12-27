package org.example.spring_chapter_8.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExerciseOneController {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World");
        model.addAttribute("color","green");
        return "hello.html";
    }
}
