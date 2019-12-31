package fr.ensim.tp2.tp5.controller;


import fr.ensim.tp2.tp5.model.DarkSky;
import fr.ensim.tp2.tp5.model.Resultat;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class MeteoController {
    @PostMapping("/meteo")
    public String showFormular(@RequestBody String adress , Model model) {
        SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(clientHttpReq);
        Resultat c = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+adress, Resultat.class);
        double lon = c.getFeatures().get(0).getGeometry().getCoordinates().get(0);
        double lat = c.getFeatures().get(0).getGeometry().getCoordinates().get(1);
        DarkSky s = restTemplate.getForObject("https://api.darksky.net/forecast/737a4d487cf71742b6afb8ba3a2e8779/"+lat+","+lon+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si", DarkSky.class);

        model.addAttribute("meteo",s);
        model.addAttribute("adresse",c.getFeatures().get(0).getProperties().getContext());
        model.addAttribute("ville",c.getFeatures().get(0).getProperties().getCity());
        return "meteo";
    }

}
