package tn.esprit.spring.khademsouhaila.repositiry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.khademsouhaila.Entites.Department;

@Repository

public interface DepartementRepositiry extends JpaRepository<Department,Integer> {
}
