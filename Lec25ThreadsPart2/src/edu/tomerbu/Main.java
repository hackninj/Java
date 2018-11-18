package edu.tomerbu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.*;


public class Main {

    public static void main(String[] args) {
        //newScheduledThreadPool 10 players throwFromTwo
        //בהפרשים של דקה - יש לתת ל-10 שחקנים לזרוק


        //class עבור מתכון מטבח:
        //מצאו מתכון לפיצה ותנו למחשב להכין 10 במקביל



        ScheduledExecutorService shed = Executors.newScheduledThreadPool(1);

        Runnable r = () -> {
        };

        Callable<String> c = () -> {
            return "Hello";
        };
    }

    private static void fixedRate() {
        //SingleThreadPool vs new Thread?
        //FixedThreadPool fixed no of Threads;

        //let the os decide the number of threads:
        //More Threads will be initialized if needed. and then cached.
        //newCachedThreadPool
        ScheduledExecutorService sched = Executors.newScheduledThreadPool(1);

        sched.scheduleAtFixedRate(() -> {
            System.out.println("");
        }, 1, 1, TimeUnit.SECONDS);

        //sched.shutdown();
    }

    private static void schedule() {
        ScheduledExecutorService sched = Executors.newScheduledThreadPool(1);

        sched.schedule(() -> {
            System.out.println("Gone Fishing...");
        }, 10, TimeUnit.SECONDS);

        sched.shutdown();
    }

    private static void cached() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            System.out.println("Cached");
        });
        executorService.shutdown();
    }

    private static void fixedPool() {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);


        for (int i = 0; i < 4; i++) {


            threadPool.execute(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                    System.out.println(LocalDateTime.now() + " ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        threadPool.shutdown();
    }

    private static void singleExcecutor() {
        //new API For parallelism in java
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(() -> {
            System.out.println("Async");
        });

        executorService.shutdown();
    }

    private static void sync() {
        SheepHerd herd = new SheepHerd();
        for (int i = 0; i < 10; i++) {
            new Thread(() -> herd.addSheepFixed()).start();
        }
    }

    private static void dateFormatter() {
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");//hh:mm:ss
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatted = now.format(df);
        String formatted2 = now.format(df2);
        System.out.println(formatted);
        System.out.println(formatted2);
    }

    private static void modernDateTime() {
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(d);
        System.out.println(t);
        System.out.println(dateTime);
    }

    private static void calendar() {
        Calendar c = Calendar.getInstance();
        c.set(2018, Calendar.OCTOBER, 11);

        System.out.println(c.getTime());
    }

    private static void dateDemo() {
        // write your code here
        Date d = new Date();
        System.out.println(d);


        long epochTime = d.getTime();
        //18/11/2018


        System.out.println(epochTime);
//        Date date = new Date(2018, 11, 18, 17, 30);
//        System.out.println(date);
    }
}
