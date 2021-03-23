package com.example.quizproject.quizquestion;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/questions")
public class QuizQuestionController {

    private final QuizQuestionService quizQuestionService;

    public QuizQuestionController(QuizQuestionService quizQuestionService) {
        this.quizQuestionService = quizQuestionService;
    }

    @GetMapping
    public List<QuizQuestion> getRandomQuizQuestions(@RequestParam(required = false) Integer limit) {
        return quizQuestionService.getRandomQuizQuestions(limit);
    }

    @GetMapping("category/{categoryName}")
    public List<QuizQuestion> getRandomQuizQuestionsByCategory(
            @PathVariable("categoryName") String category,
            @RequestParam(required = false) Integer limit) {
        return quizQuestionService.getRandomQuizQuestionsByCategory(category, limit);
    }

}
