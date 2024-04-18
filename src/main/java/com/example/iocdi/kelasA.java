package com.example.iocdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

// gabungan antara beans, ioc dan di

@Component
public class KelasA {


    //**  implement Constructor-based Injection
    private KelasB kelasB;

    public KelasA (KelasB kelasB) {
        this.kelasB = kelasB; 
    }

    //**  implement Setter-based Injection
    private KelasC kelasC;

    public KelasC getKelasC() {
        return kelasC;
    }
    @Autowired(required = false)
    public void setKelasC(KelasC kelasC) {
        this.kelasC = kelasC;
    }
    
    //** implement field-based Injection
    @Autowired(required = false)
    private KelasD kelasD;

    @PostConstruct
    public void panggiKelasB() {
        
        // Panggil kelas B
        kelasB.sayHello();

        // Panggil kelas C
        if (kelasC != null){
            kelasC.sayHello();
        } else {
            System.out.println("Kelas C belum dipanggil");
        }

        // panggil kelas D
        if (kelasD != null) {
            kelasD.sayHello();
        } else {
            System.out.println("Kelas D belum dipanggil");
        }

    }
    



   

}
