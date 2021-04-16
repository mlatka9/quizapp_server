package com.example.quizproject.configuration;


import com.example.quizproject.quizquestion.QuizQuestion;
import com.example.quizproject.quizquestion.QuizQuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class QuizConfig {


    @Bean
    CommandLineRunner commandLineRunner(QuizQuestionRepository quizQuestionRepository) {
        return args -> {

            List<QuizQuestion> list = new ArrayList<>();

            list.add(new QuizQuestion(
                    "Ile jest 2+2?", 3, List.of("16", "1", "0", "4"), "matematyka"));

            list.add(new QuizQuestion(
                    "Ile jest 23+2?", 0, List.of("25", "1", "0", "4"), "matematyka"));

            list.add(new QuizQuestion(
                    "Jaki jest wzór na pole kwadratu", 0, List.of("a^2", "a^3", "a+b", "(a+b)^2"), "matematyka"));

            new QuizQuestion(
                    "Jaki jest wzór na pole kwadratu", 0, List.of("a^2", "a^3", "a+b", "(a+b)^2"), "matematyka");


            quizQuestionRepository.saveAll(list);

        };
    }
}
