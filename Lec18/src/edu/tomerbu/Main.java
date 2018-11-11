package edu.tomerbu;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Article> lst = new ArrayList<>();
        lst.add(new Article("Boi Likes money", "", "", ""));
        lst.add(new Article("Dog kill Cat", "", "", ""));
        try {

            JSONArray arr = new JSONArray();
            JSONParser p = new JSONParser();

            for (Article article : lst) {
                //convert Article to JsonObject
                JSONObject aJson = (JSONObject) p.parse(article.toJson());
                //add Article To Array
                arr.add(aJson);
            }

            String all = arr.toJSONString();
            System.out.println(all);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static void readArticle() {
        try {
            String json = IO.readAll("A.json");
            Article a = new Article(json);
            Article aa = Article.fromJson(json);

            System.out.println(aa);
            System.out.println(a);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void readArticle1() {
        //Read from file
        try {
            List<String> lines = Files.readAllLines(Paths.get("A.json"));
            StringBuilder sb = new StringBuilder();

            for (String line : lines) {
                sb.append(line).append("\n");
            }
            String json = sb.toString();

            //Parse the json -> Java Object:
            JSONParser parser = new JSONParser();
            //Explicit Cast
            JSONObject result = (JSONObject) parser.parse(json);

            //implicit cast from int to double
            //double d = 10;
            String title = (String) result.get("title");
            String article = (String) result.get("article");
            String excerpt = (String) result.get("excerpt");
            String date = (String) result.get("date");
            Article a = new Article(title, excerpt, article, date);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void saveJsonArticle() {
        Article a = new Article("חדשות מרעישות", "אביב גפן בהופעה", "...", "10/10/2012");

        try (FileWriter writer = new FileWriter("A.json")) {
            writer.write(a.toJson());
        } catch (Exception ignored) {
        }
    }

    private static void toJsonDemo() {
        JSONObject programmer = new JSONObject();
        //firstname, lastname, age
        //list: C#, JAVA, Kotlin, JS

        programmer.put("firstName", "Josh");
        programmer.put("lastName", "Kadosh");
        programmer.put("age", "100");


        JSONArray langs = new JSONArray();
        langs.add("JAVA");
        langs.add("JS");
        langs.add("C#");
        langs.add("Kotlin");
        programmer.put("languages", langs);


        String json = programmer.toJSONString();
        System.out.println(json);
    }
}
