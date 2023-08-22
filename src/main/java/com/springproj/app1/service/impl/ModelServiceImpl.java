package com.springproj.app1.service.impl;

import com.springproj.app1.entity.Models;
import com.springproj.app1.repository.ModelRepository;
import com.springproj.app1.service.ModelService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelServiceImpl implements ModelService {

    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

//    @Override
//    public List<Models> getAllModels() {
//        List<Models> allmodels = (List<Models>) modelRepository.findAll();
//        List<Models> myList = new ArrayList<>();
//        for (Models model : allmodels) {
//            if (Objects.equals(model.getCid(), cate))
//        }
//    }

    @Override
    public List<Models> getAllModels() {
        return (List<Models>) modelRepository.findAll();
    }

    @Override
    public Optional<Models> getModelById(int ModelId) {
        System.out.println(ModelId);
        return modelRepository.findById(ModelId);
    }

    @Override
    public Models addORupdateModel(Models models) {
        return modelRepository.save(models);
    }

    @Override
    public Models deleteModel(int modelId) {
        Models deletedModels;
        try {
            deletedModels = modelRepository.findById(modelId).orElse(null);
            if(deletedModels == null){
                throw new Exception("Model Not Found");
            }else{
                modelRepository.deleteById(modelId);
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return deletedModels;
    }

}

