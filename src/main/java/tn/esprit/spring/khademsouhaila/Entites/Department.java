package tn.esprit.spring.khademsouhaila.Entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table( name = "Departement")

public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Integer idDepart; // Clé primaire
    private String nomDepat;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="department")
    @JsonIgnore
    private Set<Etudiant> etudiant;


// Constructeur et accesseurs (getters) et mutateurs (setters)
}
