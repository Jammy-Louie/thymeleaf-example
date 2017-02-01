package com.example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
public class DemoController {

    @RequestMapping("/")
    String getIndex(Model model) {
        model.addAttribute("test", LocalDateTime.now());
        return "index";
    }
}
