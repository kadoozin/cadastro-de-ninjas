package br.com.kadoozin.cadastro_de_ninjas.Missoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    @PostMapping("/add")
    public String adicionarMissoes(){
        return "Missão adicionada: ";
    }
    @GetMapping("/id")
    public String missoesId(){
        return "ID da missão: ";
    }

    @GetMapping("/all")
    public String mostrarTodasAsMissoes(){
        return "Todas as missões: ";
    }

    @PutMapping("/update")
    public String updateMissoes(){
        return "Missão Atualizada: ";
    }

    @DeleteMapping("/delete")
    public String deletarMissao(){
        return "Missão deletada: ";
    }
}
