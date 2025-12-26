package org.example.spring_chapter_8.request_param;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class OptionalRequestParamController {
    @RequestMapping("/optional-param")
    public String optionalParam(
            Model model,
            @RequestParam Optional<String> username,
            @RequestParam(defaultValue = "green") String color) {

        if (username.isEmpty()) { //http://localhost:8080/optional-param?color=red
            model.addAttribute("username", "Guest");
        } else if (username.get().isBlank()) {  //http://localhost:8080/optional-param?username=&color=red
            model.addAttribute("username", "Anonymous");
        } else {
            model.addAttribute("username", username.get());
        }
        model.addAttribute("color", color);
        return "home";
    }

}
