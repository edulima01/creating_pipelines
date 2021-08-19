package com.edulima01.pipelines.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/Math")
public class MathController {
    @GetMapping("/Divide")
    public int divide(@RequestParam int first, @RequestParam int second) {
        if (second == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cannot divide by zero");
        }
        
        return first/second;
    }
}
