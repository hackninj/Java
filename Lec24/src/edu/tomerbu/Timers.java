package edu.tomerbu;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timers {
    //Thread usage:
    public static void doEveryMin(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000*60);
                        //Go Yahoo
                        System.out.println("After one min "+ new Date());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }



    public static void doEverySecTimer(){
        Timer t = new Timer();

        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("The Date: " + new Date());
            }
        }, 0, 1000);
    }

    public static void doInOneMin(){
        Timer t = new Timer();
        //anonymous inner class
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Code that will run in one Minute");
            }
        }, 1000);
    }
    //The Same
    public static void doInOneMinLongerWay(){
        Timer t = new Timer();
        //Named inner class
        class Inner extends TimerTask{
            @Override
            public void run() {
                System.out.println("Code that will run in one Minute");
            }
        }

        t.schedule(new Inner(), 1000);
    }
}
