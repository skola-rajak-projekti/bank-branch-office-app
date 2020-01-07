package com.example.mybank.utils;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import com.example.mybank.model.NalogZaPrenos;


public class SAXSchemaHandler extends DefaultHandler {

	private static SAXParserFactory parserFactory;
	
	private static SchemaFactory schemaFactory;	
	
	public static NalogZaPrenos nalog = new NalogZaPrenos();
	
	/*
	 * Factory initialization static-block
	 */
	static {
		parserFactory = SAXParserFactory.newInstance();
		parserFactory.setNamespaceAware(true);		
		schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	}

	public void parse(String filePath, String schemaPath) {
		
		try {
			Schema schema = schemaFactory.newSchema(new File(schemaPath));
			parserFactory.setSchema(schema);
			
			SAXParser saxParser = parserFactory.newSAXParser();
			saxParser.parse(new File(filePath), this);
		
		} catch (SAXParseException e) {
			
			System.out.println("[ERROR] Parsing error, line: " + e.getLineNumber() + ", uri: " + e.getSystemId());
			System.out.println("[ERROR] " + e.getMessage() );
			System.out.print("[ERROR] Embedded exception: ");
			
			Exception embeddedException = e;
			if (e.getException() != null)
				embeddedException = e.getException();

			// Print stack trace...
			embeddedException.printStackTrace();
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private String getLocalName(String unqualifiedName, String qualifiedName) {
		return "".equals(unqualifiedName) ? qualifiedName : unqualifiedName;
	}
	

	@Override
	public void startDocument() throws SAXException {
		
		System.out.println("START_DOCUMENT");
	}

	@Override
	public void endDocument() throws SAXException {

		System.out.println("END_DOCUMENT");
	}
	
	@Override
	public void startElement(String uri, String uName, String qName, Attributes attributes) throws SAXException {		
		
		
		// parsiranje nalog za prenos - dokuemta
		if (attributes.getLength() > 0) {
			
			nalog.setDuznik(attributes.getValue("duznik"));
			nalog.setPoverilac(attributes.getValue("poverilac"));
			nalog.setId(Integer.parseInt(attributes.getValue("id_poruke")));
			nalog.setIznos(Float.parseFloat(attributes.getValue("iznos")));			
			nalog.setRacunDuznika(attributes.getValue("racun_duznika"));
			nalog.setRacunPoverioca(attributes.getValue("racun_poverioca"));
			nalog.setSvrhaPlacanja(attributes.getValue("svrha_placanja"));
			nalog.setValuta(attributes.getValue("valuta"));
			
		}
	}

	@Override
	public void endElement(String uri, String uName, String qName) throws SAXException {
		
		System.out.println("END_ELEMENT: " + getLocalName(uName, qName));
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		String characters = new String(ch, start, length).trim();
		
		if (characters.length() > 0)
			System.out.println("CHARACTERS: " + new String(ch, start, length));
	}

	/*
	 * Exception handling
	 */

	@Override
	public void error(SAXParseException err) throws SAXParseException {

		// Propagate the exception
		throw err;
	}

	@Override
    public void warning(SAXParseException err) throws SAXParseException {
        
    	System.out.println("[WARN] Warning, line: " + err.getLineNumber() + ", uri: " + err.getSystemId());
        System.out.println("[WARN] " + err.getMessage());
    }

	public static void main(String[] args) {
		
		String filePath = null;
		String schemaPath = null;
		
		System.out.println("[INFO] SAX Parser");
		
		if (args.length != 1) {
			
			
			// Primer sa XML šemom
			filePath = "data/xml/licna_karta.xml";
			schemaPath = "data/xsd/licna_karta.xsd";
			
			System.out.println("[INFO] No input file, using default \""	+ filePath + "\"");
			
		} else {
			filePath = args[0];
			schemaPath = args[1];
		}
		
		SAXSchemaHandler handler = new SAXSchemaHandler();
		handler.parse(filePath, schemaPath);
		
	}
}
