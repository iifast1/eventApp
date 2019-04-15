package com.tt.eventApp.Dao;

public class TrainingDao {
    private Long id;
    private String Title;
    private String Description;

    public TrainingDao() {
    }

    public TrainingDao(Long id, String Title, String Description) {
        this.id = id;
        this.Title = Title;
        this.Description = Description;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getTitle() { return Title; }

    public void setTitle(String Title) { this.Title = Title; }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}
