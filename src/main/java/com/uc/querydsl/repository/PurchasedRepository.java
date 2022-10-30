package com.uc.querydsl.repository;

import com.uc.querydsl.model.entity.Category;
import com.uc.querydsl.model.entity.Purchased;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchasedRepository extends JpaRepository<Purchased,Long> {
}
