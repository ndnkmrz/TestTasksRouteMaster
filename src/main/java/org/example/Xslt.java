package org.example;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class Xslt {
    private String fileName;
    private Document xmlDocument;

    public Xslt(String fileName) {
        this.fileName = fileName;
    }

    public void ReadFile() throws IOException, ParserConfigurationException, SAXException {
        FileInputStream fis = new FileInputStream(fileName);
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        xmlDocument = builder.parse(fis);
    }

    public NodeList getNodeList(String expression) throws XPathExpressionException {
        XPath xPath = XPathFactory.newInstance().newXPath();
        return (NodeList) xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODESET);
    }
}
