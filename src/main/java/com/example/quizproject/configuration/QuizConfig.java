package com.example.quizproject.configuration;


import com.example.quizproject.quizquestion.QuizQuestion;
import com.example.quizproject.quizquestion.QuizQuestionRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Configuration class used to insert data from csv file to database
 *
 * it opens a file questions.csv from resources directory, create QuizQuestion and insert them to database using
 * default method provided by JPA
 *
 */
@Configuration
public class QuizConfig {


    @Bean
    CommandLineRunner commandLineRunner(QuizQuestionRepository quizQuestionRepository, @Value("classpath:questions.csv") Resource questions) {
        return args -> {

            List<QuizQuestion> list = new ArrayList<>();

            try(BufferedReader br = new BufferedReader(new FileReader(questions.getFile()))){

                String line;
                while ((line = br.readLine()) != null) {
                    String[] fields = line.split(",");

                    String question = fields[0];
                    Integer correctAnswer = Integer.valueOf(fields[1]);
                    List<String> answers = List.of(fields[2], fields[3], fields[4], fields[5]);
                    String category = fields[6];

                    QuizQuestion quizQuestion = new QuizQuestion(question, correctAnswer, answers, category);
                    list.add(quizQuestion);
                }
            }

            quizQuestionRepository.saveAll(list);

        };
    }
}
