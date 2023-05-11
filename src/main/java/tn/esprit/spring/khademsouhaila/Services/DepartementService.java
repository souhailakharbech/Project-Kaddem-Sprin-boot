package tn.esprit.spring.khademsouhaila.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.khademsouhaila.Entites.Department;
import tn.esprit.spring.khademsouhaila.repositiry.DepartementRepositiry;

import java.util.List;
@Service
@Slf4j
@AllArgsConstructor

public class DepartementService implements IDepartmentService{
    DepartementRepositiry departementRepositiry;
    @Override
    public List<Department> retrieveAllDepartment() {

        return departementRepositiry.findAll();
    }

    @Override
    public Department addDepartment(Department d) {

        return departementRepositiry.save(d);
    }

    @Override
    public Department updateDepartment(Department d) {

        return departementRepositiry.save(d);
    }

    @Override
    public Department retrieveDepartment(Integer idDepart) {

        return departementRepositiry.findById(idDepart.intValue()).get();
    }

    @Override
    public void deleteDepartment(Integer idDepart) {
     departementRepositiry.deleteById(idDepart.intValue());
    }
}
