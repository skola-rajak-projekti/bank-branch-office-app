package com.example.mybank.controller;

import org.springframework.core.io.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.mybank.model.NalogZaPrenos;
import com.example.mybank.service.StorageService;
import com.example.mybank.utils.*;

@RestController
@RequestMapping({"/api/transfer-order"})
public class TransferOrderController {

	@Autowired
	private StorageService storageService;	
	
	//rel path za nalog za prenos
	private String schemaPath = "data\\xsd\\nalogZaPrenos.xsd";
	private SAXSchemaHandler handler = new SAXSchemaHandler();

    @PostMapping
    public NalogZaPrenos getFileAsObject(@RequestParam("file") MultipartFile  file){
    	
    	storageService.store(file);    	

		handler.parse("upload-dir\\"+ file.getOriginalFilename(), schemaPath);
    	
        return XMLFileParser.TransferOrder(file); 
    }
    
    
    
    @GetMapping("/uploaded/{filename:.+}")    
    public Resource serveFile(@PathVariable String filename) {

      // file as a whole resource as it is
      Resource file = storageService.loadAsResource(filename);
      return file;
    }

}
