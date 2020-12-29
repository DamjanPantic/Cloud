package com.panticdamjan.Project.controller;

import com.panticdamjan.Project.service.SimpleService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "")
public class SimpleController {

    @Autowired
    SimpleService simpleService;

//    Main end point for REST API
    @GetMapping(path = "", produces = "application/json")
    public ResponseEntity getUser() {
        int counter = simpleService.incrementCounter();

        Map<String, Object> result = new HashMap<String,Object>();
        result.put("counter", counter);
        result.put("URL_POSTGRES", System.getenv("URL_POSTGRES"));
        result.put("USERNAME_POSTGRES", System.getenv("USERNAME_POSTGRES"));
        result.put("PASSWORD_POSTGRES", System.getenv("PASSWORD_POSTGRES"));
        result.put("HOST", System.getenv("HOST"));

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
