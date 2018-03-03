package hello.c_xmlToJava;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlSAXHandler03 extends DefaultHandler{
	   @Override  
	    public void startDocument() throws SAXException {  
	        SAXOperateXmlDemo.nodeList = new ArrayList<Node>();  
	    }  
	      
	    @Override  
	    public void endDocument() throws SAXException {  
	          
	    }  
	      
	    @Override  
	    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {  
	        SAXOperateXmlDemo.node = new Node();  
	        SAXOperateXmlDemo.node.setId(null);  
	        SAXOperateXmlDemo.node.setName(qName);  
	        //封装当前节点的属性  
	        List<Attribute> attributeList = new ArrayList<Attribute>();  
	        if(attributes.getLength()>0){  
	            for (int i = 0; i < attributes.getLength(); i++) {  
	                Attribute attribute = new Attribute();  
	                attribute.setName(attributes.getQName(i));  
	                attribute.setValue(attributes.getValue(i));  
	                attributeList.add(attribute);  
	            }  
	        }  
	        SAXOperateXmlDemo.node.setAttributeList(attributeList);  
	    }  
	    
	  
	    @Override  
	    public void endElement(String uri, String localName, String qName) throws SAXException {  
	          
	    }  
	      
	    @Override  
	    public void characters(char[] ch, int start, int length) throws SAXException {  
	        if(SAXOperateXmlDemo.node != null){  
	            SAXOperateXmlDemo.node.setText(new String(ch, start, length));  
	            //因为startElement()在characters()的前面调用，所以必须放在后面才能把文本添加进去  
	            SAXOperateXmlDemo.nodeList.add(SAXOperateXmlDemo.node);  
	            SAXOperateXmlDemo.node = null;  
	            //在这里之所以重新置为null是在解析标签的时候节点与节点之间的回车符、Tab符或者空格以及普通文本等等这些字符串也算一个节点  
	            //如果不这样，那么解析的时候会把之前添加成功的节点内的文本给替换掉。  
	        }  
	    }  
	}  
