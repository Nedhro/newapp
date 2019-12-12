package com.crystal.newapp.results;

import com.crystal.newapp.department.DepartmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {
    @Autowired
    private ResultService resultService;

    @PostMapping("/saveResult")
    public ResponseEntity<?> saveResult(@RequestBody ResultDTO dto) {
        try {
            resultService.saveResult(dto);
            return ResponseEntity.ok(dto);
        } catch (Exception ex) {
            return ResponseEntity.ok(ex.getMessage());
        }
    }
}
