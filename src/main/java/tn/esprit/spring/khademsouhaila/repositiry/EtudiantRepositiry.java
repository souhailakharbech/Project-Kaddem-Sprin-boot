package tn.esprit.spring.khademsouhaila.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.khademsouhaila.Entites.Etudiant;
import tn.esprit.spring.khademsouhaila.Entites.niveau;
import tn.esprit.spring.khademsouhaila.Entites.specialite;

import java.util.List;
@Repository

public interface EtudiantRepositiry extends JpaRepository <Etudiant,Long> {
    //Récupérer les étudiants d’un département donné
    //keywords :
   // List<Etudiant>findByDepartementidDepart(Long idDepart);
    //JPQL  : version o.o de sql :on communique avec les entités et non les tables dans BD

    //@Query("select e from Etudiant e where e.department.idDepart=:department.idDepart")
    //Récupérer les étudiants dont l’équipe a un niveau SENIOR
    //List<Etudiant>findByEquipeNiveau(niveau n);


    //séléctionner la liste des étudiants dont les contrats de spécialité sécurité (à corriger)
//@Query("SELECT e FROM Etudiant e, Contrat c where e.idEtudiant= c.e.idEtudiant and c.specialite ='SECURITE'")
  // List<Etudiant> retrieveEtudiantsBySpecialiteContrat(@Param("specialite") specialite specialite);

}
