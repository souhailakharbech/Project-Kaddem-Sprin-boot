package tn.esprit.spring.khademsouhaila.Services;

import tn.esprit.spring.khademsouhaila.Entites.Department;
import tn.esprit.spring.khademsouhaila.Entites.Etudiant;

import java.util.List;

public interface IDepartmentService {
    List<Department> retrieveAllDepartment();

    Department addDepartment(Department d);

    Department updateDepartment (Department d);

    Department retrieveDepartment( Integer idDepart);

    void deleteDepartment( Integer idDepart);
}
