package com.example.monitorsensorsbackend.service.impl;

import com.example.monitorsensorsbackend.model.Type;
import com.example.monitorsensorsbackend.repository.TypeRepository;
import com.example.monitorsensorsbackend.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TypeServiceImpl implements TypeService {

    private final TypeRepository typeRepository;

    @Autowired
    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public Optional<Type> getById(Long id) {
        return typeRepository.findById(id);
    }
}
