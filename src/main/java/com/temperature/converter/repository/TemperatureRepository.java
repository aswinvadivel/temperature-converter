package com.temperature.converter.repository;

import com.temperature.converter.model.TemperatureRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureRepository extends JpaRepository<TemperatureRecord, Long> {
}

