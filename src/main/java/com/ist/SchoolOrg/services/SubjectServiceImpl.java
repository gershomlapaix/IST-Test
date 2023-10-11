package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.Subject;
import com.ist.SchoolOrg.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SubjectServiceImpl  implements SubjectService{

    private final SubjectRepository subjectRepository;

    @Autowired
    public SubjectServiceImpl(SubjectRepository subjectRepository){
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<com.ist.SchoolOrg.model.Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Optional<Subject> getSingleSubject(UUID subjectId) {
        return subjectRepository.findById(subjectId);
    }

    @Override
    public Subject CreateSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteSubject(UUID subjectId) {
        subjectRepository.deleteById(subjectId);
    }
}
