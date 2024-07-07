package com.project.expense_tracker.services;

import java.util.List;

import com.project.expense_tracker.domain.Category;
import com.project.expense_tracker.exceptions.EtBadRequestException;
import com.project.expense_tracker.exceptions.EtResourceNotFoundException;

public interface CategoryService {

    List<Category> fetchAllCategories(Integer userId);

    Category fetchCategoryById(Integer userId, Integer categoryId) throws EtResourceNotFoundException;

    Category addCategory(Integer userId, String title, String description) throws EtBadRequestException;

    void updateCategory(Integer userId, Integer categoryId, Category category) throws EtBadRequestException;

    void removeCategoryWithAllTransaction(Integer userId, Integer categoryId) throws EtResourceNotFoundException;
    
    
}
