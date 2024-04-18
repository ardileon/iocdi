package com.example.iocdi;

import org.springframework.stereotype.Component;

/*
* jika component atau beansnya di hapus maka karena ini dipanggil ke class a dengan bentuk setters bisa di atur pada required = false jadi masih bisa jalan program
* tapi nilainya itu null 
*/ 
@Component 
public class KelasC {

    public void sayHello(){
        System.out.println("Hello from kelas C");
    }
}
