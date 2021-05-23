package com.example.quizproject.quizquestion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * A controller class that provide end points to communicate with api
 */
@RestController
@RequestMapping("api/questions")
public class QuizQuestionController {

    private final QuizQuestionService quizQuestionService;

    @Autowired
    public QuizQuestionController(QuizQuestionService quizQuestionService) {
        this.quizQuestionService = quizQuestionService;
    }

    /**
     * Method return List of QuizQuestion based on limit value assigned to GET end point
     *
     * @param limit max number of returned questions
     * @return list of QuizQuestion based on limit argument from any category
     */
    @GetMapping
    public List<QuizQuestion> getRandomQuizQuestions(@RequestParam(required = false) Integer limit) {
        return quizQuestionService.getRandomQuizQuestions(limit);
    }

    /**
     * Method return List of QuizQuestion based on limit value and category assigned to GET end point
     *
     * @param category category from which questions will be returned
     * @param limit max number of returned questions
     * @return list of QuizQuestion based on limit argument from specified category
     */
    @GetMapping("category/{categoryName}")
    public List<QuizQuestion> getRandomQuizQuestionsByCategory(
            @PathVariable("categoryName") String category,
            @RequestParam(required = false) Integer limit) {
        return quizQuestionService.getRandomQuizQuestionsByCategory(category, limit);
    }

}
