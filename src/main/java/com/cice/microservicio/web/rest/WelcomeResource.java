package com.cice.microservicio.web.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeResource {

    @Value("${config.saludo: Hola default}")
    private String saludo;

    @RequestMapping(name = "welcome")
    public String getSaludo(){
        return saludo;
    }
}
