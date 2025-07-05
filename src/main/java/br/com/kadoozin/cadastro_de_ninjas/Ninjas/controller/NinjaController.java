package br.com.kadoozin.cadastro_de_ninjas.Ninjas.controller;

import br.com.kadoozin.cadastro_de_ninjas.Ninjas.dtos.NinjaDTO;
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

    @PostMapping("/adicionar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja) {
        return ninjaService.criarNinja(ninja);
    }

    @GetMapping("/listar/{id}")
    public NinjaDTO mostrarNinjaPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    @GetMapping("/listar")
    public List<NinjaDTO> mostrarTodosOsNinjas() {
        return ninjaService.mostrarTodosOsNinjas();
    }

    @PutMapping("/atualizar/{id}")
    public NinjaDTO atualizarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinja(id);
    }
}
