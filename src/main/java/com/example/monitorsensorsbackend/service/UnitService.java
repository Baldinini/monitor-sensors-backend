package com.example.monitorsensorsbackend.service;

import com.example.monitorsensorsbackend.model.Unit;

import java.util.Optional;

public interface UnitService {
    Optional<Unit> getById(Long id);
}
