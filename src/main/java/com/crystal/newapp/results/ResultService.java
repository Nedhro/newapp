package com.crystal.newapp.results;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ResultService {
    @Autowired
    private ResultRepo resultRepo;

    @Transactional
    public Result saveResult(ResultDTO dto){
        Result result=new Result();
        result.setGpa(dto.getGpa());
        return resultRepo.save(result);
    }
}
