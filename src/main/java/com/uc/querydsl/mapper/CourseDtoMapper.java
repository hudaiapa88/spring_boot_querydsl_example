package com.uc.querydsl.mapper;

import com.uc.querydsl.model.dto.CourseDto;
import com.uc.querydsl.model.entity.Course;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseDtoMapper extends BaseMapper<Course, CourseDto>{
}
