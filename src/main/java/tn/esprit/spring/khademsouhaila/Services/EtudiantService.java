package tn.esprit.spring.khademsouhaila.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khademsouhaila.Entites.*;
import tn.esprit.spring.khademsouhaila.repositiry.ContratRepositiry;
import tn.esprit.spring.khademsouhaila.repositiry.DepartementRepositiry;
import tn.esprit.spring.khademsouhaila.repositiry.EquipeRepositiry;
import tn.esprit.spring.khademsouhaila.repositiry.EtudiantRepositiry;

import java.util.List;

@Service
@Slf4j    //?????
@AllArgsConstructor //==@RequiredArgsConstructor


public class EtudiantService implements IEtudiantService{
    //on peut faire une annotation @Autowired ici pour injecter la dep ou bien on ajoute @AllargsConstructor
    EtudiantRepositiry etudiantRepositiry;
    //à corrigé
    DepartementRepositiry departementRepositiry;
    ContratRepositiry contratRepositiry;
    EquipeRepositiry equipeRepositiry;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {

        return etudiantRepositiry.findAll();
    }

    public void assignEtudiantToDepartment(Long idEtudiant,Integer idDepart){
        Etudiant et = etudiantRepositiry.findById(idEtudiant).get();
    Department d = departementRepositiry.findById(idDepart).get();
    et.setDepartment(d);
    etudiantRepositiry.save(et);
    }

    @Override
    public void addAndAssignEtudiantToDepartmentAndContratAndEquipe(Etudiant etudiant, Integer idDepart, Integer idContrat, Integer idEquipe) {
        //On a 3 objets dans la BD , on va le récupérer
        Department d = departementRepositiry.findById(idDepart).get();
        Equipe e = equipeRepositiry.findById(idContrat).get();
        Contrat c = contratRepositiry.findById(idEquipe).get();
        //etudiant à ajouter
        Etudiant et = etudiantRepositiry.save(etudiant);
        //Affectation à un département
        et.setDepartment(d);
        //affectation à un contrat
        c.setEtudiant(etudiant);
        //affectaion à une equipe
        et.getEquipes().add(e);

        etudiantRepositiry.save(et);
    }


    @Override
    public Etudiant addEtudiant(Etudiant e) {

        return etudiantRepositiry.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {

        return etudiantRepositiry.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {

        return etudiantRepositiry.findById(idEtudiant.longValue()).get();
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepositiry.deleteById(idEtudiant.longValue());

    }
}
