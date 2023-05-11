package tn.esprit.spring.khademsouhaila.Services;

import tn.esprit.spring.khademsouhaila.Entites.DetailsEquipe;
import tn.esprit.spring.khademsouhaila.Entites.Etudiant;

import java.util.List;

public interface IDetailsEquipeService {
    List<DetailsEquipe> retrieveAllDetailsEquipe();

   Integer idDetailEquipeaddDetailsEquipe(DetailsEquipe de);

   DetailsEquipe updateDetailsEquipe (DetailsEquipe de);

    DetailsEquipe retrieveDetailsEquipe(Integer idDetailEquipe);

    void deleteDetailsEquipe(Integer idDetailEquipe);
}
