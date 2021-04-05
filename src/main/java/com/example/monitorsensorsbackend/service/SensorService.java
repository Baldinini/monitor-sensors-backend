package com.example.monitorsensorsbackend.service;

import com.example.monitorsensorsbackend.model.Sensor;

import java.util.List;

public interface SensorService {
    void save(Sensor sensor);

    void delete(Long id);

    String getDescription(Long id);

    List<Sensor> getAll();

    Sensor getById(Long id);
}
