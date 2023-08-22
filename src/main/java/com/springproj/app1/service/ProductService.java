package com.springproj.app1.service;

import com.springproj.app1.entity.Products;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    public List<Products> getAllCategories();
    public Products getCategoryById(int CategoryId);
    public Products addORupdateCategory(Products product1);
    public Products deleteCategory(int CategoryId);

}
