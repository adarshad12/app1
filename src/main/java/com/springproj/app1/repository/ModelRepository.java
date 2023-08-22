package com.springproj.app1.repository;

import com.springproj.app1.entity.Models;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends CrudRepository<Models, Integer> {

}
