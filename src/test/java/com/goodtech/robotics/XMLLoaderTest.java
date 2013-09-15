package com.goodtech.robotics;

import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.assertTrue;

/**
 * Test the XML file loader
 */
public class XMLLoaderTest {

    @Test
    public void testLoadFile() throws Exception {

        Document document = XMLLoader.loadFile("src/main/resources/Plantoid.xml");
        assertTrue(document.getDocumentElement().getNodeName().equals("robot"));

    }
}
