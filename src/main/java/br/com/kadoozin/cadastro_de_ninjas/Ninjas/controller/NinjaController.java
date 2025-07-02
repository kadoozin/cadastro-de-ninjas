package br.com.kadoozin.cadastro_de_ninjas.Ninjas.controller;

import br.com.kadoozin.cadastro_de_ninjas.Ninjas.entities.NinjaModel;
import br.com.kadoozin.cadastro_de_ninjas.Ninjas.service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adiciona um novo ninja (CREATE)
    @PostMapping("/add")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar o ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel mostrarNinjaPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas(){
        return ninjaService.mostrarTodosOsNinjas();
    }

    // Altera os dados do ninja (UPDATE)
    @PutMapping("/atualizar")
    public String updateNinja(){
        return "..";
    }

    // Deleta o ninja por ID (DELETE)
    @DeleteMapping("/delete")
    public String deletarNinja(){
        return "..";
    }

}
