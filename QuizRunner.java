package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.Arrays;

import static org.launchcode.java.studios.FunWithQuizzes.Quiz.qList;

public class QuizRunner {
    public static void main(String[] args) {
        TrueFalse q1 = new TrueFalse("Is the sky blue?",
                new ArrayList<String>(Arrays.asList("True")),5);
        TrueFalse q2 = new TrueFalse("Is Java hard?",
                new ArrayList<String>(Arrays.asList(
                        "False")), 3);
        MultipleChoice q3 = new MultipleChoice("Type the " +
                "word that should come first " +
                "alphabetically",
                new ArrayList<String>(Arrays.asList(
                        "Apple", "Banana","Cucumber",
                        "Dates")),
                new ArrayList<String>(Arrays.asList(
                        "Apple")), 4);
        Checkbox q4 = new Checkbox("Select all vowels",
                new ArrayList<String>(Arrays.asList("A",
                        "B", "D", "E")),
                new ArrayList<String>(Arrays.asList("A",
                        "E")),3);
        qList.add(q1);
        qList.add(q2);
        qList.add(q3);
        qList.add(q4);
        Quiz.runQuiz(qList);
    }
}
