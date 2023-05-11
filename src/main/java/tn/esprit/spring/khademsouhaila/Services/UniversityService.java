package tn.esprit.spring.khademsouhaila.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khademsouhaila.Entites.Department;
import tn.esprit.spring.khademsouhaila.Entites.Etudiant;
import tn.esprit.spring.khademsouhaila.Entites.University;
import tn.esprit.spring.khademsouhaila.repositiry.DepartementRepositiry;
import tn.esprit.spring.khademsouhaila.repositiry.UniversityRepositiry;

import java.util.List;
import java.util.Set;

@Service
@Slf4j
@AllArgsConstructor

public class UniversityService implements IUniversityService{
    UniversityRepositiry universityRepositiry;
    DepartementRepositiry departementRepositiry;
    public void assignUniversityToDepartment(Integer idUniv,Integer idDepart){
        University u = universityRepositiry.findById(idUniv).get();
        Department d = departementRepositiry.findById(idDepart).get();
        u.getDepartments().add(d);
        universityRepositiry.save(u);
    }
    @Override
    public List<University> retrieveAllUniversity() {

        return universityRepositiry.findAll();
    }

    @Override
    public University addUniversity(University u) {

        return universityRepositiry.save(u);
    }

    @Override
    public University updateUniversity(University u) {

        return universityRepositiry.save(u);
    }

    @Override
    public University retrieveUniversity(Integer idUniv) {

        return universityRepositiry.findById(idUniv.intValue()).get();
    }

    @Override
    public void deleteUniversity(Integer idUniv) {
        universityRepositiry.deleteById(idUniv.intValue());

    }
}
