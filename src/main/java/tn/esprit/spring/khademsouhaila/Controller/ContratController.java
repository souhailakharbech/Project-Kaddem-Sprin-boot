package tn.esprit.spring.khademsouhaila.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khademsouhaila.Entites.Contrat;
import tn.esprit.spring.khademsouhaila.Entites.Equipe;
import tn.esprit.spring.khademsouhaila.Services.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratController {
    IContratService contratService;
    //Contrat affectContratToEtudiant (Contrat ce, nomE:String,prenomE:String);

    // http://localhost:8089/KhademSouhaila/contrat/retrieve-all-contrats
    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> getContrat() {
        List<Contrat> listContrats = contratService.retrieveAllContrat(); //lista njbouha mn service
        return listContrats;
    }

    // http://localhost:8089/KhademSouhaila/contrat/retrieve-contrat/8
    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Integer idContrat) {
        return contratService.retrieveContrat(idContrat);
    }

    // http://localhost:8089/KhademSouhaila/contrat/add-contrat
    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat c) {
        Contrat contrat = contratService.addContrat(c);
        return contrat;
    }

    // http://localhost:8089/KhademSouhaila/contrat/remove-contrat/1
    @DeleteMapping("/remove-contrat/{contrat-id}")
    public void removeOperateur(@PathVariable("contrat-id") Integer idContrat) {
        contratService.deleteContrat(idContrat);
    }

    // http://localhost:8089/KhademSouhaila/contrat/update-contrat
    @PutMapping("/update-contrat")
    public Contrat updateContrat(@RequestBody Contrat c) {
        Contrat contrat= contratService.updateContrat(c);
        return contrat;
    }
}
