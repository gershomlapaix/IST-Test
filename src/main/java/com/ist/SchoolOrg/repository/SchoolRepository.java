package com.ist.SchoolOrg.repository;

import com.ist.SchoolOrg.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SchoolRepository extends JpaRepository<School, UUID> {
}
