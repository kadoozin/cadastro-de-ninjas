package br.com.kadoozin.cadastro_de_ninjas.Ninjas.entities;

import br.com.kadoozin.cadastro_de_ninjas.Missoes.entities.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString(exclude = "missoes")
@Table(name = "tb_ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private Integer idade;

    @Column(name = "aldeia")
    private String aldeia;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;
}
