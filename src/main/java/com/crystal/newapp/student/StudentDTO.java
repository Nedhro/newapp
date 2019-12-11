package com.crystal.newapp.student;

public class StudentDTO {
    private Long id;
    private String name;
    private String qualification;
    private int mobile;

    public StudentDTO() {
    }

    public StudentDTO(Long id, String name, String qualification, int mobile) {
        this.id = id;
        this.name = name;
        this.qualification = qualification;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
}
