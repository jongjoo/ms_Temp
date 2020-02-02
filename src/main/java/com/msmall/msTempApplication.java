package com.msmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class msTempApplication {

    public static void main(String[] args) {
        SpringApplication.run(msTempApplication.class, args);
    }

    @GetMapping("/")
    public String HelloWorld(){
        return "START MS MALL !!";
    }

    @GetMapping("/ttt")
    public String ttt(){
        return "ttt";
    }
}
