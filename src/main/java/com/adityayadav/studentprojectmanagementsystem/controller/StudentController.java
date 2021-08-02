package com.adityayadav.studentprojectmanagementsystem.controller;

import com.adityayadav.studentprojectmanagementsystem.dto.StudentRegistrationRequest;
import com.adityayadav.studentprojectmanagementsystem.entity.Student;
import com.adityayadav.studentprojectmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id) {
        Student students = studentService.findStudentById(id);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody StudentRegistrationRequest studentRegistrationRequest) {
        Student newStudent = studentService.addStudent(studentRegistrationRequest.getStudent());
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }
}
