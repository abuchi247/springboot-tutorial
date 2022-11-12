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
@Table(name = "question_answers")
public class QuestionAnswers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "question_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "answer", nullable = false)
    private String answer;

    @CreationTimestamp // makes java to save the entity using the current datetime
    @Column(name = "created_ts", nullable = false)
    private LocalDateTime createdTs;

    @UpdateTimestamp // tells java to update the timestamp whenever the entity is updated
    @Column(name = "last_updated_ts", nullable = false)
    private LocalDateTime lastUpdatedTs;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public LocalDateTime getLastUpdatedTs() {
        return lastUpdatedTs;
    }

    public void setLastUpdatedTs(LocalDateTime lastUpdatedTs) {
        this.lastUpdatedTs = lastUpdatedTs;
    }

    @Override
    public String toString() {
        return "QuestionAnswers{" +
                "questionId=" + questionId +
                ", category=" + category +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", createdTs=" + createdTs +
                ", lastUpdatedTs=" + lastUpdatedTs +
                '}';
    }
}
