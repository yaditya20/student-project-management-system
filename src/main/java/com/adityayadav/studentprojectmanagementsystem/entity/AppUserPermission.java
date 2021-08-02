package com.adityayadav.studentprojectmanagementsystem.entity;

public enum AppUserPermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    PROJECT_READ("course:read"),
    PROJECT_WRITE("course:write");

    private final String permission;

    AppUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
