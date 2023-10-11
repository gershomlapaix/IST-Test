package com.ist.SchoolOrg.repository;

import com.ist.SchoolOrg.model.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface StudentSubjectRepository extends JpaRepository<StudentSubject, UUID> {
    List<StudentSubject> findByStudentId(UUID studentId);

}
