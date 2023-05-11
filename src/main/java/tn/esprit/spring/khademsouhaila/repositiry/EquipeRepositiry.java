package tn.esprit.spring.khademsouhaila.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.khademsouhaila.Entites.Equipe;

@Repository

public interface EquipeRepositiry extends JpaRepository<Equipe,Integer> {



}
