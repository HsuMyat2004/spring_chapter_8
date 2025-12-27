package org.example.spring_chapter_8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(Model model) { // The action method defines a parameter of type Model that stores the data the controller sends to the view
        model.addAttribute("username", "Katy"); //We add the data we want the controller to send to the view.
        model.addAttribute("color", "red");
        return "home.html"; //The controller’s action returns the view to be rendered into the HTTP response.
    }
}
