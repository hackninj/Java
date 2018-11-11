package edu.tomerbu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class IO {
    private static Scanner s = new Scanner(System.in);
    //Java Docs: הערת תיעוד

    /**
     * input an int with java.util.Scanner
     *
     * @param prompt text that is shown to the user when we request input.
     * @return an int from the Scanner
     */
    public static int nextInt(String prompt) {
        //flag:
        boolean valid = false;
        int x = 0;

        //כל עוד הקלט לא תקין
        while (!valid) {
            //בצע קלט נוסף
            System.out.println(prompt);
            try {
                x = s.nextInt();//ctrl+alt+t(surround with try/catch)
                //if we got thus far... the input is valid
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Try again...");
                //s.next();//
            }

        }
        //get rid of extra "\n"
        s.nextLine();
        return x;
    }


    /**
     * input a double with java.util.Scanner
     *
     * @param prompt text that is shown to the user when we request input.
     * @return a double from the Scanner
     */
    public static double nextDouble(String prompt) {
        System.out.println(prompt);
        double x = s.nextDouble();
        //get rid of extra "\n"
        s.nextLine();
        return x;
    }

    //overloading
    public static int nextInt(String prompt, int from, int to) {
        int x = nextInt(prompt);

        while (x < from || x > to) {
            System.out.println("not in range: " + from + " - " + to);
            x = nextInt(prompt);
        }

        return x;
    }


    //Java Docs: הערת תיעוד

    /**
     * input a String with java.util.Scanner
     *
     * @param prompt text that is shown to the user when we request input.
     * @return a String from the Scanner
     */
    public static String next(String prompt) {
        System.out.println(prompt);
        String x = s.next();

        return x;
    }

    /**
     * input a Line with java.util.Scanner
     *
     * @param prompt text that is shown to the user when we request input.
     * @return a Line from the Scanner
     */
    public static String nextLine(String prompt) {
        System.out.println(prompt);
        String x = s.nextLine();

        return x;
    }


    /**
     * Writes the data to a given file name
     * And Closes the file.
     *
     * @param fileName - The file name including extension (ex: 1.txt)
     * @param data     - The Character data to write
     * @throws IOException
     */
    public static void write(String fileName, String data) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(data);
        }
    }

    /**
     * Writes the data to a given file name AND a new Line separator
     *
     * @param fileName - The file name including extension (ex: 1.txt)
     * @param data     - The Character data to write
     * @throws IOException
     */
    public static void writeln(String fileName, String data) throws IOException {
        write(fileName, data + "\n");
    }

    /**
     * Writes the data to a given file name
     * And Closes the file.
     *
     * @param fileName - The file name including extension (ex: 1.txt)
     * @param data     - The Character data to write
     * @throws IOException
     */
    public static void writeln(String fileName, List<String> data) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String datum : data) {
                writer.write(datum);
                writer.write("\n");
            }
        }
    }

    public static List<String> readLines(String fileName) throws IOException {
        File f = new File(fileName);

        Path path = f.toPath();

        return Files.readAllLines(path);
    }


    public static String readAll(String fileName) throws IOException {
        List<String> lines = readLines(fileName);
        StringBuilder sb = new StringBuilder(); //contcat Strings efficiently

        for (String line : lines) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    public static void delete(String fileName){
        //File Describes the path
        File f = new File(fileName);
        f.delete();
    }

}