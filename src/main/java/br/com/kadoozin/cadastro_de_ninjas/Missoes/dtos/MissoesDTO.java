package br.com.kadoozin.cadastro_de_ninjas.Missoes.dtos;

import br.com.kadoozin.cadastro_de_ninjas.Ninjas.entities.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MissoesDTO {
    private Long id;
    private String nome;
    private String dificuldade;
    private NinjaModel ninjas;
}
