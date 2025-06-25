package br.com.kadoozin.cadastro_de_ninjas.Ninjas.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    // Adiciona um novo ninja (CREATE)
    @PostMapping("/add")
    public String criarNinja(){
        return "..";
    }

    // Mostrar o ninja por ID (READ)
    @GetMapping("/id")
    public String mostrarNinjaPorId(){
        return "..";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/all")
    public String mostrarTodosOsNinjas(){
        return "..";
    }

    // Altera os dados do ninja (UPDATE)
    @PutMapping("/update")
    public String updateNinja(){
        return "..";
    }

    // Deleta o ninja por ID (DELETE)
    @DeleteMapping("/deleteId")
    public String deletarNinja(){
        return "..";
    }

}
