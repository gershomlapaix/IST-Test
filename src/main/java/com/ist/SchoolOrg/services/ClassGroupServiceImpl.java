package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.ClassGroup;
import com.ist.SchoolOrg.repository.ClassGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClassGroupServiceImpl implements ClassGroupService{

    private final ClassGroupRepository classGroupRepository;

    @Autowired
    public ClassGroupServiceImpl(ClassGroupRepository classGroupRepository) {
        this.classGroupRepository = classGroupRepository;
    }

    @Override
    public List<ClassGroup> getAllClassGroups() {
        return classGroupRepository.findAll();
    }

    @Override
    public Optional<ClassGroup> getClassGroupById(UUID id) {
        return classGroupRepository.findById(id);
    }

    @Override
    public ClassGroup createClassGroup(ClassGroup classGroup) {
        return classGroupRepository.save(classGroup);
    }

    @Override
    public void deleteClassGroup(UUID id) {
        classGroupRepository.deleteById(id);
    }
}
