package tn.esprit.spring.khademsouhaila.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khademsouhaila.Entites.Contrat;
import tn.esprit.spring.khademsouhaila.Entites.Etudiant;
import tn.esprit.spring.khademsouhaila.repositiry.ContratRepositiry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
@Slf4j
@AllArgsConstructor


public class ContratService implements IContratService{
    // contratrep est une une dépendance de ContratService
    ContratRepositiry contratRepositiry; //pour que le service faire appel ll rep lazmou un attribut de type rep
    @Override
    public List<Contrat> retrieveAllContrat() {
        return contratRepositiry.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepositiry.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {

        return contratRepositiry.save(c);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {

        return contratRepositiry.findById(idContrat.intValue()).get();
    }

    @Override
    public void deleteContrat(Integer idContrat) {
        contratRepositiry.deleteById(idContrat.intValue());

    }

    @Override
    @Scheduled(cron = "*/15 * * * * *")
    public void retrieveAndUpdateStatusContrat() {
        log.info("Hello");
        List<Contrat> listContrat= new ArrayList<>();
        listContrat = contratRepositiry.findAll();

        for (int i = 0; i <= listContrat.size(); i++) {
            Date dd = listContrat.get(i).getDateDebutContrat();
            Date df = listContrat.get(i).getDateFinContrat();
          // if(){}

    }
} }
