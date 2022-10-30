package com.uc.querydsl.mapper;

import com.uc.querydsl.model.dto.UserDto;
import com.uc.querydsl.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDtoMapper extends BaseMapper<User, UserDto>{
}
