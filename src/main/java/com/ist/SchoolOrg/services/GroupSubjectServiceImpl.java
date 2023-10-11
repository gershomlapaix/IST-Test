package com.ist.SchoolOrg.services;

import com.ist.SchoolOrg.model.GroupSubject;
import com.ist.SchoolOrg.repository.GroupSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GroupSubjectServiceImpl implements GroupSubjectService{
    private final GroupSubjectRepository groupSubjectRepository;

    @Autowired
    public GroupSubjectServiceImpl(GroupSubjectRepository groupSubjectRepository) {
        this.groupSubjectRepository = groupSubjectRepository;
    }

    @Override
    public List<GroupSubject> getAllGroupSubjects() {
        return groupSubjectRepository.findAll();
    }

    @Override
    public Optional<GroupSubject> getGroupSubjectById(UUID id) {
        return groupSubjectRepository.findById(id);
    }

    @Override
    public GroupSubject createGroupSubject(GroupSubject groupSubject) {
        return groupSubjectRepository.save(groupSubject);
    }

    @Override
    public void deleteGroupSubject(UUID id) {
        groupSubjectRepository.deleteById(id);
    }

}
