package hello.b_xml;

import java.util.jar.Attributes;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XmlSAXHandler01 extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		System.out.println("---->startDocument() is invoked...");
		super.startDocument();
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("---->endDocument() is invoked...");
		super.endDocument();
	}

	public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes)
			throws SAXException {
		System.out.println("-------->startElement() is invoked...");
		super.startElement(uri, localName, qName, attributes);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("-------->endElement() is invoked...");
		super.endElement(uri, localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println("------------>characters() is invoked...");
		super.characters(ch, start, length);
	}

}
