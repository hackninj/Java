package edu.tomerbu;

//Bad - don't inherit from Thread inherit from Driver

//A IS B

//Liskov's Substitution Principle
//A's behaviour is similar to B's
public class CarDriver extends Thread {

    @Override
    public void run() {
         while (true){
             System.out.println("Driving");
         }
    }
}
