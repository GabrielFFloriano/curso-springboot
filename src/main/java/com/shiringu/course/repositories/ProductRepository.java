package com.shiringu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiringu.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
