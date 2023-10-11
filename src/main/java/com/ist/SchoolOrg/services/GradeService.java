package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.Grade;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GradeService {
    List<Grade> getAllGrades();
    Optional<Grade> getSingleGrade(UUID gradeId);
    Grade CreateGrade(Grade Grade);
    void deleteGrade(UUID gradeId);
}
