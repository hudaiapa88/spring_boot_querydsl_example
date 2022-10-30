package com.uc.querydsl.model.entity;

import com.uc.querydsl.model.enums.Role;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@SuperBuilder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Role",
        discriminatorType = DiscriminatorType.STRING)
public class User extends BaseEntity{
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    @Column(name = "Role", nullable = false, insertable = false, updatable = false)
    @Enumerated(value = EnumType.STRING)
    private Role role;
}
