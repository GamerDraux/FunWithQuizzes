package org.launchcode.java.studios.FunWithQuizzes.test;

import org.junit.Assert;
import org.junit.Test;
import org.launchcode.java.studios.FunWithQuizzes.MultipleChoice;


import java.util.ArrayList;

public class MultipleChoiceTest {
        ArrayList<String> choices = new ArrayList<>() {
            {
                add("Stuff");
                add("More Stuff");
                add("Extra Stuff");
                add("The Most Stuff");
            }
        };
        ArrayList<String> correctAnswers =
                new ArrayList<>() {
                    {
                        add("The Most Stuff");
                    }
                };
        ArrayList<String> correctUserAnswer =
                new ArrayList<>(){
                    {add("The Most Stuff");}
                };
        ArrayList<String> incorrectUserAnswer =
                new ArrayList<>(){
                    {add("Extra Stuff");}
                };
        MultipleChoice question1 = new MultipleChoice("What " +
                "is the right stuff?", choices,
                correctAnswers, 5);

    @Test //check that an instance of the class has been
    // instantiated
    public void instanceIsNotNull(){
        Assert.assertNotNull(question1);
    }

    @Test //Check that question1 has correct question
    public void questionFieldCorrect(){
        Assert.assertEquals("What is the right stuff?",
                question1.getQuestion());
    }

    @Test //that choices array is instantiated, and can be
    // accessed
    public void choicesArrayInstantiatedAndCorrect(){
        Assert.assertEquals("Extra Stuff",
                question1.getChoices().get(2));
    }

    @Test // that correctAnswers arrayList is
    // instantiated and can be accessed
    public void correctAnswersArrayInstantiatedAndCorrect(){
        Assert.assertEquals("The Most Stuff",
                question1.getCorrectAnswers().get(0));
    }

    @Test //that points are set correctly
    public void pointsSetCorrectly(){
        Assert.assertEquals(5, question1.getPoints());
    }

    @Test //that correct userAnswers can be properly checked
    public void checkCorrectUserAnswers(){
        Assert.assertTrue(question1.checkAnswers(correctUserAnswer));
    }

    @Test //that incorrect userAnswers can be properly
    // checked
    public void checkIncorrectUserAnswers(){
        Assert.assertFalse(question1.checkAnswers(incorrectUserAnswer));
    }


}
