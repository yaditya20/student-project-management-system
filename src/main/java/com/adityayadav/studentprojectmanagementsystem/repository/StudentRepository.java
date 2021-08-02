package com.adityayadav.studentprojectmanagementsystem.repository;

import com.adityayadav.studentprojectmanagementsystem.dto.StudentProjectResponse;
import com.adityayadav.studentprojectmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("select new com.adityayadav.studentprojectmanagementsystem.dto.StudentProjectResponse" +
            "(s.firstName, s.lastName, s.emailId, p.projectName) " +
            "from Student s join s.projects p")
    public List<StudentProjectResponse> getAllProjectDetails();

    public boolean existsStudentByEmailId(String emailId);

    Optional<Student> findByEmailId(String emailId);
}
