package org.launchcode.java.studios.FunWithQuizzes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {
    private final String question;
    private final ArrayList<String> choices;
    private final ArrayList<String> correctAnswers;
    private final int points;
    public ArrayList<String> trueFalseChoices =
            new ArrayList<String>(){
                {add("True");
                    add("False");}
            };

    public Question (String aQuestion,
                     ArrayList<String> aCorrectAnswers,
                     int aPoints){
        this.question=aQuestion;
        this.correctAnswers=aCorrectAnswers;
        this.points=aPoints;
        this.choices=trueFalseChoices;

    }

    public Question (String aQuestion,
                     ArrayList<String> aChoices,
                     ArrayList<String> aCorrectAnswers,
                     int aPoints){
        this.question= aQuestion;
        this.choices=aChoices;
        this.correctAnswers=aCorrectAnswers;
        this.points= aPoints;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public ArrayList<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public int getPoints() {
        return points;
    }

    public void printQuestion(){
        System.out.println(question);
    }

    public Boolean checkAnswers(ArrayList<String> userAnswers){
        for (String answer : userAnswers){
            if (!correctAnswers.contains(answer)){
                return false;
            }
        }
        return correctAnswers.size() == userAnswers.size();
    }


}
