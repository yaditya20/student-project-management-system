package com.adityayadav.studentprojectmanagementsystem.service;

import com.adityayadav.studentprojectmanagementsystem.entity.Project;
import com.adityayadav.studentprojectmanagementsystem.entity.Student;
import com.adityayadav.studentprojectmanagementsystem.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> findAllProjects() {
        return projectRepository.findAll();
    }

    public Project findProjectById(Long id) {
        return projectRepository.findById(id).stream().filter(project -> id.equals(project.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + id + " does not exists"));
    }
}
