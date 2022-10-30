package com.uc.querydsl.repository;

import com.uc.querydsl.model.entity.Category;
import com.uc.querydsl.model.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
