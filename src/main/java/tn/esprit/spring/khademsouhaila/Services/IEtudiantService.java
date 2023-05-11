package tn.esprit.spring.khademsouhaila.Services;


import tn.esprit.spring.khademsouhaila.Entites.Etudiant;

import java.util.List;

public interface IEtudiantService  {
    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant(Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant (Long idEtudiant);

    void deleteEtudiant(Long idEtudiant);
    public void assignEtudiantToDepartment(Long idEtudiant,Integer idDepart);

    public void addAndAssignEtudiantToDepartmentAndContratAndEquipe(Etudiant etudiant,Integer idDepart,Integer idContrat,Integer idEquipe);

}
