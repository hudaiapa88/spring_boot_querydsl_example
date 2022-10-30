package com.uc.querydsl.repository;

import com.uc.querydsl.model.entity.Category;
import com.uc.querydsl.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
