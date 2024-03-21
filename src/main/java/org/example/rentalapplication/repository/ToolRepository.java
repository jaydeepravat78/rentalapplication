package org.example.rentalapplication.repository;

import org.example.rentalapplication.entity.Tool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToolRepository extends JpaRepository<Tool, Long> {
}
