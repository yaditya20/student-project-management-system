package com.adityayadav.studentprojectmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentProjectResponse {
    private String studentFirstName;
    private String studentLastName;
    private String studentEmailId;
    private String projectName;
}
