package ua.vyz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.vyz.model.Vyz;
import ua.vyz.service.DefaultVyzService;
import ua.vyz.service.VyzService;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequiredArgsConstructor
public class VyzController {

//    private final VyzService vyzService;
    private final DefaultVyzService vyzService;
//    private final DefaultFacultetService facultetService;
//    private final VyzRepository vyzRepository;

//    public VyzController(VyzRepository vyzRepository) {
//        this.vyzRepository = vyzRepository;
//    }

//    @GetMapping({"/vyz"})
//    public String hello(Model model, @RequestParam(value="passingScore", required=false, defaultValue="100") int passingScore) {
//
////        model.addAttribute("vyz", vyzRepository.getAllVyzByPassingScore(passingScore));
//        model.addAttribute("vyz", vyzService.findAll(passingScore));
//        return "hello";
//    }

//    @GetMapping("/vyz")
//    public String hello(Model model, @RequestParam(value="passingScore", required=false, defaultValue="100") int passingScore) {
//
////        model.addAttribute("vyz", vyzRepository.getAllVyzByPassingScore(passingScore));
////        model.addAttribute("vyz", vyzService.findAll(passingScore));
//        return "hello";
//    }

    @GetMapping("/main")
    public String main(Model model) {

//        Set<Vyz> vyzs = new HashSet<>();
//        Vyz a = new Vyz(1, "title1", "town1", 100);
//        Vyz b = new Vyz(1, "title1", "town1", 100);
//        Vyz c = new Vyz(1, "title1", "town1", 100);
//        vyzs.add(a);
//        vyzs.add(b);
//        vyzs.add(c);
//
        model.addAttribute("vyzs", vyzService.findAll());
        return "main";
    }

    @GetMapping("/town")
    public String getVyzsByTown(@RequestParam String town, Model model){
        model.addAttribute("vyzs", vyzService.findAllByTown(town));
        return "main";
    }
}
