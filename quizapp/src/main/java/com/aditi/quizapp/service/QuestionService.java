package com.aditi.quizapp.service;


import com.aditi.quizapp.model.Question;
import com.aditi.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//business logic here
@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;
    public ResponseEntity<List<Question>> getAllQuestions() {
        try{
            //response entity required to send status codes
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findBycategory(category);
    }

    public ResponseEntity<String> addQuestion(Question ques){
        questionDao.save(ques);
        return new ResponseEntity<>("success",HttpStatus.CREATED);
    }
}
