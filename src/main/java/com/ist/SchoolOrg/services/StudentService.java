package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getSingleStudent(UUID studentId);
    Student CreateStudent(Student student);
    void deleteStudent(UUID studentId);
}
