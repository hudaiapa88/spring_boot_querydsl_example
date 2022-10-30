package com.uc.querydsl.model.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@Entity
@SuperBuilder
public class Category extends  BaseEntity{
    String title;

}
