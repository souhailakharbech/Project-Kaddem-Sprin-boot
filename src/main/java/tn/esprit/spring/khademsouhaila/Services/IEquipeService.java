package tn.esprit.spring.khademsouhaila.Services;

import tn.esprit.spring.khademsouhaila.Entites.Equipe;

import java.util.List;

public interface IEquipeService {
    List<Equipe> retrieveAllEquipes();

    Equipe addEquipe(Equipe e);

    Equipe updateEquipe (Equipe e);

    Equipe retrieveEquipe (Integer idEquipe);

    void deleteEquipe(Integer idEquipe);

}
