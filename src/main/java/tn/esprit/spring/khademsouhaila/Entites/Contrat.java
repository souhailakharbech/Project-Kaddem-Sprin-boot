package tn.esprit.spring.khademsouhaila.Entites;

import com.fasterxml.jackson.databind.DatabindException;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import lombok.*;


@Entity  //définit une classe java , il est associée à une table dans la bd
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contrat implements Serializable {
    @Id //obligatoire
    @GeneratedValue(strategy = GenerationType.IDENTITY) //strategy : auto incre dans la bd
    @Column(name="idContrat")
    private Integer idContrat; // Clé primaire

    @Temporal (TemporalType.DATE)
    private Date dateDebutContrat;
    @Temporal (TemporalType.DATE)
    private Date dateFinContrat;

    private Boolean archive;
    private Integer montantContart;
    private String nomE;

    @Enumerated(EnumType.STRING) //string non ordinaire
    private specialite specialite;
    @ManyToOne(cascade = CascadeType.ALL)
    Etudiant etudiant;

    @OneToOne(mappedBy="contrat")
    private Equipe equipe;

}

