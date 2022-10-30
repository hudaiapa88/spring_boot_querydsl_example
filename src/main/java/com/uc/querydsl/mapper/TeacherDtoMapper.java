package com.uc.querydsl.mapper;

import com.uc.querydsl.model.dto.TeacherDto;
import com.uc.querydsl.model.entity.Teacher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherDtoMapper extends BaseMapper<Teacher, TeacherDto>{
}
