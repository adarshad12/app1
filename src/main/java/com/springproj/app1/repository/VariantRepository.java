package com.springproj.app1.repository;

import com.springproj.app1.entity.Variants;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariantRepository extends CrudRepository<Variants, Integer> {

}
