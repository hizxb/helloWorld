package hello.b_xml;



import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlSAXHandler02 extends DefaultHandler {
	 @Override  
	    public void startDocument() throws SAXException {  
	        System.out.println("---->startDocument() is invoked...");  
	    }  
	      
	    @Override  
	    public void endDocument() throws SAXException {  
	        System.out.println("---->endDocument() is invoked...");  
	    }  
	   
	    @Override  
	    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {  
	        System.out.println("-------->startElement() is invoked...");  
	        System.out.println("uri的属性值：" + uri);  
	        System.out.println("localName的属性值：" + localName);  
	        System.out.println("qName的属性值：" + qName);  
	        if(attributes.getLength()>0){  
	            System.out.println("element属性值-->" + attributes.getQName(0) + "：" + attributes.getValue(0)); //根据下标获取属性name和value，也可以直接传递属性name获取属性值：attributes.getValue("id")  
	        }  
	    }  
	  
	    @Override  
	    public void endElement(String uri, String localName, String qName) throws SAXException {  
	        System.out.println("-------->endElement() is invoked...");  
	        System.out.println("uri的属性值：" + uri);  
	        System.out.println("localName的属性值：" + localName);  
	        System.out.println("qName的属性值：" + qName);  
	    }  
	      
	    @Override  
	    public void characters(char[] ch, int start, int length) throws SAXException {  
	        System.out.println("------------>characters() is invoked...");  
	        System.out.println("节点元素文本内容：" + new String(ch, start, length));  
	    }  
}
