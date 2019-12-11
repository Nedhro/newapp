package com.crystal.newapp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/saveStudent")
    public ResponseEntity<?> saveStudent(@RequestBody StudentDTO dto) {
        try {
            service.saveStudent(dto);
            return ResponseEntity.ok(dto);
        } catch(Exception ex) {
            return ResponseEntity.ok(ex.getMessage());
        }
    }

    }