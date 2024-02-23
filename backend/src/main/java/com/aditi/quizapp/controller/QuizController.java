package com.aditi.quizapp.controller;


import com.aditi.quizapp.model.Question;
import com.aditi.quizapp.model.QuestionWrapper;
import com.aditi.quizapp.model.Quiz;
import com.aditi.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        return quizService.createQuiz(category,numQ,title);
    }
    @GetMapping("all")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public ResponseEntity<List<Quiz>> getAllQuizzes(){

        return quizService.getAllQuizzes();
    }

    @GetMapping("{id}")
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    public ResponseEntity<List<QuestionWrapper>> getQuiz(@PathVariable Integer id){
        return quizService.getQuiz(id);
    }
        //requestparam for search queries
}
