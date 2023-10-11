package com.ist.SchoolOrg.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ist.SchoolOrg.constants.CommonStatus;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull
    private String name;
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    private CommonStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "student")
    @JsonIgnore
    private List<StudentSubject> enrolledSubjects;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "student")
    @JsonIgnore
    private List<GroupMember> assignedGroups;

    // getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public CommonStatus getStatus() {
        return status;
    }

    public void setStatus(CommonStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<StudentSubject> getEnrolledSubjects() {
        return enrolledSubjects;
    }

    public void setEnrolledSubjects(List<StudentSubject> enrolledSubjects) {
        this.enrolledSubjects = enrolledSubjects;
    }

    public List<GroupMember> getAssignedGroups() {
        return assignedGroups;
    }

    public void setAssignedGroups(List<GroupMember> assignedGroups) {
        this.assignedGroups = assignedGroups;
    }
}

