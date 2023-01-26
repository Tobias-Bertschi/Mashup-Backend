package ch.bbw.mashupbackend.controller;

import ch.bbw.mashupbackend.model.Fact;
import ch.bbw.mashupbackend.repository.FactRepository;
import ch.bbw.mashupbackend.service.CatService;
import ch.bbw.mashupbackend.service.FactService;
import ch.bbw.mashupbackend.service.HoroscopeService;
import ch.bbw.mashupbackend.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class ApiController {

    private FactRepository factRepository;

    @Autowired
    final WeatherService weatherService;
    final CatService catService;
    final FactService factService;
    final HoroscopeService horoscopeService;

    public ApiController(FactRepository factRepository, WeatherService weatherService, CatService catService, FactService factService, HoroscopeService horoscopeService) {
        this.factRepository = factRepository;
        this.weatherService = weatherService;
        this.catService = catService;
        this.factService = factService;
        this.horoscopeService = horoscopeService;
    }

    @GetMapping("/weather")
    public String getWeather() {
        return weatherService.getWeather();
    }

    @GetMapping("/cats")
    public byte[] getCats() {
        return catService.getCat();
    }

    @GetMapping("/fact")
    public String getFact() {
        Fact fact = new Fact();
        fact.setData(factService.getFact());

        //factRepository.save(fact);
        return fact.getData();
    }

    @GetMapping("/horoscope")
    public String postHoroscope() {
        return horoscopeService.createHoroscope();
    }

}