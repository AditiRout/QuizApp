package com.aditi.quizapp.dao;


import com.aditi.quizapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>{

    List<Question> findBycategory(String category);//jpa is smart enough to decide what function it should give user wants to find data by category

   @Query(value = "SELECT * FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ",nativeQuery = true)
    List<Question>findRandomQuestionsByCategory(String category, Integer numQ);
}
