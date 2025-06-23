package br.com.kadoozin.cadastro_de_ninjas.Ninjas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/ninja")
    public String ninja(){
       return "Ninja Controller";
    }
}
