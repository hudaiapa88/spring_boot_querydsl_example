package com.uc.querydsl.service;

import com.uc.querydsl.mapper.CategoryDtoMapper;
import com.uc.querydsl.model.dto.CategoryDto;
import com.uc.querydsl.model.entity.Category;
import com.uc.querydsl.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class CategoryManager {

    private final CategoryDtoMapper categoryDtoMapper;
    private final CategoryRepository categoryRepository;

    public CategoryDto getAll(){
       // return categoryDtoMapper.convert(categoryRepository.query(query-> query.select(category)));
   return null;

    }
}
