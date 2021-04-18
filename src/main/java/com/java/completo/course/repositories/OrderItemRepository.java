package com.java.completo.course.repositories;

import com.java.completo.course.entities.Order;
import com.java.completo.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
