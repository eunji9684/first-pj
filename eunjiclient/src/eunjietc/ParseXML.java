package eunjietc;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ParseXML {
	 public static void main(String[] args) {
	        String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
	                "<response>" +
	                "<dataType>JSON</dataType>" +
	                "<items>" +
	                "<item>" +
	                "<baseDate>20230724</baseDate>" +
	                "<baseTime>0600</baseTime>" +
	                "<category>PTY</category>" +
	                "<nx>55</nx>" +
	                "<ny>127</ny>" +
	                "<obsrValue>0</obsrValue>" +
	                "</item>" +
	                "</items>" +
	                "</response>";

	        try {
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            Document doc = builder.parse(new ByteArrayInputStream(xmlData.getBytes()));

	            NodeList nodeList = doc.getElementsByTagName("item");
	            if (nodeList.getLength() > 0) {
	                Element item = (Element) nodeList.item(0);
	                String baseDate = item.getElementsByTagName("baseDate").item(0).getTextContent();
	                String baseTime = item.getElementsByTagName("baseTime").item(0).getTextContent();
	                String category = item.getElementsByTagName("category").item(0).getTextContent();
	                String nx = item.getElementsByTagName("nx").item(0).getTextContent();
	                String ny = item.getElementsByTagName("ny").item(0).getTextContent();
	                String obsrValue = item.getElementsByTagName("obsrValue").item(0).getTextContent();

	                System.out.println("baseDate: " + baseDate);
	                System.out.println("baseTime: " + baseTime);
	                System.out.println("category: " + category);
	                System.out.println("nx: " + nx);
	                System.out.println("ny: " + ny);
	                System.out.println("obsrValue: " + obsrValue);
	            } else {
	                System.out.println("No item found.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
