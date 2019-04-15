package com.tt.eventApp.Dao;


public class TrainerDao {
    private Long id;
    private String Nom;

    public TrainerDao() {
    }

    public TrainerDao(Long id, String Nom) {
        this.id = id;
        this.Nom = Nom;
    }

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
        Nom = Nom;
    }
}
