package com.springproj.app1.service.impl;
import com.springproj.app1.entity.Variants;
import com.springproj.app1.repository.VariantRepository;
import com.springproj.app1.service.VariantService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VariantServiceImpl implements VariantService {
    private final VariantRepository variantRepository;


    public VariantServiceImpl(VariantRepository variantRepository) {
        this.variantRepository = variantRepository;
    }

    @Override
    public List<Variants> getAllVariants() {
        return (List<Variants>) variantRepository.findAll();
    }

    @Override
    public Optional<Variants> getVariantById(int productId) {
        return variantRepository.findById(productId);
    }

    @Override
    public Variants addORupdateVariant(Variants variants) {
        return variantRepository.save(variants);
    }

    @Override
    public Variants deleteVariant(int variantId) {
        Variants deletedVariants;
        try {
            deletedVariants = variantRepository.findById(variantId).orElse(null);
            if(deletedVariants == null){
                throw new Exception("Variant Not Found");
            }else{
                variantRepository.deleteById(variantId);
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        return deletedVariants;
    }
}
