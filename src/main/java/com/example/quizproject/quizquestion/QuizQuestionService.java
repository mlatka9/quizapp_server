package com.example.quizproject.quizquestion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Its service class that provide logic to analise data from database and prepare necessary data to controller.
 *
 */
@Service
public class QuizQuestionService {

    private final QuizQuestionRepository quizQuestionRepository;

    @Autowired
    public QuizQuestionService(QuizQuestionRepository quizQuestionRepository) {
        this.quizQuestionRepository = quizQuestionRepository;
    }

    /**
     * Method return List of QuizQuestion based on limit value, if amount questions in database is lower than limit,
     * then method return all questions from database
     *
     * @param limit max number of returned questions
     * @return list of QuizQuestion based on limit argument from any category
     */
    public List<QuizQuestion> getRandomQuizQuestions(Integer limit) {
        long numberRows = quizQuestionRepository.count();
        if (limit == null || limit >= numberRows) {
            return quizQuestionRepository.findAll();
        }

        Set<Integer> randomNumbers = new TreeSet<>();
        Random random = new Random();
        while (randomNumbers.size() < limit) {
            randomNumbers.add(random.nextInt((int) numberRows));
        }

        List<QuizQuestion> all = quizQuestionRepository.findAll();
        List<QuizQuestion> result = new ArrayList<>();
        randomNumbers.forEach(i -> result.add(all.get(i)));

        return result;
    }

    /**
     * Method return List of QuizQuestion based on limit value and category, if amount questions in database is lower
     * than limit, then method return all questions from database
     *
     * @param category category from which questions will be returned
     * @param limit max number of returned questions
     * @return list of QuizQuestion based on limit argument from specified category
     */
    public List<QuizQuestion> getRandomQuizQuestionsByCategory(String category, Integer limit) {

        Integer numberRows = quizQuestionRepository.countAllByCategory(category);
        if (limit == null || limit >= numberRows) {
            return quizQuestionRepository.findAllByCategory(category);
        }

        Set<Integer> randomNumbers = new TreeSet<>();
        Random random = new Random();
        while (randomNumbers.size() < limit) {
            randomNumbers.add(random.nextInt(numberRows));
        }

        List<QuizQuestion> allByCategory = quizQuestionRepository.findAllByCategory(category);
        List<QuizQuestion> result = new ArrayList<>();
        randomNumbers.forEach(i -> result.add(allByCategory.get(i)));

        return result;
    }

}
