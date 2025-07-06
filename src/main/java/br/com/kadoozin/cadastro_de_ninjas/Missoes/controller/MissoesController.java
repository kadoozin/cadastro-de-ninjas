package br.com.kadoozin.cadastro_de_ninjas.Missoes.controller;

import br.com.kadoozin.cadastro_de_ninjas.Missoes.dtos.MissoesDTO;
import br.com.kadoozin.cadastro_de_ninjas.Missoes.service.MissoesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    public final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping("/adicionar")
    public ResponseEntity<String> criarMissao(@RequestBody MissoesDTO missoes) {
        MissoesDTO novaMissao = missoesService.criarMissao(missoes);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Missão criada com sucesso!");
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarMissaoPorId(@PathVariable Long id) {
        MissoesDTO missoesDTO = missoesService.listarMissoesPorId(id);
        if (missoesDTO != null) {
            return ResponseEntity.ok(missoesDTO);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("A missão de ID " + id + " não foi encontrada!");
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<MissoesDTO>> mostrarTodasAsMissoes() {
        List<MissoesDTO> listar = missoesService.mostrarTodosOsNinjas();
        return ResponseEntity.ok(listar);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<?> atualizarPorId(@PathVariable Long id, @RequestBody MissoesDTO missaoAtualizada) {
        MissoesDTO missoesDTO = missoesService.atualizarMissoes(id, missaoAtualizada);
        if (missoesDTO != null) {
            return ResponseEntity.ok(missoesDTO);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Essa missão não foi encontrada!");
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletarMissaoPorId(@PathVariable Long id) {
        if (missoesService.listarMissoesPorId(id) != null) {
            missoesService.deletarMissaoPorId(id);
            return ResponseEntity.ok("Missão de ID " + id + " foi deletada com sucesso!");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Missão de ID " + id + " não foi encontrada!");
        }
    }
}