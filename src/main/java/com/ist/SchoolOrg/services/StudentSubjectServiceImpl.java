package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.StudentSubject;
import com.ist.SchoolOrg.repository.StudentSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentSubjectServiceImpl implements StudentSubjectService{
    private final StudentSubjectRepository studentSubjectRepository;

    @Autowired
    public StudentSubjectServiceImpl(StudentSubjectRepository studentSubjectRepository){
        this.studentSubjectRepository = studentSubjectRepository;
    }
    @Override
    public List<StudentSubject> getEnrolledSubjectsByStudentId(UUID studentId) {
        return studentSubjectRepository.findByStudentId(studentId);
    }
}
