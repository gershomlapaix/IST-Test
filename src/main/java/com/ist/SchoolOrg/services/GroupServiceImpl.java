package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.Groups;
import com.ist.SchoolOrg.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GroupServiceImpl implements GroupService {

    public final GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }

    @Override
    public List<Groups> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public Optional<Groups> getSingleGroup(UUID groupId) {
        return groupRepository.findById(groupId);
    }

    @Override
    public Groups CreateGroup(Groups group) {
        return groupRepository.save(group);
    }

    @Override
    public void deleteGroup(UUID groupId) {
        groupRepository.deleteById(groupId);
    }
}
