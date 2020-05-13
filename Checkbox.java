package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;


public class Checkbox extends Question{
    ArrayList<String> userAnswers;
    public Checkbox(String aQuestion,
                          ArrayList<String> aChoices,
                          ArrayList<String> aCorrectAnswers, int aPoints){
        super(aQuestion, aChoices,aCorrectAnswers,aPoints);
    }
}
