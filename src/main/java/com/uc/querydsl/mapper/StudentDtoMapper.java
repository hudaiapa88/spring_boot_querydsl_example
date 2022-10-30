package com.uc.querydsl.mapper;

import com.uc.querydsl.model.dto.StudentDto;
import com.uc.querydsl.model.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentDtoMapper extends BaseMapper<Student, StudentDto>{
}
