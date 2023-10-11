package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.GroupMember;
import com.ist.SchoolOrg.repository.GroupMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GroupMemberServiceImpl implements  GroupMemberService{
    private final GroupMemberRepository groupMemberRepository;

    @Autowired
    public GroupMemberServiceImpl(GroupMemberRepository groupMemberRepository) {
        this.groupMemberRepository = groupMemberRepository;
    }

    @Override
    public List<GroupMember> getAllGroupMembers() {
        return groupMemberRepository.findAll();
    }

    @Override
    public Optional<GroupMember> getGroupMemberById(UUID id) {
        return groupMemberRepository.findById(id);
    }

    @Override
    public GroupMember createGroupMember(GroupMember groupMember) {
        return groupMemberRepository.save(groupMember);
    }

    @Override
    public void deleteGroupMember(UUID id) {
        groupMemberRepository.deleteById(id);
    }

//    get all the groups the students is in
    @Override
    public List<GroupMember> getMemberGroups(UUID studentId) {
        return groupMemberRepository.findByStudentId(studentId);
    }

//    get the placed students
    @Override
    public List<GroupMember> getPlacedStudents() {
        return groupMemberRepository.findByIsPlaced(true);
    }

}
