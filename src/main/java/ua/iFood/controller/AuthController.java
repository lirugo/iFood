package ua.iFood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private OAuth2AuthorizedClientService authorizedClientService;

    @GetMapping("/user")
    @ResponseBody
    public String user(Principal user){
        return user.getName();
    }
}
