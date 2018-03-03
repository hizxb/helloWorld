package hello.b_xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class parseXml02 {

	public static void main(String[] args) {
		String xmlPath = "c:"+File.separator+"user2.xml";    
		try {  
	        //获取SAX分析器的工厂实例，专门负责创建SAXParser分析器  
	        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();  
	        //获取SAXParser分析器的实例  
	        SAXParser saxParser = saxParserFactory.newSAXParser();  
	           InputStream inputStream = new FileInputStream(new File(xmlPath));    
	          
	        //解析xml文档  
	        saxParser.parse(inputStream, new XmlSAXHandler02());  
	    } catch (ParserConfigurationException e) {  
	        e.printStackTrace();  
	    } catch (SAXException e) {  
	        e.printStackTrace();  
	    } catch (FileNotFoundException e) {  
	        e.printStackTrace();  
	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }  
	}
}
