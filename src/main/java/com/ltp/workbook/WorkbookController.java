package com.ltp.workbook;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WorkbookController {
    
    @GetMapping("/")
    public String getShows(Model model){
        
        model.addAttribute("BreakingBad",new Show("Breaking Bad", "Ozymandias", 10.0));

        model.addAttribute("AttackOnTitan1", new Show("Attack on Titan", "Hero", 9.9));

        model.addAttribute("AttackOnTitan2", new Show("Attack on Titan", "Perfect Game", 9.9));

        model.addAttribute("StarWars", new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));

        model.addAttribute("MrRobot", new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9)); 
        
        return "shows";

    }

}
