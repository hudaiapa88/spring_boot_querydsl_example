package com.uc.querydsl.mapper;

import com.uc.querydsl.model.dto.CategoryDto;
import com.uc.querydsl.model.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryDtoMapper extends BaseMapper<Category, CategoryDto>{
}
