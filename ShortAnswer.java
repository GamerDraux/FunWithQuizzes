package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;

public class ShortAnswer extends Question {
    private String shortString;

    public ShortAnswer(String aQuestion,
                       int aPoints){
        super(aQuestion, new ArrayList<>() , aPoints);
    }

    public String getShortString() {
        return shortString;
    }

    public void setShortString(String shortString) {
        this.shortString = shortString;
    }
}
