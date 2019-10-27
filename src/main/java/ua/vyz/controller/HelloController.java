package ua.vyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping
    public String hello(Model model)  {
//    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="GO!") String name) {
//        model.addAttribute("name", name);
        return "hello";
    }
}