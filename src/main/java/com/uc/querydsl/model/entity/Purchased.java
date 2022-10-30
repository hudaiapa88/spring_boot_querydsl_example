package com.uc.querydsl.model.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
@SuperBuilder
public class Purchased extends BaseEntity{
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;

}
