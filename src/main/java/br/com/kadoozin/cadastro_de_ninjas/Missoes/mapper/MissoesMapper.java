package br.com.kadoozin.cadastro_de_ninjas.Missoes.mapper;

import br.com.kadoozin.cadastro_de_ninjas.Missoes.dtos.MissoesDTO;
import br.com.kadoozin.cadastro_de_ninjas.Missoes.entities.MissoesModel;
import org.springframework.stereotype.Component;

@Component
public class MissoesMapper {

    public MissoesModel map(MissoesDTO dto) {
        MissoesModel model = new MissoesModel();
        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setDificuldade(dto.getDificuldade());

        return model;
    }

    public MissoesDTO map(MissoesModel model) {
        MissoesDTO dto = new MissoesDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setDificuldade(model.getDificuldade());

        return dto;
    }
}
