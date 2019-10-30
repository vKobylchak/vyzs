package ua.vyz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.vyz.repository.FacultetRepository;
import ua.vyz.repository.TownRepository;
import ua.vyz.service.VyzService;

@Controller
@RequiredArgsConstructor
public class HelloController {
    private final TownRepository townRepository;
    private final VyzService vyzService;
    private final FacultetRepository facultetRepository;
    @GetMapping
    public String hello(Model model)  {
        model.addAttribute("towns", townRepository.findAll());
        model.addAttribute("facultets", facultetRepository.findAll());
        model.addAttribute("vyzs", vyzService.findAll());
        return "hello";
    }
}