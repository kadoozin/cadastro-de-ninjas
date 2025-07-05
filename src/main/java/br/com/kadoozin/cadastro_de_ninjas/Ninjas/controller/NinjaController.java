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
    @PostMapping("/adicionar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar o ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel mostrarNinjaPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas() {
        return ninjaService.mostrarTodosOsNinjas();
    }

    // Altera os dados do ninja (UPDATE)
    @PutMapping("/atualizar/{id}")
    public NinjaModel atualizarNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    // Deleta o ninja por ID (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinja(id);
    }

}
