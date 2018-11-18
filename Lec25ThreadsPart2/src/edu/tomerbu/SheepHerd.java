package edu.tomerbu;

public class SheepHerd {
    private int sheepCount = 0;

    //Not Thread Safe
    public void addSheep() {
        try {
            Thread.sleep(1000);
            System.out.print(++sheepCount + " ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Thread Safe
    public synchronized void addSheepFixed() {
        try {
            Thread.sleep(1000);
            System.out.print(++sheepCount + " ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static Object lock = new Object();


    //DEAD LOCK:



    public static int doALotOfWork() {

        //only the block is synchronized:
        synchronized (lock) {
            System.out.println("I'm Alone here...!");
        }

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Interrupted");
            System.out.println("Release Resources");
        }

        return 10;
    }


}
