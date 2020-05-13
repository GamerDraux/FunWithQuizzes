package org.launchcode.java.studios.FunWithQuizzes;


import java.util.ArrayList;
import java.util.Scanner;
public class RunQuestion {
    public static boolean runQuestion(Question question){
        ArrayList<String> userResponses=
                new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println(question.getQuestion());
        userResponses.add(in.nextLine());
        Boolean result =
                question.checkAnswers(userResponses);
        if (result){
            System.out.println("That is the correct " +
                    "answer!");
        } else {
            System.out.println("Sorry, that answer is " +
                    "incorrect");
        }
        return result;
    }
}
