package tn.esprit.spring.khademsouhaila.Services;

import tn.esprit.spring.khademsouhaila.Entites.Etudiant;
import tn.esprit.spring.khademsouhaila.Entites.University;

import java.util.List;

public interface IUniversityService {
    List<University> retrieveAllUniversity();

    University addUniversity(University u);

    University updateUniversity (University u);

    University retrieveUniversity (Integer idUniv);

    void deleteUniversity(Integer idUniv);
    public void assignUniversityToDepartment(Integer idUniv,Integer idDepart);
}
