package br.com.carstore.controller;


import jakarta.servlet.http.HttpServlet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/teste")
    public String hello(){
        return "Hello Word";
    }

}
