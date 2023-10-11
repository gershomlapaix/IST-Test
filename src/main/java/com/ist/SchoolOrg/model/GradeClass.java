package com.ist.SchoolOrg.model;
import com.ist.SchoolOrg.constants.CommonStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
public class GradeClass {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "grade_id")
    private Grade grade;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "class_id")
    private TheClass gradeClass;

    @Enumerated(EnumType.STRING)
    private CommonStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // getters and setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public TheClass getGradeClass() {
        return gradeClass;
    }

    public void setGradeClass(TheClass gradeClass) {
        this.gradeClass = gradeClass;
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
}
