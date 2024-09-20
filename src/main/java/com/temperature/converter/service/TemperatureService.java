package com.temperature.converter.service;

import com.temperature.converter.model.TemperatureRecord;
import com.temperature.converter.repository.TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    @Autowired
    private TemperatureRepository temperatureRepository;

    public double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public void saveRecord(TemperatureRecord record) {
        temperatureRepository.save(record);
    }
}
