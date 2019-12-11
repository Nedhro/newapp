package com.crystal.newapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(StudentDTO dto){
        Student student=new Student();
        student.setName(dto.getName());
        student.setQualification(dto.getQualification());
        student.setMobile(dto.getMobile());
        return studentRepo.save(student);
    }
}
