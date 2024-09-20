package com.temperature.converter.controller;

import com.temperature.converter.model.TemperatureRecord;
import com.temperature.converter.service.TemperatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TemperatureController {

    @Autowired
    private TemperatureService temperatureService;

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/convert")
    public String convertTemperature(@RequestParam("celsius") double celsius, Model model) {
        double fahrenheit = temperatureService.convertCelsiusToFahrenheit(celsius);
        TemperatureRecord record = new TemperatureRecord(celsius, fahrenheit);
        temperatureService.saveRecord(record);
        model.addAttribute("celsius", celsius);
        model.addAttribute("fahrenheit", fahrenheit);
        return "index";
    }
}

