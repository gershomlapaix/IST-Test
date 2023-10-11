package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.ClassGroup;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClassGroupService {
    List<ClassGroup> getAllClassGroups();

    Optional<ClassGroup> getClassGroupById(UUID id);

    ClassGroup createClassGroup(ClassGroup classGroup);

    void deleteClassGroup(UUID id);
}
