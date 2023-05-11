package tn.esprit.spring.khademsouhaila.Services;

import tn.esprit.spring.khademsouhaila.Entites.Contrat;
import tn.esprit.spring.khademsouhaila.Entites.Etudiant;

import java.util.List;

public interface IContratService {
    List<Contrat> retrieveAllContrat();

    Contrat addContrat(Contrat c);

    Contrat updateContrat (Contrat c);

    Contrat retrieveContrat (Integer idContrat);

    void deleteContrat(Integer idContrat); //entéte

    void retrieveAndUpdateStatusContrat ();

}
