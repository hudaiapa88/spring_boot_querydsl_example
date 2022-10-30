package com.uc.querydsl.model.entity;

import com.uc.querydsl.model.enums.Role;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@SuperBuilder
@DiscriminatorValue(value = Role.Value.TEACHER)
public class Teacher extends User {

}
