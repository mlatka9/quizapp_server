package com.example.quizproject.configuration;


import com.example.quizproject.quizquestion.QuizQuestion;
import com.example.quizproject.quizquestion.QuizQuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class QuizConfig {


    @Bean
    CommandLineRunner commandLineRunner(QuizQuestionRepository quizQuestionRepository) {
        return args -> {

            QuizQuestion quizQuestion1 = new QuizQuestion(
                    "Ile jest 2+2?",
                    3,
                    List.of(
                            "16",
                            "1",
                            "0",
                            "4"
                    ),
                    "Matematyka");

            QuizQuestion quizQuestion2 = new QuizQuestion(
                    "Jaki jest wzór na pole kwadratu",
                    0,
                    List.of(
                            "a^2",
                            "a^3",
                            "a+b",
                            "(a+b)^2"
                    ),
                    "Matematyka");

            QuizQuestion quizQuestion3 = new QuizQuestion(
                    "Ile jest 4+4",
                    0,
                    List.of(
                            "16",
                            "1",
                            "3",
                            "-16"
                    ),
                    "Matematyka");

            QuizQuestion quizQuestion4 = new QuizQuestion(
                    "Jaki jest wzór na pole koła",
                    0,
                    List.of(
                            "pi r ^2",
                            "2 pi r",
                            "a+b",
                            "1/4 pi^4"
                    ),
                    "Matematyka");

            QuizQuestion quizQuestion5 = new QuizQuestion(
                    "Jaki jest wzór na pole rombu",
                    0,
                    List.of(
                            "e*f/2",
                            "a^3",
                            "1/2*pi",
                            "a+b"
                    ),
                    "Matematyka");

            QuizQuestion quizQuestion6 = new QuizQuestion(
                    "Co jest stolicą Hiszpani",
                    2,
                    List.of(
                            "Barcelona",
                            "Monako",
                            "Madryt",
                            "Lizbona"
                    ),
                    "Geografia");

            quizQuestionRepository.saveAll(
                    List.of(
                            quizQuestion1,
                            quizQuestion2,
                            quizQuestion3,
                            quizQuestion4,
                            quizQuestion5,
                            quizQuestion6));
        };
    }
}
