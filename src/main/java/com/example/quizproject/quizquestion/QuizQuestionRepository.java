package com.example.quizproject.quizquestion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interface that extends JpaRepository. It contains method to collect data from database
 */
@Repository
public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long> {

    /**
     * Method that returns list of all questions from specified category
     *
     * @param category category from which questions will be returned
     * @return list of all questions from specified category
     */
    List<QuizQuestion> findAllByCategory(String category);

    /**
     * @param category category of questions
     * @return a number of all questions in database from specified category
     */
    Integer countAllByCategory(String category);

    /**
     * @return a number of all questions in database
     */
    long count();
}
