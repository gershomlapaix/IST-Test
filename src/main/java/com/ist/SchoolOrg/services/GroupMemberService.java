package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.GroupMember;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GroupMemberService {
    List<GroupMember> getAllGroupMembers();

    Optional<GroupMember> getGroupMemberById(UUID id);

    GroupMember createGroupMember(GroupMember groupMember);

    void deleteGroupMember(UUID id);

    // Student related
    List<GroupMember> getMemberGroups(UUID studentId); // get the groups of a certain students
    List<GroupMember> getPlacedStudents();  // get the placed students

    interface PlacedStudentService {
        List<GroupMember> getPlacedStudents();
    }
}
