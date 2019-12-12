package com.crystal.newapp.results;

import com.crystal.newapp.department.Department;
import com.crystal.newapp.student.Student;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "results")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "gpa")
    private String gpa;
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "results")
    private Set<Department> department= new HashSet<>();
    @ManyToMany( cascade = CascadeType.ALL)
    private Set<Student> students;

    public Result() {
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public Set<Department> getDepartment() {
        return department;
    }

    public void setDepartment(Set<Department> department) {
        this.department = department;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
