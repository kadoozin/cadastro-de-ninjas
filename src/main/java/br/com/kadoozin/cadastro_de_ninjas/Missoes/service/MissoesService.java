package br.com.kadoozin.cadastro_de_ninjas.Missoes.service;

import br.com.kadoozin.cadastro_de_ninjas.Missoes.entities.MissoesModel;
import br.com.kadoozin.cadastro_de_ninjas.Missoes.repository.MissoesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {
    public MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    public List<MissoesModel> mostrarTodasAsMissoes(){
        return missoesRepository.findAll();
    }

    public MissoesModel mostrarMissaoPorId(Long id){
        Optional<MissoesModel> missoesPorId = missoesRepository.findById(id);
        return missoesPorId.orElse(null);
    }

    public void deletarMissaoPorId(Long id){
        missoesRepository.deleteById(id);
    }

    public MissoesModel adicionarMissoes(MissoesModel missoes){
        return missoesRepository.save(missoes);
    }
}
