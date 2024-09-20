package com.temperature.converter.model;

import jakarta.persistence.*;

@Entity
public class TemperatureRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double celsius;
    private double fahrenheit;

    public TemperatureRecord() {}

    public TemperatureRecord(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    // getters and setters
}
