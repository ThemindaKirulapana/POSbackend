package com.IFS.user.controller;

import com.IFS.user.model.Bike;
import com.IFS.user.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/bike")
@CrossOrigin("http://localhost:3000")
public class BikeController {

    @Autowired
    private BikeRepository bikeRepository;


    @PostMapping("/add")
    public Bike save(@RequestBody Bike bike){

        return bikeRepository.save(bike);

    }

    @GetMapping("/getBikes")
    List<Bike>getallBike(){
        return bikeRepository.findAll();
    }
}
