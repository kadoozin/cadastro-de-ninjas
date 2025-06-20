package br.com.kadoozin.cadastro_de_ninjas.Ninjas.repository;

import br.com.kadoozin.cadastro_de_ninjas.Ninjas.entities.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
