package com.company;

import java.util.Random;

public class Player {
    private String firstName;
    private String birthdate;
    private int height;
    private int shirtNo;
    private int pctFromTwo;
    private int pctFromTheLine;
    private int pctFromTheThree;
    private String category;

    //ctor + ctor input + toString


    public Player(String firstName, String birthdate, int height, int shirtNo, int pctFromTwo, int pctFromTheLine, int pctFromTheThree, String category) {
        this.firstName = firstName;
        this.birthdate = birthdate;
        this.height = height;
        this.shirtNo = shirtNo;
        this.pctFromTwo = pctFromTwo;
        this.pctFromTheLine = pctFromTheLine;
        this.pctFromTheThree = pctFromTheThree;
        this.category = category;
    }

    public Player() {
        this.firstName = IO.nextLine("Enter First Name...");
        this.birthdate = IO.nextLine("Enter birthdate...");
        this.height = IO.nextInt("Enter height...");
        this.shirtNo = IO.nextInt("Enter shirtNo...");
        this.pctFromTwo = IO.nextInt("Enter pctFromTwo...");
        this.pctFromTheLine = IO.nextInt("Enter pctFromTheLine...");
        this.pctFromTheThree = IO.nextInt("Enter pctFromTheThree...");
        this.category = IO.nextLine("Enter category...");
    }

    public void dribble() {
        System.out.println("Dribbling");
    }

    //only from Player
    private boolean shoot(int pct) {
        Random r = new Random();
        int rand = r.nextInt(101);  //random number 0-100 inclusive
        //if rand < pct return true, else return false
        return rand <= pct;
    }

    public boolean throwFromTwo() {
        return shoot(pctFromTwo);
    }

    public boolean throwFromThree() {
        return shoot(pctFromTheThree);
    }

    public boolean throwFromTheLine() {
        return shoot(pctFromTheLine);
    }


//alt insert

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", height=" + height +
                ", shirtNo=" + shirtNo +
                ", pctFromTwo=" + pctFromTwo +
                ", pctFromTheLine=" + pctFromTheLine +
                ", pctFromTheThree=" + pctFromTheThree +
                ", category='" + category + '\'' +
                '}';
    }

    //GUI
    public void print(){
        System.out.println(firstName +"\n" + height);
    }
}
