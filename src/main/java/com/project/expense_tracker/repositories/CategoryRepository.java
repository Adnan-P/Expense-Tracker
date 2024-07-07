package com.project.expense_tracker.repositories;

import java.util.List;

import com.project.expense_tracker.domain.Category;
import com.project.expense_tracker.exceptions.EtBadRequestException;
import com.project.expense_tracker.exceptions.EtResourceNotFoundException;

public interface CategoryRepository {

    List<Category> findAll(Integer userId) throws EtResourceNotFoundException;

    Category findById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Integer create(Integer userId, String title, String description) throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId);

    
}
