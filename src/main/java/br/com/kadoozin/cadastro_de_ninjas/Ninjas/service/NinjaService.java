package br.com.kadoozin.cadastro_de_ninjas.Ninjas.service;

import br.com.kadoozin.cadastro_de_ninjas.Ninjas.entities.NinjaModel;
import br.com.kadoozin.cadastro_de_ninjas.Ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    public NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os  ninjas
    public List<NinjaModel> mostrarTodosOsNinjas(){
        return ninjaRepository.findAll();
    }
    //Listar ninja por Id
    public List<NinjaModel> listarNinjasPorId(){
        return ninjaRepository.findById();
    }
}
