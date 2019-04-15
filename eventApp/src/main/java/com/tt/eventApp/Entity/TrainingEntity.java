package com.tt.eventApp.Entity;

import javax.persistence.*;

@Entity
@Table(name = "training")
public class TrainingEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String Title;
    private String Description;

    public TrainingEntity(String Title, Long id,String Description) {
    this.Title=Title;
    this.id=id;
    this.Description=Description; }

    public TrainingEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
