package com.springproj.app1.controller;

import com.springproj.app1.entity.Products;
import com.springproj.app1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
    @Autowired
    private ProductService productService;

//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }

    @GetMapping(path = "/allProducts")
    public ResponseEntity<List<Products>> getAllCategories(){
        List<Products> products = null;
        try {
            System.out.println("ok till now");

            products = productService.getAllCategories();
//            List<User> u = users;
//            System.out.println(u.size());
        } catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping(path = "/allProducts/{Id}")
    public ResponseEntity<Products> getCategoryById(@PathVariable("Id") int CategoryId){
        Products products = null;
        // create validation for products not found

        try{
            products = productService.getCategoryById(CategoryId);
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping(path = "/addORupdate")
    public ResponseEntity<Products> addORupdateUser(@RequestBody Products products1){
        Products products = null;
        try{
            products = productService.addORupdateCategory(products1);
        }catch (Exception ex){
            ex.getMessage();
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

//    @DeleteMapping(path = "/deleteCategory")
//    public ResponseEntity<Products> deleteCategory(int categoryId){
//
//    }

}
