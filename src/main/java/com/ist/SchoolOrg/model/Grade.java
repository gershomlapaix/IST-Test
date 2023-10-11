package com.ist.SchoolOrg.model;

import com.ist.SchoolOrg.constants.CommonStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name; // must be unique in the school

    @Enumerated(EnumType.STRING)
    private CommonStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "school_id")
    private School school;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "grade")
    private List<GradeClass> classes;

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

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<GradeClass> getClasses() {
        return classes;
    }

    public void setClasses(List<GradeClass> classes) {
        this.classes = classes;
    }
}
