package com.example.quizproject.quizquestion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long> {

    List<QuizQuestion> findAllByCategory(String category);

    Integer countAllByCategory(String category);

    long count();
}
