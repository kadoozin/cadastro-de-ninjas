package br.com.kadoozin.cadastro_de_ninjas.Ninjas.mapper;

import br.com.kadoozin.cadastro_de_ninjas.Ninjas.dtos.NinjaDTO;
import br.com.kadoozin.cadastro_de_ninjas.Ninjas.entities.NinjaModel;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {
    public NinjaModel map(NinjaDTO dto){
        NinjaModel model = new NinjaModel();

        model.setId(dto.getId());
        model.setNome(dto.getNome());
        model.setIdade(dto.getIdade());
        model.setAldeia(dto.getAldeia());
        model.setMissoes(dto.getMissoes());

        return model;
    }

    public NinjaDTO map(NinjaModel model){
        NinjaDTO dto = new NinjaDTO();

        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setIdade(model.getIdade());
        dto.setAldeia(model.getAldeia());
        dto.setMissoes(model.getMissoes());

        return dto;
    }
}
