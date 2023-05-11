package tn.esprit.spring.khademsouhaila.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.khademsouhaila.Entites.Contrat;
import tn.esprit.spring.khademsouhaila.Entites.Department;
import tn.esprit.spring.khademsouhaila.Entites.Equipe;
import tn.esprit.spring.khademsouhaila.Services.IDepartmentService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentController {
    IDepartmentService departmentService;

    // http://localhost:8089/KhademSouhaila/department/retrieve-all-departments
    @GetMapping("/retrieve-all-departments")
    public List<Department> getDepartments (){
        List<Department> listDepartments = departmentService.retrieveAllDepartment();
        return listDepartments;
    }

    // http://localhost:8089/KhademSouhaila/department/retrieve-department/8
    @GetMapping("/retrieve-department/{depart-id}")
    public Department retrieveDepartment(@PathVariable("depart-id") Integer idDepart) {
        return departmentService.retrieveDepartment(idDepart);
    }

    // http://localhost:8089/KhademSouhaila/department/add-department
    @PostMapping("/add-department")
    public Department addDepartment(@RequestBody Department d) {
        Department department = departmentService.addDepartment(d);
        return department;
    }

    // http://localhost:8089/KhademSouhaila/department/remove-department/1
    @DeleteMapping("/remove-department/{department-id}")
    public void removeOperateur(@PathVariable("department-id") Integer idDepart) {
        departmentService.deleteDepartment(idDepart);
    }

    // http://localhost:8089/KhademSouhaila/department/update-department
    @PutMapping("/update-department")
    public Department updateDepartment(@RequestBody Department d) {
        Department department= departmentService.updateDepartment(d);
        return department;
    }
}
