package com.shiringu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiringu.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
