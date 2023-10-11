package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.Groups;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GroupService {
    List<Groups> getAllGroups();
    Optional<Groups> getSingleGroup(UUID groupId);

    Groups CreateGroup(Groups group);
    void deleteGroup(UUID groupId);
}
