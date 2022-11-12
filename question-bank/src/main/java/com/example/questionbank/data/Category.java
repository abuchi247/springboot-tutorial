package com.example.questionbank.data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * $table.getTableComment()
 */
@Entity
@Table(name = "category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "category_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "exam_type", nullable = false)
    private String examType;

    @CreationTimestamp // makes java to save the entity using the current datetime
    @Column(name = "created_ts", nullable = false)
    private LocalDateTime createdTs;

    @UpdateTimestamp // tells java to update the timestamp whenever the entity is updated
    @Column(name = "last_updated_ts", nullable = false)
    private LocalDateTime lastUpdatedTs;

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getExamType() {
        return examType;
    }

    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    public void setLastUpdatedTs(LocalDateTime lastUpdatedTs) {
        this.lastUpdatedTs = lastUpdatedTs;
    }

    public LocalDateTime getLastUpdatedTs() {
        return lastUpdatedTs;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId + '\'' +
                "subject=" + subject + '\'' +
                "examType=" + examType + '\'' +
                "createdTs=" + createdTs + '\'' +
                "lastUpdatedTs=" + lastUpdatedTs + '\'' +
                '}';
    }
}
