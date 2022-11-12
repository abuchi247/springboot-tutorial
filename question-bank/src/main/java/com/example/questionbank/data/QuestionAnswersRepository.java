package com.example.questionbank.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface QuestionAnswersRepository extends JpaRepository<QuestionAnswers, Long>, JpaSpecificationExecutor<QuestionAnswers> {

}