package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.StudentSubject;

import java.util.List;
import java.util.UUID;

public interface StudentSubjectService {
    List<StudentSubject> getEnrolledSubjectsByStudentId(UUID studentId);
}
