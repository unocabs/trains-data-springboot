package com.rgian.trainsproject1.controller;

import com.rgian.trainsproject1.DTO.TrainsDTO;
import com.rgian.trainsproject1.model.TrainsModel;
import com.rgian.trainsproject1.service.TrainsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
@RequiredArgsConstructor
public class TrainsController {

    private final TrainsService trainsService;
    @GetMapping
    public List<TrainsDTO> getAllTrains() {
        return trainsService.getAllTrains();
    }

    @PostMapping
    public List<TrainsDTO> addTrain(@RequestBody TrainsModel trainsModel) {
        return trainsService.addTrain(trainsModel);
    }
}
