package edu.tomerbu;


import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {


        WeatherStation ws = new WeatherStation();
        ws.tlv(new WheatherResult() {
            @Override
            public void result(String temp) {
                System.out.println(temp);
            }
        });
    }
}

//
//interface A {
//    //list of public abstract methods
//    public abstract void doWork();
//}
//
//
//abstract class B {
//    public abstract void doWork();
//
//    public void doW() {
//        //Concrete code...
//    }
//}