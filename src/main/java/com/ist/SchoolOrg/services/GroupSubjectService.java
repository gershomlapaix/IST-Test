package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.GroupSubject;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GroupSubjectService {
    List<GroupSubject> getAllGroupSubjects();

    Optional<GroupSubject> getGroupSubjectById(UUID id);

    GroupSubject createGroupSubject(GroupSubject groupSubject);

    void deleteGroupSubject(UUID id);
}
