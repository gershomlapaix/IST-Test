package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.School;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SchoolService {
    List<School> getAllSchool();
    Optional<School> getSingleSchool(UUID schoolId);
    School CreateSchool(School school);
    void deleteSchool(UUID schoolId);
}
