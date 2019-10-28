package ua.vyz.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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

    @GetMapping("/passingScore")
    public String getVyzByPassingScore(RedirectAttributes redir, @RequestParam String passingScore, Model model){
        if (isNotNumeric(passingScore)) {
            redir.addFlashAttribute("wrongParam", "wrong param");
            return "redirect:/main";
        }
        model.addAttribute("vyzs", vyzService.getVyzByPassingScore(Integer.parseInt(passingScore)));
        return "main";
    }

    @GetMapping("/facultetTiltle")
    public String getVyzsByFacultetTitle(@RequestParam String facultetTitle, Model model){
        model.addAttribute("vyzs", vyzService.getVyzsByFacultetTitle(facultetTitle));
        return "main";
    }

    @GetMapping("/scoretown")
    public String getVyzByPassingScoreAndTown(RedirectAttributes redir, @RequestParam String passingScore, @RequestParam String town, Model model){
        if (isNotNumeric(passingScore)) {
            redir.addFlashAttribute("wrongParam", "wrong param");
            return "redirect:/main";
        }
        model.addAttribute("vyzs", vyzService.getVyzByPassingScoreAndTown(Integer.parseInt(passingScore), town));
        return "main";
    }

    @GetMapping("/titleScoreTown")
    public String getVyzByAllParams(RedirectAttributes redir, @RequestParam String facultetTitle, @RequestParam String passingScore, @RequestParam String town, Model model){
        if (isNotNumeric(passingScore)) {
            redir.addFlashAttribute("wrongParam", "wrong param");
            return "redirect:/main";
        }
        model.addAttribute("vyzs", vyzService.getVyzByAllParams(facultetTitle, Integer.parseInt(passingScore), town));
        return "main";
    }

    private static boolean isNotNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return true;
        }
        return false;
    }
}
