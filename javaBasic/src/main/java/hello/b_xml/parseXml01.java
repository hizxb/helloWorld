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

public class parseXml01 {

	public static void main(String[] args) {
		String xmlPath = "c:"+File.separator+"user1.xml";    
        //String xmlName = xmlPath.substring(xmlPath.lastIndexOf("\\"));  
        try {  
            //获取SAX分析器的工厂实例，专门负责创建SAXParser分析器  
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();  
            //获取SAXParser分析器的实例  
            SAXParser saxParser = saxParserFactory.newSAXParser();  
            //和其他解析方式一样，也要间接通过InputStream输入流对象获取xml信息  
            //1、直接指定绝对路径获取文件输入流对象  
            //InputStream inputStream = new FileInputStream(xmlPath);  
            //2、使用类的相对路径查找xml路径  
            //InputStream inputStream = this.getClass().getResourceAsStream(xmlName);  
            //3、也可以指定路径完成InputStream输入流的实例化操作    
            InputStream inputStream = new FileInputStream(new File(xmlPath));    
            //4、使用InputSource输入源作为参数也可以转换xml    
            //InputSource inputSource = new InputSource(inputStream);  
              
            //解析xml文档  
            saxParser.parse(inputStream, new XmlSAXHandler01());//这里传递了自定义的XmlSAXHandler()管理者参数来解析xml,不像以前都是直接调用返回的Document对象  
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
