package com.springproj.app1.service.impl;

import com.springproj.app1.entity.Products;
import com.springproj.app1.repository.ProductRepository;
import com.springproj.app1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

//    @Autowired
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Products> getAllCategories() {
        return (List<Products>) productRepository.findAll();
    }

    @Override
    public Products getCategoryById(int CategoryId) {
        System.out.println(CategoryId);
        return productRepository.findById(CategoryId).orElse(null);
    }

    @Override
    public Products addORupdateCategory(Products products) {
        return productRepository.save(products);
    }

    @Override
    public Products deleteCategory(int CategoryId) {
        Products deletedProducts;
        try {
            deletedProducts = productRepository.findById(CategoryId).orElse(null);
            if(deletedProducts == null){
                throw new Exception("Category Not Found");
            }else{
                productRepository.deleteById(CategoryId);
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return deletedProducts;
    }

}
