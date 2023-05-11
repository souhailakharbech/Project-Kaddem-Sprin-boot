package tn.esprit.spring.khademsouhaila.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khademsouhaila.Entites.Equipe;
import tn.esprit.spring.khademsouhaila.Entites.Etudiant;
import tn.esprit.spring.khademsouhaila.Entites.University;
import tn.esprit.spring.khademsouhaila.Services.IUniversityService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/university")
public class UniversityController {
    IUniversityService universityService;
    // http://localhost:8089/khademSouhaila/university/affecter-university-departement/{university-id}/{university-id}
    @PutMapping  ("/affecter-university-departement/{university-id}/{departementt-id}")
    public void assignUniversiteToDepartement(@PathVariable("university-id")Integer idUniv ,
                                           @PathVariable("departementt-id")Integer idDepart)
    {
        universityService.assignUniversityToDepartment(idUniv,idDepart);
    }



    // http://localhost:8089/KhademSouhaila/university/retrieve-all-university
    @GetMapping("/retrieve-all-university")
    public List<University> getUniversities() {
        List<University> listUniversities = universityService.retrieveAllUniversity();
        return listUniversities;
    }

    // http://localhost:8089/KhademSouhaila/university/retrieve-university/8
    @GetMapping("/retrieve-university/{university-id}")
    public University retrieveUniversity(@PathVariable("university-id") Integer idUniv) {
        return universityService.retrieveUniversity(idUniv);
    }

    // http://localhost:8089/KhademSouhaila/university/add-university
    @PostMapping("/add-university")
    public University addUniversity(@RequestBody University u) {
       University university = universityService.addUniversity(u);
        return university;
    }

    // http://localhost:8089/KhademSouhaila/university/remove-university/1
    @DeleteMapping("/remove-university/{university-id}")
    public void removeOperateur(@PathVariable("university-id") Integer idUniv) {
        universityService.deleteUniversity(idUniv);
    }


    // http://localhost:8089/KhademSouhaila/university/update-university
    @PutMapping("/update-university")
    public University updateUniversity(@RequestBody University u) {
        University university= universityService.updateUniversity(u);
        return university;
    }
}
