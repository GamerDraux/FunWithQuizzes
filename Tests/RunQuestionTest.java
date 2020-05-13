package org.launchcode.java.studios.FunWithQuizzes.Tests;



import org.launchcode.java.studios.FunWithQuizzes.TrueFalse;


import java.util.ArrayList;

public class RunQuestionTest {
    ArrayList<String> correctAnswer =
            new ArrayList<>(){{add("True");}};
    TrueFalse q1 = new TrueFalse("True or False: The " +
            "sky is blue.", correctAnswer, 5);
}
