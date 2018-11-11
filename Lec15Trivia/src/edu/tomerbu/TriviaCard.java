package edu.tomerbu;

import java.util.Arrays;

public class TriviaCard {
    //Properties:
    private final String question;
    private final String[] options;
    private final String correctAnswer;
    //String pool optimization (<-as efficient as index)
    //methods:    //פעולות     //Actions
    //ctor *alt ins
    public TriviaCard(String question, String[] options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
    public TriviaCard(){
        question = IO.next("Enter the question"); //TODO: nextLine
        options = new String[4];
        for (int i = 0; i < options.length; i++) {
            options[i] = IO.next("Enter the " + (i + 1) + "Option");
        }
        correctAnswer = IO.next("Enter the correct ans");
    }
    //show question
    public void showQuestion(){
        System.out.println(question);
    }
    //show answers
    public void showAnswers(){
        //what will this print:
       // System.out.println(Arrays.toString(options));

        //pick an answer:
        //1) 1
        //2) 3
        //3) 2
        //4) 0

        System.out.println("אנא בחר תשובה...");
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + 1 + ") " + options[i]);
        }
    }
    //toString (alt insert)
    @Override
    public String toString() {
        return "TriviaCard{" +
                "question='" + question + '\'' +
                ", options=" + Arrays.toString(options) +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}
