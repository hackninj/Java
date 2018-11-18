package edu.tomerbu;

public class CustomTimer {
    public static void  timer(Runnable r, long delay){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                //Thread.sleep -> The Current Thread will sleep
                try {
                    Thread.sleep(delay);
                    r.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //sleep for delay
        //run the work
        t.start();

//        //can't sleep
//        t.interrupt();
    }
}
