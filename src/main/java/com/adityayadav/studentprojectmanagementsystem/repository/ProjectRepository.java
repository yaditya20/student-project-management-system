package com.adityayadav.studentprojectmanagementsystem.repository;

import com.adityayadav.studentprojectmanagementsystem.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
