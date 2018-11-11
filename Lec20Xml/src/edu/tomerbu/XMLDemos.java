package edu.tomerbu;

import javax.xml.namespace.QName;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;

public class XMLDemos {

    public static void readXML() throws FileNotFoundException, XMLStreamException {
        XMLEventReader eventReader = IO.getXmlEventReader("1.xml");
        Person p = null; //scope
        while (eventReader.hasNext()) {
            XMLEvent xmlEvent = eventReader.nextEvent();

            switch (xmlEvent.getEventType()) {
                case XMLEvent.START_ELEMENT:
                    switch (xmlEvent.asStartElement().getName().getLocalPart()) {
                        case "Person":
                            p = new Person();
                            String age = xmlEvent.asStartElement().getAttributeByName(QName.valueOf("age")).getValue();
                            p.setAge(Integer.parseInt(age));
                            break;
                        case "firstName":
                            String data = eventReader.nextEvent().asCharacters().getData().trim();
                            p.setFirstName(data);
                            break;
                        case "lastName":
                            p.setLastName(eventReader.nextEvent().asCharacters().getData().trim());
                            break;
                    }
                    break;
                case XMLEvent.END_ELEMENT:
                    if (xmlEvent.asEndElement().getName().getLocalPart().equals("Person")) {
                        System.out.println(p);
                        p = null;
                    }
                    break;
            }
        }

    }

    private static void writeXml() {
        try {
            XMLEventWriter eventWriter = IO.getXmlEventWriter("1.xml");
            //writer writes events to output streams
            //Event StartDocument, startElement, Characters

            XMLEventFactory eventFactory = XMLEventFactory.newFactory();
            //Line Sep And Tab
            Characters lineSeparator = eventFactory.createCharacters("\n");
            Characters tab = eventFactory.createCharacters("\t");

            StartDocument startDocument = eventFactory.createStartDocument();
            eventWriter.add(startDocument);

            eventWriter.add(lineSeparator);

            eventWriter.add(eventFactory.createStartElement("", "", "Person"));
            //age attribute:
            eventWriter.add(eventFactory.createAttribute("age", "11"));
            eventWriter.add(lineSeparator);

            createTag(eventWriter, eventFactory, "firstName", "Moshe");
            createTag(eventWriter, eventFactory, "lastName", "Doe");
            eventWriter.add(eventFactory.createEndElement("", "", "Person"));
            eventWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private static void createTag(XMLEventWriter eventWriter, XMLEventFactory eventFactory, String tagName, String content) throws XMLStreamException {
        //Line Sep And Tab
        Characters lineSeparator = eventFactory.createCharacters("\n");
        Characters tab = eventFactory.createCharacters("\t");

        //<tagName>
        StartElement startElement = eventFactory.createStartElement("", "", tagName);
        eventWriter.add(startElement);
        eventWriter.add(lineSeparator);

        //characters:
        eventWriter.add(tab);
        eventWriter.add(eventFactory.createCharacters(content));
        eventWriter.add(lineSeparator);
        //</tagName>
        eventWriter.add(eventFactory.createEndElement("", "", tagName));
        eventWriter.add(lineSeparator);
    }
}
