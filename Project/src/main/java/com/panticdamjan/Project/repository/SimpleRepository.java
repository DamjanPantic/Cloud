package com.panticdamjan.Project.repository;

import com.panticdamjan.Project.model.SimpleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleRepository extends JpaRepository<SimpleModel, Long> {
}
