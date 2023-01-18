package org.example;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

//  1. Как получить все коробки, которые не имеют storedIn reference?
//  2. Получить id всех зеленых коробок в виде списка через запятую

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        Xslt xslt = new Xslt("C:\\Users\\nmoroz\\Documents\\TestTasks\\TestTasks\\xslt\\boxes.xml");
        xslt.ReadFile();
        xslt.getNodeList("/objects/object[1]");
        xslt.getNodeList("/objects/object[property='green']/@id");
        //xslt.getNodeList("/objects/object[property='green']/string-join(@id, ', ')");

        System.out.println("Hi");
    }
}