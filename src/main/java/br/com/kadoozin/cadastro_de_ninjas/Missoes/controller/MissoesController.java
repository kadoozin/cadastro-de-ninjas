package br.com.kadoozin.cadastro_de_ninjas.Missoes.controller;

import br.com.kadoozin.cadastro_de_ninjas.Missoes.entities.MissoesModel;
import br.com.kadoozin.cadastro_de_ninjas.Missoes.service.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    public MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping("/adicionar")
    public MissoesModel adicionarMissoes(@RequestBody MissoesModel missoes){
        return missoesService.adicionarMissoes(missoes);
    }
    @GetMapping("/listar/{id}")
    public MissoesModel mostrarMissaoPorId(@PathVariable Long id){
        return missoesService.mostrarMissaoPorId(id);
    }

    @GetMapping("/all")
    public List<MissoesModel> mostrarTodasAsMissoes(){
        return mostrarTodasAsMissoes();
    }

    @PutMapping("/update")
    public String updateMissoes(){
        return "Missão Atualizada: ";
    }

    @DeleteMapping("/delete/{id}")
    public void deletarMissaoPorId(@PathVariable Long id){
        missoesService.deletarMissaoPorId(id);
    }
}
