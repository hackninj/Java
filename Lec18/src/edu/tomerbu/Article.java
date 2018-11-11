package edu.tomerbu;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Article {
    private String title;
    private String excerpt;
    private String article;
    private String date;
    //ctor
    public Article(String title, String excerpt, String article, String date) {
        this.title = title;
        this.excerpt = excerpt;
        this.article = article;
        this.date = date;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getExcerpt() {
        return excerpt;
    }
    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }
    public String getArticle() {
        return article;
    }
    public void setArticle(String article) {
        this.article = article;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", excerpt='" + excerpt + '\'' +
                ", article='" + article + '\'' +
                ", date='" + date + '\'' +
                '}';
    }


    //Deserialization Ctor
    public Article(String json) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(json);
        this.title = (String)jsonObject.get("title");
        this.article = (String)jsonObject.get("article");
        this.date = (String)jsonObject.get("date");
        this.excerpt = (String)jsonObject.get("excerpt");
     }

    //factory method
    //JSON DeSerialization
    public static Article fromJson(String json) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(json);
        String title = (String)jsonObject.get("title");
        String article = (String)jsonObject.get("article");
        String date = (String)jsonObject.get("date");
        String excerpt = (String)jsonObject.get("excerpt");
        return new Article(title, excerpt, article, date);
    }

    //JSON Serialization
    public String toJson(){
        JSONObject o = new JSONObject();
        o.put("title", title);
        o.put("excerpt", excerpt);
        o.put("article", article);
        o.put("date", date);
        return o.toJSONString();
    }

}

