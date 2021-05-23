package com.example.quizproject.quizquestion;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Pogo class use to store information about Question.
 *
 * It contains id which is automatically assigned by sequence. Field Question contain a string value with question.
 * Field correct answer is a number from 0 to 3, which point on which index in list contain correct answer. Field
 * category tell from which category is that question. List answers contain strings with all possible to select answer
 * on question. None of the fields cannot be blank, it is guaranteed be javax validation
 *
 * Class using a library Lombok to auto-generate all needed setters, getters and Constructor without arguments.
 * Class using a JPA implemented by Hibernate as ORM to generate sql code and change java objects to inserts to database
 *
 */
@NoArgsConstructor
@Getter
@Setter
@Table(name = "quiz_question")
@Entity(name = "QuizQuestion")
public class QuizQuestion {

    @Id
    @SequenceGenerator(
            name = "quiz_sequence",
            sequenceName = "quiz_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quiz_sequence")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "question")
    @NotBlank(message = "Question cannot be blank")
    private String question;

    @Column(name = "correct_answers")
    @Min(value = 0, message = "Correct answer cannot be negative number")
    @NotNull(message = "Correct answer is required")
    private Integer correctAnswer;

    @Column(name = "category", nullable = false)
    @NotBlank(message = "Category is required")
    private String category;

    @ElementCollection
    @CollectionTable(name = "answers",
            foreignKey = @ForeignKey(
                    name = "answers_quiz_question_fk"
            ))
    @NotNull(message = "Answers are required")
    private List<String> answers = new ArrayList<>();

    public QuizQuestion(String question, Integer correctAnswer, List<String> answers, String category) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.category = category;
        this.answers = answers;
    }
}