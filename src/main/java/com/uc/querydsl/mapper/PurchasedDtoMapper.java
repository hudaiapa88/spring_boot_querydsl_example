package com.uc.querydsl.mapper;

import com.uc.querydsl.model.dto.PurchasedDto;
import com.uc.querydsl.model.entity.Purchased;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PurchasedDtoMapper extends BaseMapper<Purchased, PurchasedDto>{
}
