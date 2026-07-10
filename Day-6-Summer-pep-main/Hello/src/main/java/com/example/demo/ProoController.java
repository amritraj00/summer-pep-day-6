package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProoController {
    @GetMapping("/proo")
    public String getProo() {
        return "Proo Service Response";
    }
}
