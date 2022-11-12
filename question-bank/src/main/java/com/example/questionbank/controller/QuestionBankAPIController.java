package com.example.questionbank.controller;


import com.example.questionbank.data.Category;
import com.example.questionbank.data.QuestionAnswers;
import com.example.questionbank.service.IQuestionBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionBankAPIController {

    @Autowired
    private IQuestionBankService questionBankService;


    @RequestMapping("/questions")
    List<QuestionAnswers> fetchAllQuestionsAndAnswers() {
        return questionBankService.fetchAllQuestionAndAnswers();
    }

    @RequestMapping("/categories")
    List<Category> fetchAllCategories() {
        return questionBankService.fetchAllCategories();
    }
}
