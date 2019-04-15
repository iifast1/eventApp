package com.tt.eventApp.Dao;


public class SalleDao {
    private Long id;
    private String Salle;

    public SalleDao() {
    }

    public SalleDao(Long id, String Salle) {
        this.id = id;
        Salle = Salle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSalle() {
        return Salle;
    }

    public void setSalle(String Salle) {
        this.Salle = Salle;
    }
}
