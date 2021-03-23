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