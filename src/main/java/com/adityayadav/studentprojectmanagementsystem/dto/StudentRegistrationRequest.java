package com.adityayadav.studentprojectmanagementsystem.dto;

import com.adityayadav.studentprojectmanagementsystem.entity.Student;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class StudentRegistrationRequest {
    private Student student;
//    private final String firstName;
//    private final String lastName;
//    private final String emailId;
//    private final String password;

}
