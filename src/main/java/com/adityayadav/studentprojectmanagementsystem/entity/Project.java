package com.adityayadav.studentprojectmanagementsystem.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
    }
}
