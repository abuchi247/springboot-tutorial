package com.example.questionbank.service;

import com.example.questionbank.data.Category;
import com.example.questionbank.data.QuestionAnswers;

import java.util.List;

public interface IQuestionBankService {
    List<Category> fetchAllCategories();
    List<QuestionAnswers> fetchAllQuestionAndAnswers();
}
