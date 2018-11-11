package edu.tomerbu;


import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        try {
            XMLDemos.readXML();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }


}
