package com.example.article;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbb")
    @ResponseBody
    public String index () {
        return "하이";
    }
    @GetMapping("/")
    public String root() {
        return "redirect:/article/list";
    }

}
