package com.aditi.quizapp.controller;

import com.aditi.quizapp.model.Question;
import com.aditi.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{c}")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public List<Question> getQuestionsByCategory(@PathVariable("c") String category){
        return questionService.getQuestionsByCategory(category);

    }

    @PostMapping("save")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public ResponseEntity<String> addQuestion(@RequestBody Question ques){
        return questionService.addQuestion(ques);
        //return "success";
    }
}
