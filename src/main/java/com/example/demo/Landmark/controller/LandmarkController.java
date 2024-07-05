package com.example.demo.Landmark.controller;

import com.example.demo.Landmark.dto.LandmarkDTO;
import com.example.demo.Landmark.service.LandmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/landmark")
public class LandmarkController {

    @Autowired
    LandmarkService landmarkService;

    @ResponseBody
    @PostMapping("/register")
    public ResponseEntity<Integer> registerMyCourse(@RequestBody LandmarkDTO dto){
        int no =landmarkService.register(dto);
        System.out.println(no);
        return new ResponseEntity<>(no, HttpStatus.OK);
    }
}
