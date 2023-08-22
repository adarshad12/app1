package com.springproj.app1.controller;

import com.springproj.app1.entity.Variants;
import com.springproj.app1.service.VariantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/products/allProducts/{Id}/allModels/{Id2}")
public class VariantController {


    private final VariantService variantService;

    public VariantController(VariantService variantService) {
        this.variantService = variantService;
    }

    //    public VariantController(VariantService variantService) {
//        this.variantService = variantService;
//    }
    @GetMapping(path = "/variants")
    public ResponseEntity<List<Variants>> getAllVariants(@PathVariable String Id, @PathVariable String Id2){
        List<Variants> variants = null;
        try{
            variants = variantService.getAllVariants();
        }catch(Exception exception){
            exception.getMessage();
        }
        return new ResponseEntity<>(variants, HttpStatus.OK);
    }

    @GetMapping(path = "/variants/{Id3}")
    public Optional<Variants> getVariantById(@PathVariable("Id3") int variantId, @PathVariable String Id, @PathVariable String Id2) {
        Optional<Variants> variants = Optional.empty();
        try {
            variants = variantService.getVariantById(variantId);
        } catch (Exception exception) {
            exception.getMessage();
        }
        return variants;
    }
}
