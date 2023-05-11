package tn.esprit.spring.khademsouhaila.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khademsouhaila.Entites.Department;
import tn.esprit.spring.khademsouhaila.Entites.Equipe;
import tn.esprit.spring.khademsouhaila.Entites.Etudiant;
import tn.esprit.spring.khademsouhaila.Services.EtudiantService;
import tn.esprit.spring.khademsouhaila.Services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;

    // http://localhost:8089/khademSouhaila/etudiant/affecter-etudiant-departement
    @PostMapping ("/affecter-etudiant-departement/{etudiant-id}/{departementt-id}")
     public void assignEtudiantToDepartment(@PathVariable("etudiant-id")Long idEtudiant ,
       @PathVariable("departementt-id")Integer idDepart)
     {
       etudiantService.assignEtudiantToDepartment(idEtudiant,idDepart);
     }




    // http://localhost:8089/khademSouhaila/etudiant/affecter-etudiant-departement-contrat-equipe/{departementt-id}/{contrat-id}/{equipe-id}
    @PostMapping ("/affecter-etudiant-departement-contrat-equipe/{departementt-id}/{contrat-id}/{equipe-id}")
    public void addAndAssignEtudiantToDepartmentAndContratAndEquipe(@RequestBody Etudiant etudiant,@PathVariable("departementt-id")Integer idDepart,@PathVariable("contrat-id")Integer idContrat ,@PathVariable("equipe-id")Integer idEquipe )
    {
         etudiantService.addAndAssignEtudiantToDepartmentAndContratAndEquipe(etudiant,  idDepart, idContrat, idEquipe);
    }




    // http://localhost:8089/KhademSouhaila/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }

    // http://localhost:8089/KhademSouhaila/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        return etudiantService.retrieveEtudiant(idEtudiant);
    }

    // http://localhost:8089/KhademSouhaila/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant et) {
        Etudiant etudiant = etudiantService.addEtudiant(et);
        return etudiant;
    }
    // http://localhost:8089/KhademSouhaila/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeOperateur(@PathVariable("etudiant-id") Long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }

    // http://localhost:8089/KhademSouhaila/etudiant/update-etudiant
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant et) {
        Etudiant etudiant= etudiantService.updateEtudiant(et);
        return etudiant;
    }
}
