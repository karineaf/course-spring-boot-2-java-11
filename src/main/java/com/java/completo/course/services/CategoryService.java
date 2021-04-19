package com.java.completo.course.services;

import com.java.completo.course.entities.Category;
import com.java.completo.course.entities.Order;
import com.java.completo.course.repositories.CategoryRepository;
import com.java.completo.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> category = repository.findById(id);
        return category.get();
    }
}
