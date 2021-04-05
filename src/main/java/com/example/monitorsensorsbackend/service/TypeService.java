package com.example.monitorsensorsbackend.service;

import com.example.monitorsensorsbackend.model.Type;

import java.util.Optional;

public interface TypeService {
    Optional<Type> getById(Long id);
}
