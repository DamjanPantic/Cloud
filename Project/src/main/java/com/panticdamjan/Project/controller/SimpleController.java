package com.panticdamjan.Project.controller;

import com.panticdamjan.Project.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class SimpleController {

    @Autowired
    SimpleService simpleService;

    @GetMapping(path = "", produces = "application/json")
    public ResponseEntity getUser() {

        int counter = simpleService.incrementCounter();
        return new ResponseEntity<>(counter, HttpStatus.OK);
    }
}
