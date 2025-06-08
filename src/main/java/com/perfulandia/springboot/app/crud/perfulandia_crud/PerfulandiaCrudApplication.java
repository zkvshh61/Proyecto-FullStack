package com.perfulandia.springboot.app.crud.perfulandia_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PerfulandiaCrudApplication {
    public static void main(String[] args) {
        SpringApplication.run(PerfulandiaCrudApplication.class, args);
    }
}

@RestController
class HomeController {
    @GetMapping("/")
    public String home() {
        return "¡API Perfulandia!";
    }
}