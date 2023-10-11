package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.GroupMember;
import com.ist.SchoolOrg.repository.GroupMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacedStudentServiceImpl implements PlacedStudentService{
    private final GroupMemberRepository groupMemberRepository;

    @Autowired
    public PlacedStudentServiceImpl(GroupMemberRepository groupMemberRepository) {
        this.groupMemberRepository = groupMemberRepository;
    }

    @Override
    public List<GroupMember> getAllPlacedStudents() {
        return groupMemberRepository.findByIsPlaced(true);
    }

    @Override
    public List<GroupMember> getAllUnPlacedStudents() {
        return groupMemberRepository.findByIsPlaced(false);
    }
}
