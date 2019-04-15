package com.tt.eventApp.Entity;


import javax.persistence.*;

@Entity
@Table(name = "salle")
public class SalleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Salle;

    public SalleEntity(Long id, String Salle) {

        this.id=id;
        this.Salle=Salle;
    }

    public SalleEntity(){}

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getSalle() { return Salle; }

    public void setSalle(String Salle) { this.Salle = Salle; }
}
