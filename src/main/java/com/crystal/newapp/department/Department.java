package com.crystal.newapp.department;

import com.crystal.newapp.results.Result;
import com.crystal.newapp.student.Student;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "dname", length = 50)
    private String dname;
    @OneToMany( cascade = CascadeType.ALL)
    private Set<Student> students;
    @ManyToOne( cascade = CascadeType.ALL)
    private Result results;

    public Department() {
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

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Result getResults() {
        return results;
    }

    public void setResults(Result results) {
        this.results = results;
    }
}
