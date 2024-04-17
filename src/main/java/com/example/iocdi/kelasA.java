package com.example.iocdi;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

// gabungan antara beans, ioc dan di

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
