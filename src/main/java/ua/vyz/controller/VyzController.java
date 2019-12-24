package ua.vyz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.vyz.model.Town;
import ua.vyz.repository.TownRepository;
import ua.vyz.repository.VyzRepository;
import ua.vyz.service.DefaultVyzService;

@Controller
@RequiredArgsConstructor
public class VyzController {
    private final DefaultVyzService vyzService;
    private final TownRepository townRepository;
    private final VyzRepository vyzRepository;

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("vyzs", vyzService.findAll());
        return "test";
    }

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("vyzs", vyzService.findAll());
        return "main";
    }

    @GetMapping("/town")
    public String getVyzsByTown(@RequestParam String townName, Model model){
        Town town = townRepository.findByName(townName);
        model.addAttribute("vyzs", vyzService.findAllByTown(town));
        return "main";
    }

    @GetMapping("/facultetTitle")
    public String getVyzsByFacultetTitle(@RequestParam String facultetTitle, Model model){
        model.addAttribute("vyzs", vyzService.getVyzsByFacultetTitle(facultetTitle));
        return "main";
    }

    @GetMapping("/findAllByTownAndFacultet")  // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public String findAllByTownAndFacultet(@RequestParam String town, @RequestParam String number, Model model){
        model.addAttribute("vyzs", vyzRepository.findAllByTownAndFacultet(town, number));
        return "main";
    }

    @GetMapping("/findAllByTownAndFacultetTitle")  // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public String findAllByTownAndFacultetTitle(@RequestParam String town, @RequestParam String title, Model model){
        model.addAttribute("vyzs", vyzRepository.findAllByTownAndFacultetTitle(town, title));
        return "main";
    }
}
