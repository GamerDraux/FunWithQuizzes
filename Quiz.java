package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.*;


public class Quiz {
    public static ArrayList<Question> qList =
            new ArrayList<Question>();
    private static float  possiblePoints=0;
    private static float userPoints=0;

    public void addQuestion(Question question){
        qList.add(question);
    }

    public static boolean runQuestion(Question question){
        ArrayList<String> userResponses=
                new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        System.out.println("*********************");
        System.out.println(question.getQuestion());
        if (question instanceof Checkbox){
            System.out.println("Enter one of your " +
                    "choices, or hit Enter if you have " +
                    "made all your choices");
        }
        if (question instanceof TrueFalse){
            System.out.println("True or False?");
        }
        if (question instanceof MultipleChoice){
            for (String choice : question.getChoices()){
                System.out.println(choice);
            }
        }
        if (question instanceof Checkbox){
            for (String choice : question.getChoices()){
                System.out.println(choice);
            }
        }
        userResponses.add(in.nextLine());
        if (question instanceof Checkbox){
            String response;
           do {
               System.out.println("Do you have " +
                       "any other choices?");
               response = in.nextLine();
               if (!response.equals("")){userResponses.add(response);}
           } while (!response.equals(""));

        }
        Boolean result =
                question.checkAnswers(userResponses);
        if (result){
            if (question instanceof Checkbox){
                System.out.println("Those are all the " +
                        "correct answers!");
            } else {
                System.out.println(userResponses.get(0) +
                        " is the correct answer!");
            }
        } else {
            System.out.println("Sorry, that answer is " +
                    "incorrect");
        }
        if (!result) {
            if (question instanceof Checkbox) {
                System.out.println("The correct answers are:");
                for (String answer : question.getCorrectAnswers()) {
                    System.out.println(answer);
                }
            } else {
                System.out.println("The correct answer is: " + question.getCorrectAnswers().get(0));
            }
        }
        System.out.println("*********************");
        System.out.println("\n");
        return result;
    }

    public static void runQuiz(ArrayList<Question> qList){
        for (Question question : qList){
            boolean result = runQuestion(question);
            possiblePoints+= question.getPoints();
            if (result){
                userPoints+=question.getPoints();
            }

        }
        System.out.println("You scored "+userPoints+" " +
                "points out of a possible "+possiblePoints+".");
        System.out.println("Total score of "+ (userPoints/possiblePoints)*100+"%");
    }
    





}
