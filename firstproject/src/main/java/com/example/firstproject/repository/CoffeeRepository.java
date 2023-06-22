package com.example.firstproject.repository;

import com.example.firstproject.entity.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, Long> {
}
