package tn.esprit.spring.khademsouhaila.Services;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.flogger.Flogger;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khademsouhaila.Entites.Equipe;
import tn.esprit.spring.khademsouhaila.Entites.niveau;
import tn.esprit.spring.khademsouhaila.repositiry.EquipeRepositiry;

import java.util.List;
import java.util.logging.LogManager;
import java.util.logging.Logger;

@Service
@Slf4j
@AllArgsConstructor
@Component
@Aspect

public class EquipeService implements IEquipeService{


    EquipeRepositiry equipeRepositiry;





  // création d'un objet  Equipe equipe = new Equipe(1,"webuild", niveau.SENIOR,...) ; on va le remplacer par @builder selon Lombok
   // Equipe equipe = Equipe.builder().nomEquipe("WeBuild").niveau(niveau.SENIOR).build();

    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepositiry.findAll(); //afficher tous les equipes
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        log.info("");
        return equipeRepositiry.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {

        return equipeRepositiry.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepositiry.findById(idEquipe.intValue()).get();
    }

    @Override
    public void deleteEquipe(Integer idEquipe) {
        equipeRepositiry.deleteById(idEquipe.intValue());

    }
}
