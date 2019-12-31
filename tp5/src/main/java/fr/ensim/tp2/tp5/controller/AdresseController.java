package fr.ensim.tp2.tp5.controller;

import fr.ensim.tp2.tp5.model.Adress;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdresseController {

    @GetMapping("/adresse")
    public String showFormular(Model model) {
        return "adresse";
    }

}
