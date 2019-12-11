package com.crystal.newapp.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    public ResponseEntity<?> saveDepartment(@RequestBody DepartmentDTO dto) {
        try {
            departmentService.saveDepartment(dto);
            return ResponseEntity.ok(dto);
        } catch (Exception ex) {
            return ResponseEntity.ok(ex.getMessage());
        }
    }
}