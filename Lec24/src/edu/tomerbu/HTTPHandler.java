package edu.tomerbu;

import java.io.IOException;
import java.util.Date;

public class HTTPHandler {

    //ASync
    public static void get(String address) {
        new Thread(new Runnable() {
            @Override
            public void run(){
                try {
                    String json = IO.readHTTP(address);
                    System.out.println(json);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }



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
}
