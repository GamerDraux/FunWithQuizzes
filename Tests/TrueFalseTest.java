package org.launchcode.java.studios.FunWithQuizzes.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.launchcode.java.studios.FunWithQuizzes.TrueFalse;

import java.util.ArrayList;


public class TrueFalseTest {

    TrueFalse question1 = new TrueFalse("The sky is blue"
            , new ArrayList<>(){{add("True");}}, 5);
    ArrayList<String> correctUserAnswer =
            new ArrayList<>(){
        {add("True");}
    };
    ArrayList<String> incorrectUserAnswer =
            new ArrayList<>(){
                {add("False");}
            };

    @Test // check that question1 is instatiated
    public void questionIsInstantiated(){
        Assert.assertNotNull(question1);
    }

    @Test // check that question1 has a question that is
    // correct
    public void question1QuestionSetProperly(){
        Assert.assertEquals("The sky is blue",
                question1.getQuestion());
    }

    @Test //check that question1 has potential answers of
    // True and False
    public void question1HasTrueChoices(){
        Assert.assertEquals("True",
                question1.getChoices().get(0));
    }

    @Test //check that question one has a potential
    // answer of false
    public void question1HasFalseChoice(){
        Assert.assertEquals("False",
                question1.getChoices().get(1));
    }

    @Test //Check that correct answer is checked correctly
    public void question1ReturnsTrueForCorrectUserAnswer(){
        Assert.assertTrue(question1.checkAnswers(correctUserAnswer));
    }

    @Test //Check that incorrect answer is checked correctly
    public void question1ReturnsFalseForIncorrectUserAnswer(){
        Assert.assertFalse(question1.checkAnswers(incorrectUserAnswer));
    }

    @Test //that points are set correctly
    public void pointsSetCorrectly(){
        Assert.assertEquals(5, question1.getPoints());
    }
}
