package com.uc.querydsl.model.dto;

import com.uc.querydsl.model.entity.Category;
import com.uc.querydsl.model.entity.Teacher;
import lombok.Data;
@Data
public class CourseDto {
    private String title;
    private String lesson;
    private String description;
    private Category category;
    private Teacher teacher;

}
