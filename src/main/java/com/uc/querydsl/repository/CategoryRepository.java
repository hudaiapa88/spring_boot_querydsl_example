package com.uc.querydsl.repository;

import com.infobip.spring.data.jpa.ExtendedQuerydslJpaRepository;

import com.uc.querydsl.model.entity.Category;


public interface CategoryRepository extends ExtendedQuerydslJpaRepository<Category, Long> {
}
