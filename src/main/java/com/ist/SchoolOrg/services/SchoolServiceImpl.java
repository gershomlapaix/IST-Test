package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.School;
import com.ist.SchoolOrg.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SchoolServiceImpl implements SchoolService{

    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolServiceImpl(SchoolRepository schoolRepository){
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<School> getAllSchool() {
        return schoolRepository.findAll();
    }

    @Override
    public Optional<School> getSingleSchool(UUID schoolId) {
        return schoolRepository.findById(schoolId);
    }

    @Override
    public School CreateSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public void deleteSchool(UUID schoolId) {
        schoolRepository.deleteById(schoolId);
    }
}
