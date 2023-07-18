package ua.nprblm.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectHome()
    {
        return "redirect:/login";
    }
    @GetMapping("/home")
    public String home()
    {
        return "home";
    }

    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    @PostMapping("/login")
    public String auth()
    {
        return "redirect:/home";
    }

    @GetMapping("/admin")
    public String getAdminPage()
    {
        return "admin";
    }

}
