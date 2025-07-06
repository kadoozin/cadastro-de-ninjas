package br.com.kadoozin.cadastro_de_ninjas.Missoes.service;

import br.com.kadoozin.cadastro_de_ninjas.Missoes.dtos.MissoesDTO;
import br.com.kadoozin.cadastro_de_ninjas.Missoes.entities.MissoesModel;
import br.com.kadoozin.cadastro_de_ninjas.Missoes.mapper.MissoesMapper;
import br.com.kadoozin.cadastro_de_ninjas.Missoes.repository.MissoesRepository;
import br.com.kadoozin.cadastro_de_ninjas.Ninjas.dtos.NinjaDTO;
import br.com.kadoozin.cadastro_de_ninjas.Ninjas.entities.NinjaModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MissoesService {
    public final MissoesRepository missoesRepository;
    public final MissoesMapper missoesMapper;

    public MissoesService(MissoesRepository missoesRepository, MissoesMapper missoesMapper) {
        this.missoesRepository = missoesRepository;
        this.missoesMapper = missoesMapper;
    }

    public List<MissoesDTO> mostrarTodosOsNinjas(){
        List<MissoesModel> missoes = missoesRepository.findAll();
        return missoes.stream()
                .map(missoesMapper :: map)
                .collect(Collectors.toList());
    }

    public MissoesDTO listarMissoesPorId(Long id){
        Optional<MissoesModel> missoesPorId = missoesRepository.findById(id);
        return missoesPorId.map(missoesMapper :: map).orElse(null);
    }

    public void deletarMissaoPorId(Long id){
        missoesRepository.deleteById(id);
    }

    public MissoesDTO criarMissao(MissoesDTO missoesDTO){
        MissoesModel missoesModel = missoesMapper.map(missoesDTO);
        missoesRepository.save(missoesModel);
        return missoesMapper.map(missoesModel);
    }
    public MissoesDTO atualizarMissoes(Long id, MissoesDTO missoesDTO){
        Optional<MissoesModel> missaoExistente = missoesRepository.findById(id);
        if (missaoExistente.isPresent()){
            MissoesModel missaoAtualizada = missoesMapper.map(missoesDTO);
            missaoAtualizada.setId(id);
            MissoesModel missaoSalva = missoesRepository.save(missaoAtualizada);
            return missoesMapper.map(missaoSalva);
        }
        return null;
    }
}
