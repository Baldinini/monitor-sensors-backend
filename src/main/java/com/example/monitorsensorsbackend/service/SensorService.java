package com.example.monitorsensorsbackend.service;

import com.example.monitorsensorsbackend.model.Sensor;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SensorService {
    void save(Sensor sensor);

    void delete(Long id);

    String getDescription(String name);

    List<Sensor> getAll();
}
