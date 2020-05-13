package org.launchcode.java.studios.FunWithQuizzes.Tests;


import org.junit.Assert;
import org.junit.Test;
import org.launchcode.java.studios.FunWithQuizzes.RunQuestion;
import org.launchcode.java.studios.FunWithQuizzes.TrueFalse;

import java.util.ArrayList;

public class RunQuestionTest {
    ArrayList<String> correctAnswer =
            new ArrayList<String>(){{add("True");}};
    TrueFalse q1 = new TrueFalse("True or False: The " +
            "sky is blue.", correctAnswer, 5);
}
