package com.springproj.app1.service;
import com.springproj.app1.entity.Variants;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface VariantService {
    List<Variants> getAllVariants();

    public Optional<Variants> getVariantById(int VariantId);

    Variants addORupdateVariant(Variants variants);

    Variants deleteVariant(int variantId);
}
