package edu.tomerbu;

public class Cow implements Runnable {
    private final String name;
    public Cow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
            System.out.printf("Mooo %s\n", name);
        }
    }
}
