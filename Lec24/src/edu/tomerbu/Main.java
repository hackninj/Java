package edu.tomerbu;


//
public class Main{

    public static void main(String[] args) {
        String address = "https://raw.githubusercontent.com/LearnWebCode/json-example/master/pet-of-the-day.json";

        //give the job to the worker thread
        HTTPHandler.get(address);

        //Sync
        //IO.readHTTP("https://raw.githubusercontent.com/LearnWebCode/json-example/master/pet-of-the-day.json");

        System.out.println("Main is in control");

         //No Networking on the main Thread.

  /*      //inner class in method
        class A implements Runnable{
            @Override
            public void run() {
                //URL open connection
            }
        }
        new Thread(new A()).start();*/
        //anonymous inner class

        //Syntactic sugar:
        //the compiler generates an inner class inside a method for us.
        /*new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();*/

//
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
//
//        new Thread(run).start();
//        new Thread(run).start();
//        new Thread(run).start();
    }
}
