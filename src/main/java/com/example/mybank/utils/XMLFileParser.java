package com.example.mybank.utils;

import org.springframework.web.multipart.MultipartFile;

import com.example.mybank.model.NalogZaPrenos;

public class XMLFileParser {

	public static NalogZaPrenos TransferOrder(MultipartFile file) {
		
		return SAXSchemaHandler.nalog;
	}

}
