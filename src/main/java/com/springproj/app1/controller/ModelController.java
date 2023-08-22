package com.springproj.app1.controller;

import com.springproj.app1.entity.Models;
import com.springproj.app1.service.ModelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products/allProducts/{Id}")
public class ModelController {
    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

//    public ModelController(ModelService modelService) {
//        this.modelService = modelService;
//    }

    @GetMapping(path = "/allModels")
    public ResponseEntity<List<Models>> getAllModels(@PathVariable String Id){

        List<Models> models = null;
        try {
            models = modelService.getAllModels();
        } catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<>(models, HttpStatus.OK);
    }

    @GetMapping(path = "/allModels/{Id2}")
    public Optional<Models> getModelById(@PathVariable("Id2") int modelId, @PathVariable String Id){
        Optional<Models> models = Optional.empty();
        try {
            models = modelService.getModelById(modelId);
        }catch (Exception exception){
            exception.getMessage();
        }
        return models;
    }

}
