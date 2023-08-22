package com.springproj.app1.service;

import com.springproj.app1.entity.Models;

import java.util.List;
import java.util.Optional;

public interface ModelService {
    public List<Models> getAllModels();
    public Optional<Models> getModelById(int ModelId);
    public Models addORupdateModel(Models models);
    public Models deleteModel(int modelId);

}
