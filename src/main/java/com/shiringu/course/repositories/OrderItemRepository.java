package com.shiringu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiringu.course.entities.OrderItem;
import com.shiringu.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
