package ua.iFood.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @Value("${prod}")
    private String prod;

    @GetMapping
    public String index(Model model){
        model.addAttribute("prod", prod);
        return "index";
    }
}
