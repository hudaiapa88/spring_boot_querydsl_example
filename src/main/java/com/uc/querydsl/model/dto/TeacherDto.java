package com.uc.querydsl.model.dto;

import com.uc.querydsl.model.enums.Role;
import lombok.Data;

@Data
public class TeacherDto {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private Role role;
}
