package com.example.monitorsensorsbackend.controller;

import com.example.monitorsensorsbackend.dto.request.SensorRequestDto;
import com.example.monitorsensorsbackend.dto.response.SensorResponseDto;
import com.example.monitorsensorsbackend.mapper.SensorMapper;
import com.example.monitorsensorsbackend.model.Sensor;
import com.example.monitorsensorsbackend.service.SensorService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@Log4j2
@RequestMapping("/sensors")
public class SensorController {

    private final SensorService sensorService;
    private final SensorMapper mapper;

    @Autowired
    public SensorController(SensorService sensorService, SensorMapper mapper) {

        this.sensorService = sensorService;
        this.mapper = mapper;
    }

    @PostMapping
    public void create(@RequestBody SensorRequestDto sensorDto) {

        log.warn("method: create");
        sensorService.save(mapper.toEntity(sensorDto));
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody SensorRequestDto sensorDto) {

        log.warn("method: update");
        Sensor sensor = mapper.toEntity(sensorDto);
        sensor.setId(id);
        sensorService.save(sensor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        log.warn("method: delete");
        sensorService.delete(id);
    }

    @GetMapping
    public List<SensorResponseDto> getAll(/*@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "2") Integer size*/) {

        log.warn("method: getAll");
        /*Pageable pageable = PageRequest.of(page, size);*/
        return sensorService.getAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/description")
    public String getDescription(@RequestParam String name) {

        log.warn("method: getDescription");
        return sensorService.getDescription(name);
    }
}
