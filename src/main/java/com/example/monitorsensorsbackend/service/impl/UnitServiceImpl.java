package com.example.monitorsensorsbackend.service.impl;

import com.example.monitorsensorsbackend.model.Unit;
import com.example.monitorsensorsbackend.repository.UnitRepository;
import com.example.monitorsensorsbackend.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UnitServiceImpl implements UnitService {

    private final UnitRepository unitRepository;

    @Autowired
    public UnitServiceImpl(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    @Override
    public Optional<Unit> getById(Long id) {
        return unitRepository.findById(id);
    }
}
