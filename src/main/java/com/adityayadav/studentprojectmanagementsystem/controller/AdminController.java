package com.adityayadav.studentprojectmanagementsystem.controller;

import com.adityayadav.studentprojectmanagementsystem.dto.StudentRegistrationRequest;
import com.adityayadav.studentprojectmanagementsystem.entity.Project;
import com.adityayadav.studentprojectmanagementsystem.entity.Student;
import com.adityayadav.studentprojectmanagementsystem.service.ProjectService;
import com.adityayadav.studentprojectmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/api/v1")
public class AdminController {
    private final StudentService studentService;
    private final ProjectService projectService;

    @Autowired
    public AdminController(StudentService studentService, ProjectService projectService) {
        this.studentService = studentService;
        this.projectService = projectService;
    }

    @GetMapping("/student/all")
    public ResponseEntity<List<Student>> getAllStudents(){
        List<Student> students = studentService.findAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
        Student student = studentService.findStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PostMapping("/student/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody StudentRegistrationRequest studentRegistrationRequest) {
        Student newStudent = studentService.addStudent(studentRegistrationRequest.getStudent());
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }

    @GetMapping("/project/all")
    public ResponseEntity<List<Project>> getAllProjects(){
        List<Project> projects = projectService.findAllProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @GetMapping("/project/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable("id") Long id){
        Project project = projectService.findProjectById(id);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }

}
