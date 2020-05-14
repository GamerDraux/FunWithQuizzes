package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    public ArrayList<String> userAnswers;
    public MultipleChoice(String aQuestion,
                          ArrayList<String> aChoices,
                          ArrayList<String> aCorrectAnswers, int aPoints){
        super(aQuestion, aChoices, aCorrectAnswers,
                aPoints);
    }



    
}
