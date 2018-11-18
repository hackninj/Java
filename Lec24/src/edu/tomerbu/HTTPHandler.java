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




}
