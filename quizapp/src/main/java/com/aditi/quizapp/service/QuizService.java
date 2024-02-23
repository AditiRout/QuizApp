package com.aditi.quizapp.service;

import com.aditi.quizapp.dao.QuestionDao;
import com.aditi.quizapp.dao.QuizDao;
import com.aditi.quizapp.model.Question;
import com.aditi.quizapp.model.QuestionWrapper;
import com.aditi.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;


    public ResponseEntity<String> createQuiz(String category, Integer numQ, String title) {
        List<Question> ques=questionDao.findRandomQuestionsByCategory(category,numQ);
        Quiz q=new Quiz();
        q.setTitle(title);
        q.setQuestions(ques);
        quizDao.save(q);
        return new ResponseEntity<>("success",HttpStatus.CREATED);

    }

    public ResponseEntity<List<QuestionWrapper>> getQuiz(Integer id) {
        try{
            Optional<Quiz> quiz= quizDao.findById(id);
            List<Question>questionsFromDB= quiz.get().getQuestions();
            List<QuestionWrapper>qw=new ArrayList<>();
            for(Question q:questionsFromDB){
                QuestionWrapper w=new QuestionWrapper(q.getId(),q.getQuestionTitle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());;
                qw.add(w);
            }

            return new ResponseEntity<>(qw,HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
