package com.crystal.newapp.results;

public class ResultDTO {
    private Long id;
    private String gpa;

    public ResultDTO(String gpa) {
        this.gpa = gpa;
    }

    public ResultDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
}
