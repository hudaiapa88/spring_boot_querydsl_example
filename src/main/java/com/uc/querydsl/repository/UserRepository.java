package com.uc.querydsl.repository;

import com.uc.querydsl.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
