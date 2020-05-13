package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.launchcode.java.studios.FunWithQuizzes.Quiz.qList;

public class QuizRunner {
    public static void main(String[] args) {
        TrueFalse q1 = new TrueFalse("Is the sky blue?",
                new ArrayList<>(Collections.singletonList("True")),5);
        TrueFalse q2 = new TrueFalse("Is Java hard?",
                new ArrayList<>(Collections.singletonList(
                        "False")), 3);
        MultipleChoice q3 = new MultipleChoice("Type the " +
                "word that should come first " +
                "alphabetically",
                new ArrayList<>(Arrays.asList(
                        "Apple", "Banana","Cucumber",
                        "Dates")),
                new ArrayList<>(Collections.singletonList(
                        "Apple")), 4);
        Checkbox q4 = new Checkbox("Select all vowels",
                new ArrayList<>(Arrays.asList("A",
                        "B", "D", "E")),
                new ArrayList<>(Arrays.asList("A",
                        "E")),3);
        Quiz.addQuestion(q1);
        Quiz.runQuiz(qList);
    }
}
