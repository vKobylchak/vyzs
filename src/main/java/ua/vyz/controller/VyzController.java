package ua.vyz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.vyz.service.DefaultVyzService;

@Controller
@RequiredArgsConstructor
public class VyzController {

    private final DefaultVyzService vyzService;

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("vyzs", vyzService.findAll());
        return "main";
    }

    @GetMapping("/town")
    public String getVyzsByTown(@RequestParam String town, Model model){
        model.addAttribute("vyzs", vyzService.findAllByTown(town));
        return "main";
    }

    @PostMapping("/passingScore")
    public String getVyzByPassingScore(@RequestParam int passingScore, Model model){
        model.addAttribute("vyzs", vyzService.getVyzByPassingScore(passingScore));
        return "main";
    }

    @GetMapping("/scoretown")
    public String getVyzByPassingScoreAndTown(@RequestParam int passingScore, @RequestParam String town, Model model){
        model.addAttribute("vyzs", vyzService.getVyzByPassingScoreAndTown(passingScore, town));
        return "main";
    }


}
