package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.*;

public interface ProductRepository extends JpaRepository<Product, Long> {

}