package br.com.kadoozin.cadastro_de_ninjas.Ninjas.dtos;

import br.com.kadoozin.cadastro_de_ninjas.Missoes.entities.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class NinjaDTO {
    private Long id;
    private String nome;
    private Integer idade;
    private String aldeia;
    private MissoesModel missoes;
}
