package com.crystal.newapp.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    @Transactional
    public Department saveDepartment(DepartmentDTO dto){
        Department department =new Department();
        department.setDname(dto.getDname());
        return departmentRepo.save(department);
    }
}
