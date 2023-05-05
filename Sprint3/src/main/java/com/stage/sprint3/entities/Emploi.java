package com.stage.sprint3.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="emploi")
public class Emploi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "titre", length = 120, unique = true, nullable = false)
    private String titre;

    @Column(name = "description", length = 120, unique = true, nullable = false)
    private String description;

    @Column(name = "Date_debut")
    @Temporal(TemporalType.DATE)
    private Date Date_debut;

    @Column(name = "Date_fin")
    @Temporal(TemporalType.DATE)
    private Date Date_fin;

    @Column(name="salaire")
    private int salaire;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idInc", nullable = false)
    private Entreprise entreprise;

    public Emploi(int id, String titre, String description, Date date_debut, Date date_fin, int salaire, Entreprise entreprise) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        Date_debut = date_debut;
        Date_fin = date_fin;
        this.salaire = salaire;
        //this.entreprise = entreprise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_debut() {
        return Date_debut;
    }

    public void setDate_debut(Date date_debut) {
        Date_debut = date_debut;
    }

    public Date getDate_fin() {
        return Date_fin;
    }

    public void setDate_fin(Date date_fin) {
        Date_fin = date_fin;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

   /* public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }*/
}
