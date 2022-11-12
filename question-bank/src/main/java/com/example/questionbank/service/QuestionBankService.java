package com.example.questionbank.service;


import com.example.questionbank.data.Category;
import com.example.questionbank.data.CategoryRepository;
import com.example.questionbank.data.QuestionAnswers;
import com.example.questionbank.data.QuestionAnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionBankService implements IQuestionBankService {

    @Autowired
    private QuestionAnswersRepository questionAnswersRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<Category> fetchAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<QuestionAnswers> fetchAllQuestionAndAnswers() {
        return questionAnswersRepository.findAll();
    }
}
