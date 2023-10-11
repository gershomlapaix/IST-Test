package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.Subject;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SubjectService {
    List<Subject> getAllSubjects();
    Optional<Subject> getSingleSubject(UUID subjectId);
    Subject CreateSubject(Subject subject);
    void deleteSubject(UUID subjectId);
}
