package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.Student;
import com.ist.SchoolOrg.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository stdRepository){
        this.studentRepository = stdRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getSingleStudent(UUID studentId) {
        return studentRepository.findById(studentId);
    }

    @Override
    public Student CreateStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    @Override
    public void deleteStudent(UUID studentId) {
        studentRepository.deleteById(studentId);
    }

}
