package com.goodtech.robotics;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: gail
 * Date: 9/15/13
 * Time: 2:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class XMLLoader {

    public static Document loadFile(String file)
    {


        try
        {

            File fXmlFile = new File(file);
            DocumentBuilderFactory dbFactory;
            dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            //read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            return doc;
//
//            NodeList nList = doc.getElementsByTagName("staff");
//
//            System.out.println("----------------------------");
//
//            for (int temp = 0; temp < nList.getLength(); temp++) {
//
//                Node nNode = nList.item(temp);
//
//                System.out.println("\nCurrent Element :" + nNode.getNodeName());
//
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//
//                    Element eElement = (Element) nNode;
//
//                    System.out.println("Staff id : " + eElement.getAttribute("id"));
//                    System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
//                    System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
//                    System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
//                    System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
//
//                }
//            }
        }

        catch(
                Exception e
                )

        {
            e.printStackTrace();
        }

        return null;
    }

}
