package com.example.quizproject.quizquestion;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuizQuestionService {

    private final QuizQuestionRepository quizQuestionRepository;

    public QuizQuestionService(QuizQuestionRepository quizQuestionRepository) {
        this.quizQuestionRepository = quizQuestionRepository;
    }

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
