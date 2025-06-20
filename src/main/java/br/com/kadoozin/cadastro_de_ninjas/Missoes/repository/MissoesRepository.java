package br.com.kadoozin.cadastro_de_ninjas.Missoes.repository;

import br.com.kadoozin.cadastro_de_ninjas.Missoes.entities.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
