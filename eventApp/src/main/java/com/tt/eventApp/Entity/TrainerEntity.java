package com.tt.eventApp.Entity;

import javax.persistence.*;


@Entity
@Table(name = "trainer")
public class TrainerEntity {
@Id
@GeneratedValue (strategy = GenerationType.AUTO)

    private Long id;
    private String Nom;

    @Override 	public String toString() {
    return "TrainerEntity { " + "Id=" + id + ", Name=" + Nom + "}";
    }

    public TrainerEntity(String Nom, Long id) {

        this.Nom = Nom;
        this.id=id;
    }

    public TrainerEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
}
