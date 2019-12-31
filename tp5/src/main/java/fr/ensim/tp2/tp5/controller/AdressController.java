package fr.ensim.tp2.tp5.controller;

import fr.ensim.tp2.tp5.model.Adress;
import fr.ensim.tp2.tp5.model.AdressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdressController {

    @Autowired
    AdressRepository adressRepository;

    @GetMapping("/adresses")
    public String showAdresses(Model model) {
        model.addAttribute("allAdresses", adressRepository.findAll());
        return "adresses";
    }
}
