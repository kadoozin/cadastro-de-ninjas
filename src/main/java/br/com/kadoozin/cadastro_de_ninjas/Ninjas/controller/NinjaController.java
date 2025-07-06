package br.com.kadoozin.cadastro_de_ninjas.Ninjas.controller;

import br.com.kadoozin.cadastro_de_ninjas.Ninjas.dtos.NinjaDTO;
import br.com.kadoozin.cadastro_de_ninjas.Ninjas.entities.NinjaModel;
import br.com.kadoozin.cadastro_de_ninjas.Ninjas.service.NinjaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ResourceBundle;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    private  final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @PostMapping("/adicionar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso!");
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> mostrarNinjaPorId(@PathVariable Long id) {
        NinjaDTO ninjaDTO = ninjaService.listarNinjasPorId(id);
        if (ninjaDTO != null){
            return ResponseEntity.ok(ninjaDTO);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com ID " + id + " não foi encontrado!");
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> mostrarTodosOsNinjas() {
        List<NinjaDTO> listar = ninjaService.mostrarTodosOsNinjas();
        return ResponseEntity.ok(listar);
    }

    @PatchMapping("/atualizar/{id}")
    public ResponseEntity<?> atualizarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        NinjaDTO ninjaDTO = ninjaService.atualizarNinja(id, ninjaAtualizado);
        if (ninjaDTO != null){
            return ResponseEntity.ok(ninjaDTO);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja não foi encontrado");
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarNinjaPorId(@PathVariable Long id) {
        if (ninjaService.listarNinjasPorId(id) != null){
            ninjaService.deletarNinja(id);
            return ResponseEntity.ok("Ninja de ID " + id + " foi deletado com sucesso!");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja de ID " + id + " não foi encontrado!");
        }
    }
}
