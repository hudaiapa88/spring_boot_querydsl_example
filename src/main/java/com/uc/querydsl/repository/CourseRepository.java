package com.uc.querydsl.repository;

import com.uc.querydsl.model.entity.Category;
import com.uc.querydsl.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
