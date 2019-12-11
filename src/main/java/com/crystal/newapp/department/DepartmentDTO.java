package com.crystal.newapp.department;

public class DepartmentDTO {
    private Long id;
    private String dname;

    public DepartmentDTO() {
    }

    public DepartmentDTO(Long id, String dname) {
        this.id = id;
        this.dname = dname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
