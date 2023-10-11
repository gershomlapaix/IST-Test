package com.ist.SchoolOrg.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ist.SchoolOrg.constants.CommonStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private int minStudents;
    private int maxStudents;

    @Enumerated(EnumType.STRING)
    private CommonStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "theGroup")
    @JsonIgnore
    private List<ClassGroup> classes;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "theGroup")
    @JsonIgnore
    private List<GroupSubject> subjects;

    // getters and setters


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getMinStudents() {
        return minStudents;
    }

    public void setMinStudents(int minStudents) {
        this.minStudents = minStudents;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
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

    public List<ClassGroup> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassGroup> classes) {
        this.classes = classes;
    }

    public List<GroupSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<GroupSubject> subjects) {
        this.subjects = subjects;
    }
}
