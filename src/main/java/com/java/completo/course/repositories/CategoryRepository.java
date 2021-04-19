package com.java.completo.course.repositories;

import com.java.completo.course.entities.Category;
import com.java.completo.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
