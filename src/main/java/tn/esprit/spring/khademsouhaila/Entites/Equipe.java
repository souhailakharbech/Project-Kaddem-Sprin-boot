package tn.esprit.spring.khademsouhaila.Entites;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
    @Table( name = "Equipe")

public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idEquipe")
    private Integer idEquipe; // Clé primaire
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    private niveau niveau;
    @OneToOne(cascade = CascadeType.ALL)
    private DetailsEquipe detailsEquipe;
    @OneToOne
    private Contrat contrat;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

}
