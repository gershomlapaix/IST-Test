package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.GroupMember;

import java.util.List;

public interface PlacedStudentService {
    List<GroupMember> getAllPlacedStudents();

    List<GroupMember> getAllUnPlacedStudents();
}
