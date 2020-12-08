package com.panticdamjan.Project.service;

import com.panticdamjan.Project.model.SimpleModel;
import com.panticdamjan.Project.repository.SimpleRepository;
import com.panticdamjan.Project.repository.SimpleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    @Autowired
    SimpleRepository simpleRepository;

    public int incrementCounter() {
        SimpleModel simpleModel = simpleRepository.findById(new Long(0)).orElse(null);

        if (simpleModel == null){
            simpleModel = new SimpleModel();
            simpleModel.setId(new Long(0));
            simpleModel.setCounter(0);
        }

        simpleModel.setCounter(simpleModel.getCounter()+1);

        simpleRepository.save(simpleModel);

        return simpleModel.getCounter();
    }
}
