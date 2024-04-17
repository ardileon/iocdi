package com.example.iocdi;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class KelasA {

    private KelasB kelasB;

    public KelasA (KelasB kelasB) {
        this.kelasB = kelasB; 
    }
    
    @PostConstruct
    public void panggiKelasB() {
        kelasB.sayHello();
    }

}
