package com.springmvc.repository;

import com.springmvc.entity.Custom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomRepository extends JpaRepository<Custom, Long> {
}
